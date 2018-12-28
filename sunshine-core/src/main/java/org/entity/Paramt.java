package org.entity;

import java.util.ArrayList;
import java.util.List;

public class Paramt {
	private String orderId;								//订单ID
	private int buyerId;								//用户Id
	private String buyerName;							//用户名
	private String buyerPhone;							//用户联系方式
	private int sellerId;								//商家Id
	private String sellerName;							//商家名称
	private String sellerPhone;							//商家联系方式
	private int riderId;								//骑手Id
	private String riderName;							//骑手名称
	private String riderPhone;							//骑手联系方式
	
	private double orderAmount;							//订单金额
	private String updateTime;							//订单创建时间
	private List<Product> list = new ArrayList<Product>();//商品信息
	
	
	public String getRiderPhone() {
		return riderPhone;
	}
	public void setRiderPhone(String riderPhone) {
		this.riderPhone = riderPhone;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerPhone() {
		return buyerPhone;
	}
	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerPhone() {
		return sellerPhone;
	}
	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}
	public int getRiderId() {
		return riderId;
	}
	public void setRiderId(int riderId) {
		this.riderId = riderId;
	}
	public String getRiderName() {
		return riderName;
	}
	public void setRiderName(String riderName) {
		this.riderName = riderName;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public List<Product> getList() {
		return list;
	}
	public void setList(List<Product> list) {
		this.list = list;
	}
	
	
	
}
