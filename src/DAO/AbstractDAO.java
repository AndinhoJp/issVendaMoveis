package DAO;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.hibernate.query.internal.AbstractProducedQuery;

import javax.persistence.criteria.CriteriaQuery;

import java.io.Serializable;
import java.util.List;

import static java.util.Objects.requireNonNull;

public class AbstractDAO<E> {

    private final SessionFactory sessionFactory;
    private final Class<?> entityClass;

    public AbstractDAO(SessionFactory sessionFactory, Class<?> abstractDAO) {
        this.sessionFactory = sessionFactory;
        this.entityClass = abstractDAO;
    }

    protected Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    protected Criteria criteria() {
        return currentSession().createCriteria(entityClass);
    }

    protected CriteriaQuery<E> criteriaQuery() {
        return this.currentSession().getCriteriaBuilder().createQuery(getEntityClass());
    }

    protected Query namedQuery(String queryName) throws HibernateException {
        return currentSession().getNamedQuery(requireNonNull(queryName));
    }

    @SuppressWarnings("unchecked")
    public Class<E> getEntityClass() {
        return (Class<E>) entityClass;
    }

    protected E uniqueResult(CriteriaQuery<E> criteriaQuery) throws HibernateException {
        return AbstractProducedQuery.uniqueElement(
                currentSession()
                        .createQuery(requireNonNull(criteriaQuery))
                        .getResultList()
        );
    }

    @SuppressWarnings("unchecked")
    protected E uniqueResult(Criteria criteria) throws HibernateException {
        return (E) requireNonNull(criteria).uniqueResult();
    }

    protected E uniqueResult(Query<E> query) throws HibernateException {
        return requireNonNull(query).uniqueResult();
    }

    @SuppressWarnings("unchecked")
    protected List<E> list(Criteria criteria) throws HibernateException {
        return requireNonNull(criteria).list();
    }

    protected List<E> list(CriteriaQuery<E> criteria) throws HibernateException {
        return currentSession().createQuery(requireNonNull(criteria)).getResultList();
    }

    protected List<E> list(Query<E> query) throws HibernateException {
        return requireNonNull(query).list();
    }

    @SuppressWarnings("unchecked")
    protected E get(Serializable id) {
        return (E) currentSession().get(entityClass, requireNonNull(id));
    }

    protected void remove() {
        currentSession().remove(entityClass);
    }

    protected E persist(E entity) throws HibernateException {
        currentSession().saveOrUpdate(requireNonNull(entity));
        return entity;
    }

    protected <T> T initialize(T proxy) throws HibernateException {
        if (!Hibernate.isInitialized(proxy)) {
            Hibernate.initialize(proxy);
        }
        return proxy;
    }

}
