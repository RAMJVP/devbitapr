package com.example.devbitjson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.core.model.Root;

@Service
public class Serv {

	@Autowired
	private RestClient restClient;

	public List<Photo> getAllProducts() {

		System.out.println("###" + restClient.get().uri("info.0.json").retrieve().body(String.class));
	
		
		
		return restClient.get().uri("info.0.json").retrieve().body(new ParameterizedTypeReference<List<Photo>>() {
		});//// https://www.googleapis.com/drive/v3/files
		// info.0.json
	}
	
	
	
	
	
	
	public List<Root> getProducts() {

		System.out.println("###" + restClient.get().uri("objects").retrieve().body(String.class));
		List<Root> rs=restClient.get().uri("objects").retrieve().body(new ParameterizedTypeReference<List<Root>>() {
		});
		
		
		return rs.subList(0, 2);//https://api.restful-api.dev/objects
	}
	
	
	

}