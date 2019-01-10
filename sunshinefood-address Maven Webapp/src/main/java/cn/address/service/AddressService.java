package cn.address.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.entity.Delivery;

public interface AddressService {
	public List<Delivery> getDeliveryByBuyerId(Integer buyerId);
	public int addDelivery(Delivery delivery);
	public int delDelivery(Integer deliveryId);
	public int updateDelivery(Delivery delivery);
	public Delivery getDeliveryByDeliveryId(Integer deliveryId);

}
