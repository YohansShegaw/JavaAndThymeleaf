package com.bannershallmark.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bannershallmark.dao.BuisnessResultsDetailTempDao;
import com.bannershallmark.entity.BuisnessResultsDetailTemp;
import com.bannershallmark.service.BuisnessResultsDetailTempService;

@Service
public class BuisnessResultsDetailTempServiceImp implements BuisnessResultsDetailTempService{

	@Autowired
	private BuisnessResultsDetailTempDao buisnessResultsDetailTempDao;
	
	@Override
	@Transactional
	public List<BuisnessResultsDetailTemp> FindBuisnessResultsByYearAndRole(int year, int role) {
		return buisnessResultsDetailTempDao.FindByYearAndRole(year,role);
	}

	@Override
	@Transactional
	public List<BuisnessResultsDetailTemp> FindBuisnessResultsByYear(int year) {
		return buisnessResultsDetailTempDao.FindByYear(year);
	}

	@Override
	@Transactional
	public List<BuisnessResultsDetailTemp> FindBuisnessResultsByRole(int role) {
		return buisnessResultsDetailTempDao.FindByRole(role);
	}

	@Override
	@Transactional
	public List<BuisnessResultsDetailTemp> FindAllBuisnessResults() {
		return buisnessResultsDetailTempDao.FindAll();
	}

}
