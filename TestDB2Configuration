package com.src.sampleapp;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

public class TestDB2Configuration {

	@Bean(name="testDB2")
	@ConfigurationProperties(prefix="spring.Datasource2")
	public DataSource secondaryDataSource() {
	    return DataSourceBuilder.create().build();
	}
}
