package com.hemoraledev.demoapi.dto;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Invoice {
	@Id
	private UUID uuid;
	@Column
	private String issuer;
	@Column
	private String receiver;
	@Column
	private boolean complement;
}
