package org.app.controller;

import java.util.List;

import org.app.service.SellerService;
import org.entity.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SellerController {
  @Autowired
  private SellerService sellerservice;
  
   @RequestMapping("/SellerAll")
   public Object SellerAll() {
	   List<Seller>list=sellerservice.SellerList();
	   if(list!=null) {
		   for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getSellerName());
		}
		   return list;
	   }
	   return "null";
   }
   
   @RequestMapping("/findSeller")
   public Object findSeller() {
	   List<Seller>list=sellerservice.findSellerBy(null,1);
	   if(list!=null) {		 
		   return list;
	   }
	   return "null";
   }
   
   @RequestMapping("/UpdateSeller")
   public Object UpdateSeller() {
	   
	   
	   return "null";
   }
}
