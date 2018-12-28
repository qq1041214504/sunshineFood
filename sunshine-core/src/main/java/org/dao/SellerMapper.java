package org.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.entity.Seller;

public interface SellerMapper { 
	@Select("select * from seller")
	List<Seller>SellerList();
	@Select("<script>"+
	           "select * from seller where 1=1 <if test='sellerName !=null'> sellerName like concat{'%',#{sellerName},'%'}</if> "
	           + "<if test='sellerTypeid >0'>sellerTypeid=#{sellerTypeid}</if>"+
			"</script>")
	List<Seller>findSellerBy(@Param("sellerName")String sellerName,@Param("sellerTypeid")int sellerTypeid);
	
	int AddSeller(Seller seller);
	@Update("<script>"+
	       "update seller set sellerName=#{sellerName},sellerpassword=#{sellerpassword},sellerAddress=#{sellerAddress},sellerPhone#{sellerPhone}"
	       + ",sellerReputation=#{sellerReputation},sellerState=#{sellerState},sellerDispatching#{sellerDispatching},sellerIcon#{sellerIcon}"
	       + ",sellerTypeid=#{sellerTypeid},openTime=#{openTime},endTime=#{endTime} where sellerId=#{sellerId}"+
	        "</script>")
	int UpdateSeller(@Param("sellerId")int id,Seller seller);
	@Delete("delete from seller where sellerId=#{id}")
	int DelSeller(@Param("sellerId")int id);
}
