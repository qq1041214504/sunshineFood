package cn.address.service.impl;

import java.util.List;

import org.dao.AddressMapper;
import org.entity.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.address.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService {
	@Autowired
	private AddressMapper addressMapper;
	@Override
	public List<Delivery> getDeliveryByBuyerId(Integer buyerId) {
		// TODO Auto-generated method stub
		return addressMapper.getDeliveryByBuyerId(buyerId);
	}

	@Override
	public int addDelivery(Delivery delivery) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delDelivery(Integer deliveryId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDelivery(Delivery delivery) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Delivery getDeliveryByDeliveryId(Integer deliveryId) {
		// TODO Auto-generated method stub
		return addressMapper.getDeliveryByDeliveryId(deliveryId);
	}

}
