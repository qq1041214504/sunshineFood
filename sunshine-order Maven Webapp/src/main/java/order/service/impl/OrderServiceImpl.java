package order.service.impl;

import java.util.List;

import org.dao.OrderMapper;
import org.entity.OrderMaster;
import org.entity.Paramt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;
	
	@Override
	public List<OrderMaster> getAllOrder() {
		// TODO Auto-generated method stub
		return orderMapper.getAllOrder();
	}

	@Override
	public Paramt getOrderMasterById(String orderId) {
		// TODO Auto-generated method stub
		return orderMapper.getOrderMasterById(orderId);
	}

}
