package com.example.hiberuscheckout.dto;

import java.io.Serializable;

/**
 * @author Carlos Montoya
 * 
 */
public class SentOrderDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8992683898595320445L;

	private BillDto billDto;
	private OrderDto orderDto;

	public SentOrderDto(BillDto billDto, OrderDto orderDto) {
		super();
		this.billDto = billDto;
		this.orderDto = orderDto;
	}

	public BillDto getBillDto() {
		return billDto;
	}

	public void setBillDto(BillDto billDto) {
		this.billDto = billDto;
	}

	public OrderDto getOrderDto() {
		return orderDto;
	}

	public void setOrderDto(OrderDto orderDto) {
		this.orderDto = orderDto;
	}

}
