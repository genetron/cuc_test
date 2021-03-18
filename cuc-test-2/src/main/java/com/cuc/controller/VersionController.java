package com.cuc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cuc.service.VersionService;

@RestController
public class VersionController {
	
	@Autowired
	VersionService versionService;
	
	@GetMapping("/version")
    public String getVersion() {
       return versionService.getVersion().getVersion();
    }

}
