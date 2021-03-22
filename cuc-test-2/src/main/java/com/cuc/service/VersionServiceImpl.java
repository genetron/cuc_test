package com.cuc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuc.model.ApiVersionNoSql;
import com.cuc.repository.VersionRepositoryNoSql;

@Service
public class VersionServiceImpl implements VersionService{
	
	@Autowired
	private VersionRepositoryNoSql versionRepository;

	@Override
	public ApiVersionNoSql getVersion() {
		
		//add dummy version in actual db
		ApiVersionNoSql apiVersion = new ApiVersionNoSql(1L, "1.0");
		versionRepository.save(apiVersion);
		
		//Return the first and only element in the list. Value can be changed from data.sql
		return versionRepository.findAll().get(0);
	}
	
}
