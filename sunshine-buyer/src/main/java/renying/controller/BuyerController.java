package renying.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import renying.service.BuyerService;

@RestController
@RequestMapping("buyer")
public class BuyerController {
	@Autowired
	private BuyerService buyerService;
	
	//用户注册
	@RequestMapping("register")
	public String register(@RequestParam("buyerName")String buyerName,@RequestParam("buyerPassword")String buyerPassword) {
		if(buyerService.addBuyer(buyerName, buyerPassword)>0) {
			return "添加成功";
		}
		return null;
	}
	 
	//验证用户名是否重名
	@RequestMapping("repeatBuyerName")			
	public String repeatBuyerName(@RequestParam("buyerName")String buyerName) {
		if(buyerService.selByName(buyerName)!=null) {
			return "名字重复";
		}
		return null;
	}
	
	@RequestMapping("getAllBuyer")
	public List<Buyer> getAllBuyer() {
		return buyerService.getAllBuyer();
	}
	
	@RequestMapping("getBuyerSession")
	public Buyer getBuyerSession(HttpSession session) {
		System.out.println("获取的session："+session.getAttribute("buyerSession"));
		
		return (Buyer)session.getAttribute("buyerSession");
	}
}
