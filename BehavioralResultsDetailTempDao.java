package com.bannershallmark.dao;

import java.util.List;

import com.bannershallmark.entity.BehavioralResultsDetailTemp;

public interface BehavioralResultsDetailTempDao {

	List<BehavioralResultsDetailTemp> FindByYearAndRole(int year, int role);

	List<BehavioralResultsDetailTemp> FindByYear(int year);

	List<BehavioralResultsDetailTemp> FindByRole(int role);

	List<BehavioralResultsDetailTemp> FindAll();

}
