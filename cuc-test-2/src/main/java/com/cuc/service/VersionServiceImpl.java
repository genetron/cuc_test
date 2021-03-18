package com.cuc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuc.model.ApiVersion;
import com.cuc.repository.VersionRepository;

@Service
public class VersionServiceImpl implements VersionService{
	
	@Autowired
	private VersionRepository versionRepository;

	@Override
	public ApiVersion getVersion() {
		
		//Return the first and only element in the list. Value can be changed from data.sql
		return versionRepository.findAll().get(0);
	}
	
}
