package com.bannershallmark.dao;

import java.util.List;

import com.bannershallmark.entity.BuisnessResultsDetailTemp;

public interface BuisnessResultsDetailTempDao {

	List<BuisnessResultsDetailTemp> FindByYearAndRole(int year, int role);

	List<BuisnessResultsDetailTemp> FindByYear(int year);

	List<BuisnessResultsDetailTemp> FindByRole(int role);

	List<BuisnessResultsDetailTemp> FindAll();

}
