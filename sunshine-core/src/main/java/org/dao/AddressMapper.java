package org.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.entity.Delivery;
@Mapper
public interface AddressMapper {
	public List<Delivery> getDeliveryByBuyerId(@Param("buyerId")Integer buyerId);
	public int addDelivery(Delivery delivery);
	public int delDelivery(@Param("deliveryId")Integer deliveryId);
	public int updateDelivery(Delivery delivery);
	public Delivery getDeliveryByDeliveryId(@Param("deliveryId")Integer deliveryId);
}
