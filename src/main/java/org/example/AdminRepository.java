package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class AdminRepository {
    private EntityManagerFactory factory;
    private EntityManager entityManager;

    public AdminRepository() {
        this.factory = Persistence.createEntityManagerFactory("persist");
        this.entityManager = factory.createEntityManager();
    }

    public Admin findById(Long id) {
        return entityManager.find(Admin.class, id);
    }
}
