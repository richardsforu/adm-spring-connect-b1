package com.cts.product.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cts.product.entity.Product;

@Configuration
@ComponentScan("com.cts.product.service,com.cts.product.dao")
@PropertySource(value = "db.properties")
@EnableTransactionManagement
public class AppConfig {

	@Autowired
	private Environment env;
	// 3 Steps

	// Step-1 : Define Data-source for database connection details
	@Bean
	public DataSource getDataSource() {

		System.out.println(">>> Datasource configuration <<<");

		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(env.getProperty("db.driver"));
		ds.setUrl(env.getProperty("db.url"));
		ds.setUsername(env.getProperty("db.username"));
		ds.setPassword(env.getProperty("db.password"));
		return ds;
	}

	// step-2 : Define Session Factory for above defined data-source

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		System.out.println(">>> SessionFactory Creation <<<");

		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		sf.setDataSource(getDataSource());
	    sf.setAnnotatedClasses(Product.class);
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		props.setProperty("hibernate.hbm2ddl.auto", "update");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.format_sql", "true");
		sf.setHibernateProperties(props);
		return sf;

	}

	// step -3 (optional) : Define Transaction Management details
	@Bean
	public HibernateTransactionManager getTransactionManager() {
		System.out.println(">>> Transaction Configuration  <<<");

		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getSessionFactory().getObject());

		return transactionManager;
	}

}
