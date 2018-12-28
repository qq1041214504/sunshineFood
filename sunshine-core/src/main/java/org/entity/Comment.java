package org.entity;

public class Comment {
	private int commentId;								//评论ID
	
	private int buyerId;								//客户编号
	
	private int sellerId;								//商家编号
	
	private int commentReputation;						//评论等级（1-5）
	
	private String commentDesc;						//描述

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
