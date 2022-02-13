package com.pathlock.Configuration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableTransactionManagement
@EnableWebMvc
@ComponentScan("com.pathlock")
@Configuration
@PropertySource("classpath:application.properties")
public class SpringConfiguration {
	@Autowired
	private Environment environment;

	@Bean
	public InternalResourceViewResolver viewresolver() {
		InternalResourceViewResolver i = new InternalResourceViewResolver();
		i.setSuffix(".jsp");
		i.setPrefix("/WEB-INF/JSP/");
		return i;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionfactory = new LocalSessionFactoryBean();
		sessionfactory.setDataSource(datasource());
		sessionfactory.setHibernateProperties(getHibernateProp());
		sessionfactory.setPackagesToScan("com.pathlock.Model");
		return sessionfactory;

	}

	public Properties getHibernateProp() {
		Properties p1 = new Properties();
		p1.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
		p1.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
		p1.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		return p1;
	}

	public DriverManagerDataSource datasource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.drivername"));
		dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
		dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
		dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
		return dataSource;
	}

	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory ob) {
		HibernateTransactionManager tx = new HibernateTransactionManager();
		tx.setSessionFactory(ob);
		return tx;

	}

}