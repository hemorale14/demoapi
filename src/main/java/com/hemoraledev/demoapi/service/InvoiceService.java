package com.hemoraledev.demoapi.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemoraledev.demoapi.dto.Invoice;
import com.hemoraledev.demoapi.repository.InvoiceRepository;

@Service
public class InvoiceService implements BasicService<Invoice, UUID> {

	@Autowired
	private InvoiceRepository repository;

	@Override
	public Invoice create(Invoice dto) {
		dto.setUuid(UUID.randomUUID());
		return repository.save(dto);
	}

	@Override
	public Invoice getElementById(UUID id) {
		return repository.findById(id).orElseThrow();
	}

	@Override
	public List<Invoice> getAllElements() {
		return StreamSupport.stream(repository.findAll().spliterator(), false).collect(Collectors.toList());
	}

}
