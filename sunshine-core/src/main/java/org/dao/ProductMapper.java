package org.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.entity.Product;
import org.entity.ProductCategory;

public interface ProductMapper {
	
	@Select("SELECT a.* ,b.sellerName FROM productcategory AS a,seller AS b WHERE b.sellerid=#{b.sellerid} AND b.sellerid=a.sellerid")
	List<ProductCategory> productcategoryselect(@Param("seller")Integer seller);			//根据商品分类查询商品

	
	@Select("SELECT a.*,b.categoryName FROM product AS a,productcategory AS b WHERE b.categoryId=a.categoryId AND a.categoryId=#{a.categoryId}")
	List<Product> ProductSelect(@Param("categoryId")Integer categoryId);			//根据店家ID查询商品
	

}