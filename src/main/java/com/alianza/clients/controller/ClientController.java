package com.alianza.clients.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alianza.clients.entity.ClientsEntity;
import com.alianza.clients.modelo.ClientsModel;
import com.alianza.clients.repository.ClientsRepository;
import com.alianza.clients.service.ClientsService;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class ClientController {
	
	
	@Autowired
	private ClientsService clients_Service;
	
	@Autowired
	private ClientsRepository clients_Repository;
	
	
	@GetMapping("/getClients")
	public List<ClientsEntity> getAllClients() {
		return clients_Repository.findAll();
	}
	
	@PostMapping("/addClient")
	  public String createUser( @RequestBody ClientsModel user) {
		  String response= clients_Service.createUser(user);
		  return response;
		 }
	
	@GetMapping("getBySharedKey")
	public List<ClientsEntity> getBySharedKey(@RequestParam String sharedKey){
		return clients_Repository.findBySharedKey(sharedKey);
		
	}
	  
	

}
