package com.ksystem.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Entity
@Data
public class Customer {
	@Id
	@GeneratedValue(generator = "customer_id_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "customer_id_seq", sequenceName = "customer_id_seq", allocationSize = 1)
	private Long id;

	@NotBlank
	private String name;
}
