package cn.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.entity.Product;
import org.entity.ProductCategory;
import org.entity.Seller;


public interface ProductService {
	
	List<ProductCategory> productcategoryselect(@Param("seller")Integer seller);
	
	List<Product> ProductSelect(@Param("categoryId")Integer categoryId);
}
