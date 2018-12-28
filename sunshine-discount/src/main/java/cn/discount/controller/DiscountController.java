package cn.discount.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.discount.service.DiscountService;

@RestController
@RequestMapping("discount")
public class DiscountController {
	@Autowired
	private DiscountService discountService;
	@RequestMapping("getAllForBuyer")
	public Object getAllForBuyer(@RequestParam("buyerId")int buyerId,HttpServletResponse response){
		
		return discountService.getAllDiscountByBuyerId(buyerId);
		
	}
}
