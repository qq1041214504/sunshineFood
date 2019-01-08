package org.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.entity.Product;
import org.entity.ProductCategory;

public interface ProductMapper {
	
	@Select("SELECT a.* ,b.sellerName FROM productcategory AS a,seller AS b WHERE b.sellerid=#{seller} AND b.sellerid=a.sellerid")
	List<ProductCategory> productcategoryselect(@Param("seller")Integer seller);			//根据商品分类查询商品
	
	@Select("SELECT a.*,b.categoryName FROM product AS a,productcategory AS b WHERE b.categoryId=a.categoryId AND a.categoryId=#{categoryId}")
	List<Product> ProductSelect(@Param("categoryId")Integer categoryId);			//根据店家ID查询商品
	
	@Select("select * from product where sellerid=#{sellerid}")	
	List<Product> SpSelect(@Param("sellerid") Integer sellerid);		//根据商家查询所有商品
	
	@Insert("INSERT INTO product(productName,productPrice,productDesc,productIcon,productStock,sellerId,categoryId,productStatus)VALUES('productName',productPrice,'productDesc','productIcon',productStock,sellerId,categoryId,productStatus)")
	int AddShangpin(Product product);													//新增商品
	
	@Update("UPDATE  product SET productName=#{productName},productPrice=#{productPrice},productDesc=#{productDesc},productIcon=#{productIcon},productStock=#{productStock},sellerId=#{sellerId},categoryId=#{categoryId},productStatus=#{productStatus} WHERE productid=#{productId}")
	int ShangPinUpdate(Product product);						//修改商品
	
	@Delete("DELETE FROM product WHERE productid=9")
	int ShangPinDel(Integer productId);							//修改商品
	
}
