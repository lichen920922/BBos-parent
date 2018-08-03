package com.lee.dao.base;

import com.lee.utils.PageBean;
import org.hibernate.criterion.DetachedCriteria;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao<T> {
    void save(T entity);

    void delete(T entity);

    void update(T entity);

    T findById(Serializable id);

    List<T> findAll();

    void executeUpdate(String queryName, Object... objects);

    void pageQuery(PageBean pageBean);

    void saveOrUpdate(T entity);

    List<T> findByCriteria(DetachedCriteria detachedCriteria);
}
