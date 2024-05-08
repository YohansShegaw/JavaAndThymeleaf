package com.bannershallmark.service;

import java.util.List;

import com.bannershallmark.entity.BehavioralResultsDetailTemp;

public interface BehavioralResultsDetailTempService {

	List<BehavioralResultsDetailTemp> FindBehavioralResultsByYearAndRole(int year1, int role1);

	List<BehavioralResultsDetailTemp> FindBehavioralResultsByYear(int year1);

	List<BehavioralResultsDetailTemp> FindBehavioralResultsByRole(int role1);

	List<BehavioralResultsDetailTemp> FindAllBehavioralResults();

}
