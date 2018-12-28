package org.entity;

public class Buyer {	
	private int buyerId;									//客户编号
	
	private String buyerName;								//昵称
	
	private String buyerPassword;							//密码
	
	private String buyerPhone;								//联系方式
	
	private String buyerEmail;								//邮箱

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

	public String getBuyerPassword() {
		return buyerPassword;
	}

	public void setBuyerPassword(String buyerPassword) {
		this.buyerPassword = buyerPassword;
	}

	public String getBuyerPhone() {
		return buyerPhone;
	}

	public void setBuyerPhone(String buyerPhone) {
		this.buyerPhone = buyerPhone;
	}

	public String getBuyerEmail() {
		return buyerEmail;
	}

	public void setBuyerEmail(String buyerEmail) {
		this.buyerEmail = buyerEmail;
	}

	@Override
	public String toString() {
		return "Buyer [buyerId=" + buyerId + ", buyerName=" + buyerName + ", buyerPassword=" + buyerPassword
				+ ", buyerPhone=" + buyerPhone + ", buyerEmail=" + buyerEmail + "]";
	}




	
}
