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

	@Override
	public List<Product> SpSelect(Integer sellerid) {
		
		return productmapper.SpSelect(sellerid);
	}

	@Override
	public int AddShangpin(Product product) {
	
		return 	productmapper.AddShangpin(product);
		
	}

	@Override
	public int ShangPinUpdate(Product product) {
		
		return productmapper.ShangPinUpdate(product);
		
	}

	@Override
	public int ShangPinDel(Integer productId) {
		
		return productmapper.ShangPinDel(productId);
	}




}
