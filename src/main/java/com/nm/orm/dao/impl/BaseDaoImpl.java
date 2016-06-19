package com.nm.orm.dao.impl;

import com.nm.orm.common.DaoConstants;
import com.nm.orm.dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Collection;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年05月26日上午17:38] 创建方法 by hw
 */
public abstract class BaseDaoImpl<T, U extends Serializable>
        implements BaseDao<T, U> {

    @Autowired
    protected SessionFactory sessionFactory;

    Class<T> entityClass;

    String tableName;

//    public BaseDaoImpl(Class<T> entityClass) {
//        this.entityClass = entityClass;
//        this.tableName = entityClass.getSimpleName();
//    }

    public U insert(T o) {
        return (U) this.getCurrentSession().save(o);
    }

    public void saveOrUpdate(T o) {
        try {
            this.getCurrentSession().saveOrUpdate(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert(Collection<T> objs) {
        int i = 0;
        Session session = getCurrentSession();
        for (T t : objs) {
            session.save(t);
            i++;
            if (i % DaoConstants.BATCH_SIZE == 0) {
                session.flush();
                session.clear();
            }
        }
    }

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public T findById(U id) {
        return (T) getCurrentSession().get(this.entityClass, id);
    }

    public void delete(T obj) {
        getCurrentSession().delete(obj);
    }

    public int deleteAll(T t) {
        String hql = String.format("delete from %s", tableName);
        return exexuteHqlUpdate(hql);
    }

    public int deleteById(U id) {
        return this.deleteByIdHql(id);
    }

    /////////////////////////// private method
    /////////////////////////// //////////////////////////////////////

    public int deleteByIdHql(U u) {
        StringBuffer hqlBuffer = new StringBuffer(" delete from ");
        hqlBuffer.append(tableName).append(" where id = :id");
        Query query = this.getCurrentSession()
                .createQuery(hqlBuffer.toString());
        query.setParameter("id", u);
        return query.executeUpdate();
    }

    public int exexuteHqlUpdate(String hql) {
        return this.getCurrentSession().createQuery(hql).executeUpdate();
    }

    protected SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected void setEntityClass(Class<T> entityClass) {
        this.entityClass = entityClass;
    }
}
