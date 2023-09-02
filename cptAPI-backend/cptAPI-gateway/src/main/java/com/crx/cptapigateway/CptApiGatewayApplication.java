package com.crx.cptapigateway;

import com.crx.project.provider.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
@EnableDubbo
@Service
public class CptApiGatewayApplication {

    @DubboReference
    private DemoService demoService;
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CptApiGatewayApplication.class, args);
        CptApiGatewayApplication application = context.getBean(CptApiGatewayApplication.class);
        String s = application.doSayHello("world");
        System.out.println(s);


    }
    public String doSayHello(String name){
        return demoService.sayHello(name);
    }

}
