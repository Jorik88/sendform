package com.example.sendform.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "bepaid")
@Component
public class BepaidConfiguration {

    private int attemptCount;
}
