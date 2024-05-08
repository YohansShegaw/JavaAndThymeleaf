package com.bannershallmark.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bannershallmark.dao.BuisnessResultsDetailTempDao;
import com.bannershallmark.entity.BuisnessResultsDetailTemp;

@Repository
public class BuisnessResultsDetailTempDaoImp implements BuisnessResultsDetailTempDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<BuisnessResultsDetailTemp> FindByYearAndRole(int year, int role) {
		Session session = sessionFactory.getCurrentSession();
		Query<BuisnessResultsDetailTemp> query = session.createQuery(
				"from BuisnessResultsDetailTemp WHERE year=:year AND role=:role", BuisnessResultsDetailTemp.class);
		query.setParameter("year", year);
		query.setParameter("role", role);
		return query.getResultList();
	}

	@Override
	public List<BuisnessResultsDetailTemp> FindByYear(int year) {
		Session session = sessionFactory.getCurrentSession();
		Query<BuisnessResultsDetailTemp> query = session.createQuery("from BuisnessResultsDetailTemp WHERE year=:year",
				BuisnessResultsDetailTemp.class);
		query.setParameter("year", year);
		return query.getResultList();
	}

	@Override
	public List<BuisnessResultsDetailTemp> FindByRole(int role) {
		Session session = sessionFactory.getCurrentSession();
		Query<BuisnessResultsDetailTemp> query = session.createQuery("from BuisnessResultsDetailTemp WHERE role=:role",
				BuisnessResultsDetailTemp.class);
		query.setParameter("role", role);
		return query.getResultList();
	}

	@Override
	public List<BuisnessResultsDetailTemp> FindAll() {
		Session session = sessionFactory.getCurrentSession();
		Query<BuisnessResultsDetailTemp> query = session.createQuery("from BuisnessResultsDetailTemp",
				BuisnessResultsDetailTemp.class);
		return query.getResultList();
	}

}
