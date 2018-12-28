package org.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.entity.Buyer;

public interface BuyerMapper {
	@Select("SELECT * FROM buyer where buyername=#{buyerName}")
	Buyer login(@Param("buyerName")String buyerName);
	
	@Insert("insert into buyer(buyerName,buyerPassword) values (#{buyerName},#{buyerPassword})")
	int addBuyer(@Param("buyerName")String buyerName,@Param("buyerPassword")String buyerPassword);
}
