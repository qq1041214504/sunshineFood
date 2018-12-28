package org.entity;

public class Rider {
	private int riderId;									//骑手ID
	
	private String riderName;								//骑手名字
		
	private String riderPassword;							//骑手密码
	
	private int riderStatus;								//骑手状态 空闲:0 配送中:1

	private String riderPhone;								//骑手电话
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

	public String getRiderPassword() {
		return riderPassword;
	}

	public void setRiderPassword(String riderPassword) {
		this.riderPassword = riderPassword;
	}

	public int getRiderStatus() {
		return riderStatus;
	}

	public void setRiderStatus(int riderStatus) {
		this.riderStatus = riderStatus;
	}

	public String getRiderPhone() {
		return riderPhone;
	}

	public void setRiderPhone(String riderPhone) {
		this.riderPhone = riderPhone;
	}
	
	
}
