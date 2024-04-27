package com.example.devbitjson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class Config {

	
	@Bean
	 RestClient restClient() {
        return RestClient.builder()
                .baseUrl("https://api.restful-api.dev")
                .build();//https://www.googleapis.com/drive/v3/files
        //https://xkcd.com/info.0.json
    }
	
	
	
	
}
