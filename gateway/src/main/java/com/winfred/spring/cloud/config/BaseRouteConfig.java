package com.winfred.spring.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseRouteConfig {

//    @Bean
//    public RouteLocator test(RouteLocatorBuilder routeLocatorBuilder) {
//
//        return routeLocatorBuilder.routes().route("test", r -> {
//            r.path("local").uri("www.baidu.com");
//        })
//                .build();
//    }
}
