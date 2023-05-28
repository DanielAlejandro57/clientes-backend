package com.alianza.clients.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientsModel {
	
	
	private String sharedKey;
	private String name;
    private String phone;
    private String email;
    private String startDate;
    private String endDate;
 

}
