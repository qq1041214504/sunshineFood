package cn.discount.service.impl;

import java.util.List;

import org.dao.DiscountMapper;
import org.entity.Discount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.discount.service.DiscountService;
@Service
public class DiscountServiceImpl implements DiscountService {
	@Autowired
	private DiscountMapper discountMapper;
	@Override
	public List<Discount> getAllDiscountByBuyerId(int buyerId) {
		// TODO Auto-generated method stub
		return discountMapper.getAllDiscountByBuyerId(buyerId);
	}

	@Override
	public int deleteDiscount(int discountId, int buyerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertBuyerIdDiscount(int discountId, int buyerId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertDiscount(Discount discount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Discount getAllDiscountByDiscountId(int discountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCountDiscountByBuyerId(int buyerId) {
		// TODO Auto-generated method stub
		return discountMapper.getCountDiscountByBuyerId(buyerId);
	}

}
