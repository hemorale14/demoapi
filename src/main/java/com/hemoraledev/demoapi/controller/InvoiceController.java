package com.hemoraledev.demoapi.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hemoraledev.demoapi.dto.Invoice;
import com.hemoraledev.demoapi.service.InvoiceService;

import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Invoice", description = "Invoice Operations")
@RestController
@RequestMapping("invoice")
public class InvoiceController implements BasicController<Invoice, UUID> {
	
	@Autowired
	private InvoiceService service;

	@Override
	public Invoice create(Invoice invoice) {
		return service.create(invoice);
	}

	@Override
	public Invoice getElementById(UUID uuid) {
		return service.getElementById(uuid);
	}

	@Override
	public List<Invoice> getAllElements() {
		return service.getAllElements();
	}

}
