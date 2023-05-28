package com.alianza.clients.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alianza.clients.entity.ClientsEntity;
import com.alianza.clients.modelo.ClientsModel;
import com.alianza.clients.repository.ClientsRepository;


@Service
public class ClientsService {
	
	
	@Autowired
	private ClientsRepository client_repository;
	
	
	public String createUser(ClientsModel user)
	{
		
		try {
			ClientsEntity addUser= new ClientsEntity();
			addUser.setSharedKey(user.getSharedKey());
			addUser.setBusinessId(user.getName());
			addUser.setDataAdded(user.getStartDate());
			addUser.setEmail(user.getEmail());
			addUser.setEndDate(user.getEndDate());
			addUser.setPhone(user.getPhone());
			client_repository.save(addUser);
			return "Creación de usuario exitoso";
			
		} catch (Exception e) {
		return e.toString();
		}
	}
	
	
	
	
	

}
