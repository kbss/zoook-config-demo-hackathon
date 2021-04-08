package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DemoService {

    @Value("${grpc_url}")
    private String url;

    @PostConstruct
    private void postContruct() {
        System.out.println("Server URL:" + url);
    }

}
