package org.entity;
/**
 * 满减类
 * @author Administrator
 *
 */
public class Welfare {
	private int welfareId;
	
	private double welfareMin;   //满
	
	private double welfarePrice; //减
	
	public int getWelfareId() {
		return welfareId;
	}
	public void setWelfareId(int welfareId) {
		this.welfareId = welfareId;
	}
	public double getWelfareMin() {
		return welfareMin;
	}
	public void setWelfareMin(double welfareMin) {
		this.welfareMin = welfareMin;
	}
	public double getWelfarePrice() {
		return welfarePrice;
	}
	public void setWelfarePrice(double welfarePrice) {
		this.welfarePrice = welfarePrice;
	}

}
