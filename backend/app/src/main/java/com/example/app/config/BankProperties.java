package com.example.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "bank")
public class BankProperties {

    private String name;
    private String apiBaseUrl;
    private String notificationSender;

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getApiBaseUrl() { return apiBaseUrl; }
    public void setApiBaseUrl(String apiBaseUrl) { this.apiBaseUrl = apiBaseUrl; }

    public String getNotificationSender() { return notificationSender; }
    public void setNotificationSender(String notificationSender) { this.notificationSender = notificationSender; }
}
