package com.example.hiberuscheckout.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hiberuscheckout.dto.BillDto;
import com.example.hiberuscheckout.dto.OrderDto;
import com.example.hiberuscheckout.service.CheckOutOrderService;

@RestController
@RequestMapping("checkout")
public class CheckoutOrderController {

	HttpHeaders headers;

	@Autowired
	private CheckOutOrderService checkOutOrderService;

	public CheckoutOrderController() {
		headers = new HttpHeaders();
		headers.add("Content-Type", "application/json; charset=utf-8");
	}

	/**
	 * 
	 * @param OrderDto
	 */
	@PostMapping(path = "/order")
	public @ResponseBody ResponseEntity<BillDto> checkOutOrder(@RequestBody OrderDto orderDto) {

		return new ResponseEntity<BillDto>(checkOutOrderService.generateCheckoutOrder(orderDto), HttpStatus.OK);

	}
}
