package com.alianza.clients.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alianza.clients.entity.ClientsEntity;

@Repository
public interface ClientsRepository extends JpaRepository<ClientsEntity, Integer>{
	
	List<ClientsEntity> findBySharedKey(String SharedKey);

	
	
	
}
