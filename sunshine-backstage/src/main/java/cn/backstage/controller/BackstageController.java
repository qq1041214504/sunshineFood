package cn.backstage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.backstage.service.BackstageService;

@RestController

@RequestMapping("backs")
public class BackstageController {
	
	@Autowired
	//注入backstageServices
	private BackstageService backstageService;
	
	//用户注册
	
		@RequestMapping(value="addBuyer")
		public Object register(@RequestParam("buyerName")String buyerName,@RequestParam("buyerPassword")String buyerPassword) {
			if(backstageService.addBuyer(buyerName, buyerPassword)>0) {
				return true;
			}
			return false;
		}
	
}
