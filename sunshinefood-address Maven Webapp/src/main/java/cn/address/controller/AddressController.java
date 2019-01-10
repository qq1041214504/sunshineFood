package cn.address.controller;

import org.dao.AddressMapper;
import org.entity.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.address.service.AddressService;

@RestController
@RequestMapping("address")
public class AddressController {
	@Autowired
	private AddressService addressService;
	
	@RequestMapping("selectAddress")
	public Object selectAddress(@RequestParam("buyerId")Integer buyerId){
		return addressService.getDeliveryByBuyerId(buyerId);	
	}
	
	@RequestMapping("addAddress")
	public Object addAddress(Delivery delivery){
		return addressService.addDelivery(delivery);	
	}
	
	@RequestMapping("delAddress")
	public Object delAddress(Integer deliveryId){
		return addressService.delDelivery(deliveryId);	
	}
	@RequestMapping("updateAddress")
	public Object updateAddress(Delivery delivery){
		return addressService.updateDelivery(delivery);	
	}
}
