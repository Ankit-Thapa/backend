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
@Table(name="ShoppingProducts")
public class ShoppingProducts {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	@Column(name="shopping_id")
	private Long shoppingId;
	@Column(name="product_id")
	private Long productId;
	@Column(name="quantity")
	private int quantity;
	@Column(name="total_price")
	private int totalPrice;
	
}
