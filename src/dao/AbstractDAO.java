package dao;

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
        Session currentSession = sessionFactory.getCurrentSession();
        return currentSession;
    }

    protected Criteria criteria() {
        currentSession().beginTransaction();
        Criteria criteria = currentSession().createCriteria(entityClass);
        currentSession().getTransaction().commit();
        return criteria;
    }

    protected CriteriaQuery<E> criteriaQuery() {
        currentSession().beginTransaction();
        CriteriaQuery<E> query = this.currentSession().getCriteriaBuilder().createQuery(getEntityClass());
        currentSession().getTransaction().commit();
        return query;
    }

    protected Query namedQuery(String queryName) throws HibernateException {
        currentSession().beginTransaction();
        Query namedQuery = currentSession().getNamedQuery(requireNonNull(queryName));
        currentSession().getTransaction().commit();
        return namedQuery;
    }

    @SuppressWarnings("unchecked")
    public Class<E> getEntityClass() {
        return (Class<E>) entityClass;
    }

    protected E uniqueResult(CriteriaQuery<E> criteriaQuery) throws HibernateException {
        currentSession().beginTransaction();
        E e = AbstractProducedQuery.uniqueElement(
                currentSession()
                        .createQuery(requireNonNull(criteriaQuery))
                        .getResultList()
        );
        currentSession().getTransaction().commit();
        return e;
    }

    @SuppressWarnings("unchecked")
    protected E uniqueResult(Criteria criteria) throws HibernateException {
        currentSession().beginTransaction();
        E e = (E) requireNonNull(criteria).uniqueResult();
        currentSession().getTransaction().commit();
        return e;
    }

    protected E uniqueResult(Query<E> query) throws HibernateException {
        currentSession().beginTransaction();
        E e = requireNonNull(query).uniqueResult();
        currentSession().getTransaction().commit();
        return e;
    }

    @SuppressWarnings("unchecked")
    protected List<E> list(Criteria criteria) throws HibernateException {
        currentSession().beginTransaction();
        List list = requireNonNull(criteria).list();
        currentSession().getTransaction().commit();
        return list;
    }

    protected List<E> list(CriteriaQuery<E> criteria) throws HibernateException {
        currentSession().beginTransaction();
        List<E> resultList = currentSession().createQuery(requireNonNull(criteria)).getResultList();
        currentSession().getTransaction().commit();
        return resultList;
    }

    protected List list(Class<E> critClass) throws HibernateException {
        currentSession().beginTransaction();
        List list = currentSession().createCriteria(critClass).list();
        currentSession().getTransaction().commit();
        return list;
    }

    protected List<E> list(Query<E> query) throws HibernateException {
        return requireNonNull(query).list();
    }

    @SuppressWarnings("unchecked")
    protected E get(Serializable id) {
        currentSession().beginTransaction();
        E e = (E) currentSession().get(entityClass, requireNonNull(id));
        currentSession().getTransaction().commit();
        return e;
    }

    protected void remove() {
        currentSession().beginTransaction();
        currentSession().remove(entityClass);
        currentSession().getTransaction().commit();
    }

    protected E persist(E entity) throws HibernateException {
        currentSession().beginTransaction();
        currentSession().saveOrUpdate(requireNonNull(entity));
        currentSession().getTransaction().commit();
        return entity;
    }

    protected <T> T initialize(T proxy) throws HibernateException {
        if (!Hibernate.isInitialized(proxy)) {
            Hibernate.initialize(proxy);
        }
        return proxy;
    }

    public List listAllOrdered(String query) {
        currentSession().beginTransaction();
        List list = currentSession().createQuery(query).list();
        currentSession().getTransaction().commit();
        return list;
    }
}
