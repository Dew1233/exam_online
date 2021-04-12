package com.yegol.exam_online.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration

public class SwaggerConfig {
    @Bean
    public Docket docket(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        ApiInfo apiInfo = new ApiInfoBuilder().contact(
                new Contact("yeGol考试开发文档","http:youzhi1520.com","admin@yegol.com"))
                .title("在线考试帮助文档")
                .description("初步练习")
                .version("1.0")
                .build();
        docket.apiInfo(apiInfo);
//        只扫描controller包
        docket.select()
                .apis(RequestHandlerSelectors.basePackage("com.yegol.exam_online.controller"));

        return docket;
    }
}
