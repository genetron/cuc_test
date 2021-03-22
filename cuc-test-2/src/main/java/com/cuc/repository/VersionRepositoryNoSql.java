package com.cuc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cuc.model.ApiVersionNoSql;

@Repository
public interface VersionRepositoryNoSql extends MongoRepository<ApiVersionNoSql, Long>{

}
