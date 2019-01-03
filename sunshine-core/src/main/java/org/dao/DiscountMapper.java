package org.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.entity.Discount;

public interface DiscountMapper {
	List<Discount> getAllDiscountByBuyerId(@Param("buyerId")int buyerId); //查询某个用户的所有优惠卷
	
	int deleteDiscount(@Param("discountId")int discountId,@Param("buyerId")int buyerId); //删除优惠卷

	int insertBuyerIdDiscount(@Param("discountId")int discountId,@Param("buyerId")int buyerId); //添加用户的优惠卷
	
	int insertDiscount(Discount discount);  //添加优惠卷
	
	Discount getAllDiscountByDiscountId(@Param("discountId")int discountId);  //查询一张优惠卷
	
	int getCountDiscountByBuyerId(@Param("buyerId")int buyerId); //查询某个用户的所有优惠卷张数

}
