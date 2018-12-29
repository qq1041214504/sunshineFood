package order.service;

import java.util.List;

import org.entity.OrderMaster;
import org.entity.Paramt;

public interface OrderService {
	//查询所有订单
		public List<OrderMaster> getAllOrder();
		
		//查询某个订单
		public Paramt getOrderMasterById(String orderId);
}
