package com.bannershallmark.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bannershallmark.dao.BehavioralResultsDetailTempDao;
import com.bannershallmark.entity.BehavioralResultsDetailTemp;

@Repository
public class BehavioralResultsDetailTempDaoImp implements BehavioralResultsDetailTempDao{

	 @Autowired
	 private SessionFactory sessionFactory;
	
	@Override
	public List<BehavioralResultsDetailTemp> FindByYearAndRole(int year, int role) {
		Session session=sessionFactory.getCurrentSession();
		Query<BehavioralResultsDetailTemp> query=session.createQuery("from BehavioralResultsDetailTemp WHERE year=:year AND role=:role", BehavioralResultsDetailTemp.class);
		query.setParameter("year", year);
		query.setParameter("role", role);
		return query.getResultList();
	}

	@Override
	public List<BehavioralResultsDetailTemp> FindByYear(int year) {
		Session session=sessionFactory.getCurrentSession();
		Query<BehavioralResultsDetailTemp> query=session.createQuery("from BehavioralResultsDetailTemp WHERE year=:year", BehavioralResultsDetailTemp.class);
		query.setParameter("year", year);
		return query.getResultList();
	}

	@Override
	public List<BehavioralResultsDetailTemp> FindByRole(int role) {
		Session session=sessionFactory.getCurrentSession();
		Query<BehavioralResultsDetailTemp> query=session.createQuery("from BehavioralResultsDetailTemp WHERE role=:role", BehavioralResultsDetailTemp.class);
		query.setParameter("role", role);
		return query.getResultList();
	}

	@Override
	public List<BehavioralResultsDetailTemp> FindAll() {
		Session session=sessionFactory.getCurrentSession();
		Query<BehavioralResultsDetailTemp> query=session.createQuery("from BehavioralResultsDetailTemp", BehavioralResultsDetailTemp.class);
		return query.getResultList();
	}

}
