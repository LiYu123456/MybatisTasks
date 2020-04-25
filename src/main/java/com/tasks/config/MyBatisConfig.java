//package com.tasks.config;
//
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInterceptor;
//import com.github.pagehelper.autoconfigure.PageHelperProperties;
//import org.apache.ibatis.plugin.Interceptor;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.core.io.support.ResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.io.IOException;
//
//@Configuration
//@EnableTransactionManagement
//public class MyBatisConfig {
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Bean(name="sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
//        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
//        bean.setDataSource(dataSource);
//        bean.setVfs(SpringBootVFS.class);
//
//        /*
//        //如果使用MyBatis的SpringBoot的Starter则需要配置，因为两种方式不一样
//
//        bean.setConfigLocation(new ClassPathResource("sqlMapConfig.xml"));
//
//        //分页插件
//        Properties properties = new Properties();
//        properties.setProperty("reasonable", "true");
//        properties.setProperty("supportMethodsArguments", "true");
//        properties.setProperty("returnPageInfo", "check");
//        properties.setProperty("params", "count=countSql");
//        PageInterceptor pageInterceptor=new PageInterceptor();
//        pageInterceptor.setProperties(properties);
//        //添加插件
//        bean.setPlugins(new Interceptor[]{pageInterceptor});
//
//        //添加XML目录
//        bean.setMapperLocations(getDefaultMapperResources());
//        */
//
//        return bean.getObject();
//    }
//
//    /**
//     * 添加XML资源,如果使用MyBatis的SpringBoot-starter则不要在这配置，可以去
//     * application中直接配置
//     * @return
//     */
//    private Resource[] getDefaultMapperResources() {
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        Resource[] resources = null;
//        try {
//            resources = resolver.getResources("classpath:mapper/*.xml");
//        } catch (IOException ex) {
//            ex.printStackTrace();
//            throw new RuntimeException(ex);
//        }
//        return resources;
//    }
//
//    @Bean
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//}
