package org.entity;

import java.util.Date;

//评价类
public class Comment {
	private int commentId;								//评论ID
	
	private int buyerId;								//客户编号
	
	private int sellerId;								//商家编号
	
	private int commentReputation;						//评论等级（1-5）
	
	private String commentDesc;						    //描述
	
	private Date createTime;                            //创建时间
	
	private int orderId;                                //订单Id
	
	private String buyerName;                           //买家名字
	
	private String replyDesc;                           //卖家回复内容
	
	private Date replyTime;                             //卖家回复时间 
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
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

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
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

	public int getCommentReputation() {
		return commentReputation;
	}

	public void setCommentReputation(int commentReputation) {
		this.commentReputation = commentReputation;
	}

	public String getCommentDesc() {
		return commentDesc;
	}

	public void setCommentDesc(String commentDesc) {
		this.commentDesc = commentDesc;
	}

	
	
}
