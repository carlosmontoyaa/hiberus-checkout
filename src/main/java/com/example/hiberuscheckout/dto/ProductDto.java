package com.example.hiberuscheckout.dto;

import java.io.Serializable;

/**
 * @author Carlos Montoya
 * 
 */
public class ProductDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1076895091700850066L;

	private Integer id;
	private Integer quantity;
	private Integer cost;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

}
