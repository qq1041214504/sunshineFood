package org.entity;

public class Seller {
	private int sellerId;												//商家编号
	
	private String sellerName;											//商家名称

	private String sellerPassword;										//商家密码
	
	private String sellerAddress;										//商家地址
	
	private String sellerPhone;										//商家联系方式
	
	private int selle_Reputation;										//商家信誉（1-5级）
	
	private int sellerState;											//状态（未营业：0 营业：1）
	
	private double sellerDispatching;									//配送费
	
	private String sellerIcon;											//图片
	
	private int sellerTypeid;											//商家类型Id
	
	private String openTime;											//开始营业时间
		
	private String endTime;											//打烊时间

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

	public String getSellerPassword() {
		return sellerPassword;
	}

	public void setSellerPassword(String sellerPassword) {
		this.sellerPassword = sellerPassword;
	}

	public String getSellerAddress() {
		return sellerAddress;
	}

	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	public String getSellerPhone() {
		return sellerPhone;
	}

	public void setSellerPhone(String sellerPhone) {
		this.sellerPhone = sellerPhone;
	}

	public int getSelle_Reputation() {
		return selle_Reputation;
	}

	public void setSelle_Reputation(int selle_Reputation) {
		this.selle_Reputation = selle_Reputation;
	}

	public int getSellerState() {
		return sellerState;
	}

	public void setSellerState(int sellerState) {
		this.sellerState = sellerState;
	}

	public double getSellerDispatching() {
		return sellerDispatching;
	}

	public void setSellerDispatching(double sellerDispatching) {
		this.sellerDispatching = sellerDispatching;
	}



	public String getSellerIcon() {

		return sellerIcon;
	}

	public void setSellerIcon(String sellerIcon) {
		this.sellerIcon = sellerIcon;
	}

	public int getSellerTypeid() {
		return sellerTypeid;
	}

	public void setSellerTypeid(int sellerTypeid) {
		this.sellerTypeid = sellerTypeid;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getEndTime() {
		return endTime; 
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	
	
}
