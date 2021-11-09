package com.codeforgeyt.vaultdemomvn.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VaultConfiguration {
    @Value("${client_id}")
    public String clientId;

    @Value("${client_secret}")
    public String clientSecret;

    public String getLogin() {
        return clientId;
    }

    public void setLogin(String login) {
        this.clientId = login;
    }

    public String getPassword() {
        return clientSecret;
    }

    public void setPassword(String password) {
        this.clientSecret = password;
    }
}
