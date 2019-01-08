package cn.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.entity.Product;
import org.entity.ProductCategory;
import org.entity.Seller;


public interface ProductService {
	
	List<ProductCategory> productcategoryselect(@Param("seller")Integer seller);		//根据商家查询商品分类
	
	List<Product> ProductSelect(@Param("categoryId")Integer categoryId);				//根据商品分类查询商品
	
	List<Product> SpSelect(@Param("sellerid") Integer sellerid);						//根据商家查询所有商品
		
	int AddShangpin(Product product);													//商品新增
	
	int ShangPinUpdate(Product product);												//商品修改
	
	int ShangPinDel(Integer productId);													//商品删除
}
