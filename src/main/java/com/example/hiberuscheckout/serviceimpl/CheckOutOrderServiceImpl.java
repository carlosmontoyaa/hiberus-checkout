package com.example.hiberuscheckout.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.example.hiberuscheckout.dto.BillDto;
import com.example.hiberuscheckout.dto.OrderDto;
import com.example.hiberuscheckout.dto.SentOrderDto;
import com.example.hiberuscheckout.service.CheckOutOrderService;;

@Service
public class CheckOutOrderServiceImpl implements CheckOutOrderService {

	private static final String URL_SERVICE_BILL = "http://billing-order";
	private static final String URL_SERVICE_LOGISTIC = "http://logistic-order";

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public BillDto generateCheckoutOrder(OrderDto orderDto) {

		BillDto bill = null;

		try {

			HttpEntity<OrderDto> billRequest = new HttpEntity<>(orderDto);
			bill = restTemplate.postForObject(URL_SERVICE_BILL, billRequest, BillDto.class);

			HttpEntity<SentOrderDto> logisticRequest = new HttpEntity<>(new SentOrderDto(bill, orderDto));
			restTemplate.postForObject(URL_SERVICE_LOGISTIC, logisticRequest, Void.class);

		} catch (HttpClientErrorException ex) { // error 4xx
			ex.printStackTrace();
		} catch (HttpServerErrorException ex) { // error 5xx
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return bill;
	}

}
