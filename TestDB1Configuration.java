package com.src.sampleapp;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration 
@ConfigurationProperties(prefix = "spring.Datasource1") 
public class TestDB1Configuration {

	@Bean(name="testDB1")
	public DataSource primaryDataSource() {
	    return DataSourceBuilder.create().build();
	}
	
	
}
