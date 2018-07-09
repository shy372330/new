package com.itdreamworks.datamanage.config.shiro;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

/*

  @Override
    public void addCorsMappings(CorsRegistry registry) {
        //允许全部请求跨域
        registry.addMapping("/**");
    }
*/



  @Override
  public void addCorsMappings(CorsRegistry registry) {
      registry.addMapping("/**").allowedOrigins("*")
              .allowedMethods("*").allowedHeaders("*")
              .allowCredentials(true)
              .exposedHeaders(HttpHeaders.SET_COOKIE).maxAge(3600L);
  }


}

