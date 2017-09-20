package com.project.common.abstracts;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public abstract class BaseJpaAbstract<T> {

    @PersistenceContext
    private EntityManager em;

    public List<T> getAll() {
        return em.createQuery("from " + getEntityClass().getName()).getResultList();
    }

    public T getById(Long id) {
        return (T) em.find(getEntityClass(), id);
    }

    public void create(T object) {
        em.persist(object);
    }

    public void update(T object) {
        em.merge(object);
    }

    public void delete(T object) {
        em.remove(object);
    }

    public abstract Class getEntityClass();

}
