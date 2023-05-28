package com.alianza.clients.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clients")
@Getter
@Setter
@Data
public class ClientsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_clients", nullable = false)
	private int id_clients;
	
	@Basic(optional = false)
	@Column(name = "sharedKey", nullable = false)
	private String sharedKey;
	
	@Basic(optional = false)
	@Column(name = "businessId", nullable = false)
	private String businessId;
	
	@Basic(optional = false)
	@Column(name = "email", nullable = false)
	private String email;
	
	@Basic(optional = false)
	@Column(name = "phone", nullable = false)
	private String phone;
	
	@Basic(optional = false)
	@Column(name = "dataAdded", nullable = false)
	private String dataAdded;
	
	@Basic(optional = false)
	@Column(name = "endDate", nullable = false)
	private String endDate;
	
	

}
