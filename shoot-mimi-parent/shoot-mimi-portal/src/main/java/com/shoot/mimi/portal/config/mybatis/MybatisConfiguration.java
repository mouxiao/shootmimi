package com.shoot.mimi.portal.config.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;


@Component
@MapperScan("com.shoot.mimi.*.mapper")
public class MybatisConfiguration {
	
//	@Autowired
//	private DataSource dataSource;
	
	
	
//	@Bean  
//	public DataSource dataSource() {
//		DruidDataSource dataSource = new DruidDataSource();
//		dataSource.setUrl(url);
////		dataSource.setUsername(PropertiesConfig.username);
////		dataSource.setPassword(PropertiesConfig.password);
////		dataSource.setDriverClassName(PropertiesConfig.driverName);
//		return dataSource;
//		
//	}
	
//	 public SqlSessionFactoryBean sqlSessionFactory(ApplicationContext applicationContext) throws Exception {
//	        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//	        sessionFactory.setDataSource(dataSource);
////	        sessionFactory.setPlugins(new Interceptor[]{new PageInterceptor()});
//	        sessionFactory.setMapperLocations(applicationContext.getResources("classpath*:mapper/*.xml"));
//	        return sessionFactory;
//	    }
	

}
