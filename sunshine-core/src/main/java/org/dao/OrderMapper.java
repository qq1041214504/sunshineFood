package org.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.entity.OrderMaster;
import org.entity.Paramt;

@Mapper
public interface OrderMapper {
	//查询所有订单
	public List<OrderMaster> getAllOrder();
	
	//查询某个订单
	public Paramt getOrderMasterById(@Param("orderId") String orderId);
}
