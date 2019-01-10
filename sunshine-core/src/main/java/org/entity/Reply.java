package org.entity;

import java.util.Date;

//回复类
public class Reply {
	private int id;												//主键Id
	
	private int buyerId;										//买家Id
	
	private int sellerId;										//卖家Id
	
	private String replyDesc;									//卖家回复内容
	
	private Date replyTime;										//卖家回复时间
	
	private int orderId;										//订单Id

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getReplyDesc() {
		return replyDesc;
	}

	public void setReplyDesc(String replyDesc) {
		this.replyDesc = replyDesc;
	}

	public Date getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
}
