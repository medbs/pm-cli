package com.sb.shared.pm.cli.cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class PmConfig {

    private final ConsulStore ConsulStore;
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsulStore.class);

    public PmConfig(ConsulStore ConsulStore) {
        this.ConsulStore = ConsulStore;
    }


    @ShellMethod("Set Favicon")
    public void favicon(@ShellOption(defaultValue = "pm/settings/favicon") String key, @ShellOption(defaultValue = "/favicon.ico?v=2") String value) {
        ConsulStore.storeValue(key, value);
        LOGGER.info("value inserted");
    }

    @ShellMethod("Set Basic Url.")
    public void basicUrl(@ShellOption(defaultValue = "pm/settings/gateway/keycloak/basic_url") String key, @ShellOption(defaultValue = "http://192.168.163.127:8180/auth") String value) {
        ConsulStore.storeValue(key, value);
    }

    @ShellMethod("Set Client id.")
    public void clientId(@ShellOption(defaultValue = "pm/settings/gateway/keycloak/client_id") String key, @ShellOption(defaultValue = "pm-client") String value) {
        ConsulStore.storeValue(key, value);
    }

    @ShellMethod("Set Client Secret.")
    public void clientSecret(@ShellOption(defaultValue = "pm/settings/gateway/keycloak/client_secret") String key, @ShellOption(defaultValue = "dfa3a8bd-29c9-4239-a627-c8f600caaa26") String value) {
        ConsulStore.storeValue(key, value);
    }

    @ShellMethod("Set home Page.")
    public void homePage(@ShellOption(defaultValue = "pm/settings/gateway/keycloak/home_page") String key, @ShellOption(defaultValue = "https://192.168.163.213:8080") String value) {
        ConsulStore.storeValue(key, value);
    }

    @ShellMethod("Set Realm.")
    public void realm(@ShellOption(defaultValue = "pm/settings/gateway/keycloak/realm") String key, @ShellOption(defaultValue = "pm") String value) {
        ConsulStore.storeValue(key, value);
    }

    @ShellMethod("Set Redirect URI.")
    public void redirectUri(@ShellOption(defaultValue = "pm/settings/gateway/keycloak/redirect_uri") String key, @ShellOption(defaultValue = "https://192.168.163.213:8080/oauth/callback") String value) {
        ConsulStore.storeValue(key, value);
    }

    @ShellMethod("Set Logo.")
    public void logo(@ShellOption(defaultValue = "pm/settings/logo") String key, @ShellOption(defaultValue = "/logo.png") String value) {
        ConsulStore.storeValue(key, value);
    }

    @ShellMethod("Set Health Check Intervals.")
    public void healthCheckIntervals(@ShellOption(defaultValue = "pm/settings/registration/consul/health-check-interval") String key, @ShellOption(defaultValue = "20s") String value) {
        ConsulStore.storeValue(key, value);
    }

    @ShellMethod("Set Module Tag.")
    public void moduleTag(@ShellOption(defaultValue = "pm/settings/registration/consul/module-tag") String key, @ShellOption(defaultValue = "module") String value) {
        ConsulStore.storeValue(key, value);
    }


}
