package org.entity;

public class Delivery {
	private int deliveryId;							//配送Id
	
	private String addressName;						//详细地址
	
	private String phone;								//电话
	
	private String deliveryName;						//配送给谁
	
	private String deliver_Desc;						//备注

	public int getDeliveryId() {
		return deliveryId;
	}

	public void setDeliveryId(int deliveryId) {
		this.deliveryId = deliveryId;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDeliveryName() {
		return deliveryName;
	}

	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	public String getDeliver_Desc() {
		return deliver_Desc;
	}

	public void setDeliver_Desc(String deliver_Desc) {
		this.deliver_Desc = deliver_Desc;
	}

	
}
