package com.itdreamworks.datamanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.itdreamworks.datamanage.mapper")
public class DataManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(DataManageApplication.class, args);
    }
}
*/
@SpringBootApplication
@MapperScan("com.itdreamworks.datamanage.mapper")
public class DataManageApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DataManageApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(DataManageApplication.class);
    }
}