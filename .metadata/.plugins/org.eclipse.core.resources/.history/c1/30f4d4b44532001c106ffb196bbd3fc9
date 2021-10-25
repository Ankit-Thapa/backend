package com.demoproject.shopping.entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
    @Column(name = "product_category_id")
	String productCategoryId;
	@Column(name="name")
	String name;
	@Column(name="price")
	private int price;
	@Column(name="date_created")
	private Date dateCreated;
	@Column(name="date_modified")
	Date dateModified;
	@Column(name="image")
	private byte[] image;
	@Column(name="detail")
	String detail;
	@Column(name="feature")
	String feature;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(String productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateModified() {
		return dateModified;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public Product(String productCategoryId, String name, int price, Date dateCreated, Date dateModified,
			byte[] image, String detail, String feature) {
		super();
		this.productCategoryId = productCategoryId;
		this.name = name;
		this.price = price;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
		this.image = image;
		this.detail = detail;
		this.feature = feature;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productCategoryId=" + productCategoryId + ", name=" + name + ", price=" + price
				+ ", dateCreated=" + dateCreated + ", dateModified=" + dateModified + ", image="
				+ Arrays.toString(image) + ", detail=" + detail + ", feature=" + feature + "]";
	}
	
	

}
