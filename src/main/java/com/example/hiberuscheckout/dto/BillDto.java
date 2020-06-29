package com.example.hiberuscheckout.dto;

import java.io.Serializable;

public class BillDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5416782737023585589L;

	private Integer id;
	private Integer quantityProducts;
	private Integer costTotal;

	public BillDto() {
		super();
	}

	public BillDto(Integer id, Integer quantityProducts, Integer costTotal) {
		super();
		this.id = id;
		this.quantityProducts = quantityProducts;
		this.costTotal = costTotal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantityProducts() {
		return quantityProducts;
	}

	public void setQuantityProducts(Integer quantityProducts) {
		this.quantityProducts = quantityProducts;
	}

	public Integer getCostTotal() {
		return costTotal;
	}

	public void setCostTotal(Integer costTotal) {
		this.costTotal = costTotal;
	}

}
