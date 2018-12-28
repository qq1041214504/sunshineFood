package cn.discount.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.entity.Discount;

public interface DiscountService {
	List<Discount> getAllDiscountByBuyerId(int buyerId); //查询某个用户的所有优惠卷
	
	int deleteDiscount(int discountId,int buyerId); //删除优惠卷

	int insertBuyerIdDiscount(int discountId,int buyerId); //添加用户的优惠卷
	
	int insertDiscount(Discount discount);  //添加优惠卷
	
	Discount getAllDiscountByDiscountId(int discountId);  //查询一张优惠卷

}
