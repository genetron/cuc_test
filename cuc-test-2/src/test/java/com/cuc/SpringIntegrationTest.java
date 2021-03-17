package com.cuc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class SpringIntegrationTest {
	
	@Autowired
	private TestRestTemplate testRestTemplate;
	
	public ResponseEntity<String> executeGet(String url) {
		ResponseEntity<String> respEntity = testRestTemplate.getForEntity(url, String.class);
		return respEntity;
	}
}
