package com.demoproject.shopping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CartProductsMapping")
public class CartProductsMapping {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
    @Column(name = "cart_id")
	private Long cartId;
    @Column(name = "product_id")
	private Long productId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCartId() {
		return cartId;
	}
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "CartProductsMapping [id=" + id + ", cartId=" + cartId + ", productId=" + productId + "]";
	}
	public CartProductsMapping(Long id, Long cartId, Long productId) {
		super();
		this.id = id;
		this.cartId = cartId;
		this.productId = productId;
	}
	public CartProductsMapping() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
