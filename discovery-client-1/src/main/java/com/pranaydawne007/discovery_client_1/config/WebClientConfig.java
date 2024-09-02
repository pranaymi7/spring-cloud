package com.pranaydawne007.discovery_client_1.config;

import com.netflix.discovery.converters.Auto;
import com.pranaydawne007.discovery_client_1.client.EmployeeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.reactive.LoadBalancedExchangeFilterFunction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class WebClientConfig {
    @Autowired
    private LoadBalancedExchangeFilterFunction filterFunction;

    @Bean
    public WebClient employeeWebCLient(){
        return WebClient.builder()
                .baseUrl("http://discovery-client-2")
                .filter(filterFunction)
                .build();
    }

    @Bean
    public EmployeeClient employeeClient(){
        HttpServiceProxyFactory httpServiceProxyFactory =
                HttpServiceProxyFactory.builderFor(WebClientAdapter.create(employeeWebCLient())).build();

        return httpServiceProxyFactory.createClient(EmployeeClient.class);
    }
}
