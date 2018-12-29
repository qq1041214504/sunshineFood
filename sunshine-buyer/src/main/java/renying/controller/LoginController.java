package renying.controller;

import javax.servlet.http.HttpSession;

import org.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import renying.service.BuyerService;

@RestController
@RequestMapping("buyerLogin")
//用户登录Controller
public class LoginController {
	@Autowired
	private BuyerService buyerService;
	
	@RequestMapping("login")
	public Buyer login(@RequestParam("buyerName")String buyerName,@RequestParam("buyerPassword")String buyerPassword,
						HttpSession session) {
		Buyer buyer=buyerService.login(buyerName, buyerPassword);
		if(buyer!=null) {
			session.setAttribute("buyerSession",buyer );
			return buyer;
		}
		return null;
		
	}
	
}
