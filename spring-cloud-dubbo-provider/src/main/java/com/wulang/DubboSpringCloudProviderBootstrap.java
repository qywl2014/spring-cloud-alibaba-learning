package com.wulang;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@EnableDiscoveryClient
@EnableAutoConfiguration
public class DubboSpringCloudProviderBootstrap {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DubboSpringCloudProviderBootstrap.class)
                .properties("spring.profiles.active=nacos").web(WebApplicationType.NONE)
                .run(args);
    }
}
