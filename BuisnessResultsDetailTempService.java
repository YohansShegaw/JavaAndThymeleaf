package com.bannershallmark.service;

import java.util.List;

import com.bannershallmark.entity.BuisnessResultsDetailTemp;

public interface BuisnessResultsDetailTempService {

	List<BuisnessResultsDetailTemp> FindBuisnessResultsByYearAndRole(int year1, int role1);

	List<BuisnessResultsDetailTemp> FindBuisnessResultsByYear(int year1);

	List<BuisnessResultsDetailTemp> FindBuisnessResultsByRole(int role1);

	List<BuisnessResultsDetailTemp> FindAllBuisnessResults();

}
