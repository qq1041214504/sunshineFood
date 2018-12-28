package renying.controller;

import org.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import renying.service.BuyerService;

@RestController
@RequestMapping("buyerLogin")
public class LoginController {
	@Autowired
	private BuyerService buyerService;
	
	@RequestMapping("login")
	@ResponseBody
	public Buyer login(@RequestParam("buyerName")String buyerName,@RequestParam("buyerPassword")String buyerPassword) {
		System.out.println("进来了方法");
		if(buyerService.login(buyerName,buyerPassword)!=null) {
			return buyerService.login(buyerName,buyerPassword);
		}
		return buyerService.login(buyerName,buyerPassword)  ;
		
	}
	
}
