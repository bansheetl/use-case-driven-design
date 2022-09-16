package com.devonfw.ddd.loanapp.scoring.domain.repo;

import com.devonfw.ddd.loanapp.scoring.domain.model.Applicant;
import com.devonfw.ddd.loanapp.scoring.domain.model.Application;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;

@ApplicationScoped
public class ApplicationRepository {

    @Inject
    private EntityManager entityManager;

    public void save(Application application) {
        entityManager.persist(application);
    }

    public Application findById(String applicationNumber) {
        return entityManager.find(Application.class, applicationNumber);
    }

    public Application findByPerson(String firstName, String lastName, String postCode, String street) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Application> query = builder.createQuery(Application.class);
        Root<Application> root = query.from(Application.class);
        Join<Application, Applicant> applicantRoot = root.join("applicant");
        Join<Object, Object> scoringResultRoot = root.join("scoringResult");
        query.where(builder.and(
                builder.equal(applicantRoot.get("firstName"), firstName),
                builder.equal(applicantRoot.get("lastName"), lastName),
                builder.equal(applicantRoot.get("postCode"), postCode),
                builder.equal(applicantRoot.get("street"), street),
                builder.isNotNull(scoringResultRoot.get("scoringPoints"))
        ));
        List<Application> result = entityManager.createQuery(query).getResultList();
        if (result.size() > 1) {
            throw new IllegalStateException("An applicant should have only one application being scored at once");
        } else if (result.size() == 0) {
            throw new ApplicationNotFoundException(firstName, lastName, postCode, street);
        } else {
            return result.get(0);
        }
    }
}
