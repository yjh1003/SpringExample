package com.yjh.spring.ex.database.model;

import java.util.Date;

// DTO (Entity)

public class UsedGoods {

	private int id;
	private int sellerId;
	private String title;
	private int price;
	private String description;
	private String picture;
	private Date createdAt;
	private Date updateddAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdateddAt() {
		return updateddAt;
	}
	public void setUpdateddAt(Date updateddAt) {
		this.updateddAt = updateddAt;
	}
	
	
}
