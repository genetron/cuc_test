package com.cuc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cuc.model.ApiVersion;

@Repository
public interface VersionRepository extends JpaRepository<ApiVersion, Long>{

}
