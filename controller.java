package com.bannershallmark.controller;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bannershallmark.entity.BehavioralResultsDetailTemp;
import com.bannershallmark.entity.BuisnessResultsDetailTemp;
import com.bannershallmark.entity.reviewResultsTotalTemp;
import com.bannershallmark.service.BehavioralResultsDetailTempService;
import com.bannershallmark.service.BuisnessResultsDetailTempService;
import com.bannershallmark.service.ReviewResultsTotalTempService;

@Controller
public class BehaviouralAndBusinessController {

	@Autowired
	private BehavioralResultsDetailTempService behavioralResultsDetailTempService;
	@Autowired
	private BuisnessResultsDetailTempService buisnessResultsDetailTempService;
	@Autowired
	private ReviewResultsTotalTempService reviewResultsTotalTempService;

	@GetMapping("/pivot")
	public String BehaviouralAndBusinesList(@RequestParam(value = "year", required = false) String year,
			@RequestParam(value = "role", required = false) String role, Model model) {
		
		int year1 = LocalDate.now().getYear() -1;
		
		int role1 = 1;
		List<BuisnessResultsDetailTemp> buisnessResultList;
		List<BehavioralResultsDetailTemp> behavioralResultList;
		List<reviewResultsTotalTemp> reviewResultsTotalList;
		if (year != null && year != "") {
			year1 = Integer.parseInt(year);
		}
		if (role != null && role != "") {
			role1 = Integer.parseInt(role);
		}

		if (year1 != 0 && role1 != 0) {
			behavioralResultList = behavioralResultsDetailTempService.FindBehavioralResultsByYearAndRole(year1, role1);
			buisnessResultList = buisnessResultsDetailTempService.FindBuisnessResultsByYearAndRole(year1, role1);
			reviewResultsTotalList = reviewResultsTotalTempService.FindByYearAndRole(year1,role1);
		} else if (year1 != 0 && role1 == 0) {
			behavioralResultList = behavioralResultsDetailTempService.FindBehavioralResultsByYear(year1);
			buisnessResultList = buisnessResultsDetailTempService.FindBuisnessResultsByYear(year1);
			reviewResultsTotalList = reviewResultsTotalTempService.FindByYear(year1);
		} else if (year1 == 0 && role1 != 0) {
			behavioralResultList = behavioralResultsDetailTempService.FindBehavioralResultsByRole(role1);
			buisnessResultList = buisnessResultsDetailTempService.FindBuisnessResultsByRole(role1);
			reviewResultsTotalList = reviewResultsTotalTempService.FindByRole(role1);
		} else {
			behavioralResultList = behavioralResultsDetailTempService.FindAllBehavioralResults();
			buisnessResultList = buisnessResultsDetailTempService.FindAllBuisnessResults();
			reviewResultsTotalList = reviewResultsTotalTempService.FindAll();
		}

		Map<String, List<BehavioralResultsDetailTemp>> groupedData = behavioralResultList.stream()
				.collect(Collectors.groupingBy(data -> data.getRole() + "_" + data.getYear()));

		Map<String, Integer> sumOfResult = new HashMap<>();

		for (BehavioralResultsDetailTemp data : behavioralResultList) {
			String key = data.getEmpId() + "_" + data.getName() + "_" + data.getRole() + "_" + data.getYear();
			int currentValue = sumOfResult.getOrDefault(key, 0);
			sumOfResult.put(key, currentValue + data.getResult());
		}
		System.out.println("Year ===" + year1);
		model.addAttribute("sumOfResult", sumOfResult);
		model.addAttribute("groupedData", groupedData);
		model.addAttribute("buisnessResultList", buisnessResultList);
		model.addAttribute("reviewResultsTotalList", reviewResultsTotalList);
		return "pivote#";

	}

}
