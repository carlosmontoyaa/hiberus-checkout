package com.example.hiberuscheckout.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class OrderDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1282000969476309445L;

	private Integer clientID;
	private Date date;
	private String direction;
	private List<ProductDto> productDtoList;

	public Integer getClientID() {
		return clientID;
	}

	public void setClientID(Integer clientID) {
		this.clientID = clientID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public List<ProductDto> getProductDtoList() {
		return productDtoList;
	}

	public void setProductDtoList(List<ProductDto> productDtoList) {
		this.productDtoList = productDtoList;
	}

}
