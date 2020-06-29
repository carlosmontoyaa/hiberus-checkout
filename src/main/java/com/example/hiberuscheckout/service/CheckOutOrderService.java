package com.example.hiberuscheckout.service;

import com.example.hiberuscheckout.dto.BillDto;
import com.example.hiberuscheckout.dto.OrderDto;

public interface CheckOutOrderService {

	public BillDto generateCheckoutOrder(OrderDto orderDto);

}
