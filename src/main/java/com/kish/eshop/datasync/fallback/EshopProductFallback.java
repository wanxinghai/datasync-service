package com.kish.eshop.datasync.fallback;

import org.springframework.stereotype.Component;

import com.kish.eshop.datasync.service.EshopProductService;

@Component
public class EshopProductFallback implements EshopProductService{

	@Override
	public String findBrandById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findBrandByIds(String ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findCategoryById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findProductIntroById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findProductPropertyById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findProductSpecificationById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
