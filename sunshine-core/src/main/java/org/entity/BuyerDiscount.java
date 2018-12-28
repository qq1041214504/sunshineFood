package org.entity;

public class BuyerDiscount {
	private int id;								//用户优惠ID
		
	private int buyerId;						//客户编号
	
	private int discountId;					//优惠ID

	private String discountStartDate;						//开始时间
	
	private String  discountExpireDate;					//结束时间

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

	public int getDiscountId() {
		return discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	public String getDiscountStartDate() {
		return discountStartDate;
	}

	public void setDiscountStartDate(String discountStartDate) {
		this.discountStartDate = discountStartDate;
	}

	public String getDiscountExpireDate() {
		return discountExpireDate;
	}

	public void setDiscountExpireDate(String discountExpireDate) {
		this.discountExpireDate = discountExpireDate;
	}

	
	
	
}
