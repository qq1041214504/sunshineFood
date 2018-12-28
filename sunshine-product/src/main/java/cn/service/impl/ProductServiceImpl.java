package cn.service.impl;

import java.util.List;

import org.dao.ProductMapper;
import org.entity.Product;
import org.entity.ProductCategory;
import org.entity.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductMapper productmapper;

	@Override
	public List<ProductCategory> productcategoryselect(Integer seller) {
		
		return productmapper.productcategoryselect(seller);
	}

	@Override
	public List<Product> ProductSelect(Integer categoryId) {
		
		return productmapper.ProductSelect(categoryId);
	}


}
