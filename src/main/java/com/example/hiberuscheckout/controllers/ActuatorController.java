package com.example.hiberuscheckout.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("actuator")
public class ActuatorController {
	// private static final Logger logger =
	// Logger.getLogger(CheckoutOrderController.class);

	HttpHeaders headers;

	public ActuatorController() {
		headers = new HttpHeaders();
		headers.add("Content-Type", "application/json; charset=utf-8");
	}

	@GetMapping(path = "/info")
	public @ResponseBody ResponseEntity<String> infoMicroservice() {
		return new ResponseEntity<>("Microservice to receive Orders", HttpStatus.OK);
	}
}
