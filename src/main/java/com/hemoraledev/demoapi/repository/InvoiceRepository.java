package com.hemoraledev.demoapi.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hemoraledev.demoapi.dto.Invoice;

@Repository
public interface InvoiceRepository  extends CrudRepository<Invoice, UUID>{

}
