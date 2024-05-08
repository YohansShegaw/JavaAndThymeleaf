package com.bannershallmark.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bannershallmark.dao.BehavioralResultsDetailTempDao;
import com.bannershallmark.entity.BehavioralResultsDetailTemp;
import com.bannershallmark.service.BehavioralResultsDetailTempService;

@Service
public class BehavioralResultsDetailTempServiceImp implements BehavioralResultsDetailTempService{

	@Autowired
	private BehavioralResultsDetailTempDao behavioralResultsDetailTempDao;
	
	@Override
	@Transactional
	public List<BehavioralResultsDetailTemp> FindBehavioralResultsByYearAndRole(int year, int role) {
		return behavioralResultsDetailTempDao.FindByYearAndRole(year,role);
	}

	@Override
	@Transactional
	public List<BehavioralResultsDetailTemp> FindBehavioralResultsByYear(int year) {
		return behavioralResultsDetailTempDao.FindByYear(year);
	}

	@Override
	@Transactional
	public List<BehavioralResultsDetailTemp> FindBehavioralResultsByRole(int role) {
		return behavioralResultsDetailTempDao.FindByRole(role);
	}

	@Override
	@Transactional
	public List<BehavioralResultsDetailTemp> FindAllBehavioralResults() {
		return behavioralResultsDetailTempDao.FindAll();
	}

}
