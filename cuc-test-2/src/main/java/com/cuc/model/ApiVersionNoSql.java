package com.cuc.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document(collection = "version-table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiVersionNoSql {
	@Id
	private Long id;
	
	private String version;
}
