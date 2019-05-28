package com.wei.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "server")
public class ServerPortConfig {
    private String port;
    private String name;
}