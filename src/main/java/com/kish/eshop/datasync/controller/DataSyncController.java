package com.kish.eshop.datasync.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kish.eshop.datasync.service.EshopProductService;

@RestController
public class DataSyncController {

	@Autowired
	private EshopProductService eshopProductService;
	
	@RequestMapping("/findCategoryById")
	public String findCategoryById(Long id){
		return eshopProductService.findCategoryById(id);
	}
	
}
