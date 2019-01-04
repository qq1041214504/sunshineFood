package cn.discount.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.discount.service.DiscountService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "BookController", description = "BookController | 优惠券")
@RequestMapping("/discount")
public class DiscountController {
	@Autowired
	private DiscountService discountService;
	
	@ApiOperation(value="查看一个人的优惠券", notes="优惠券")
	@RequestMapping(value="/getAllForBuyer", method=RequestMethod.GET)
	public Object getAllForBuyer(@RequestParam("buyerId")int buyerId,HttpServletResponse response){
		return discountService.getAllDiscountByBuyerId(buyerId);
	}
	@ApiOperation(value="查看一个人的优惠券数量", notes="优惠券")
	@RequestMapping(value="/getCountForBuyer",method=RequestMethod.GET)
	public Object getCountForBuyer(@RequestParam("buyerId")int buyerId,HttpServletResponse response){
		return discountService.getCountDiscountByBuyerId(buyerId);
	}
}
