package com.sb.shared.pm.cli.cli;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class RegisterPmComponent {

    private final RegisterService registerService;
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsulStore.class);

    public RegisterPmComponent(RegisterService registerService) {
        this.registerService = registerService;
    }


    @ShellMethod("Register Header")
    public void registerHeader(@ShellOption(defaultValue = "header-1") String id, @ShellOption(defaultValue = "header") String name, @ShellOption(defaultValue = "pm") String tags, @ShellOption(defaultValue = "localhost") String address, @ShellOption(defaultValue = "8080") Integer port, @ShellOption(defaultValue = "{\"HTTP\": \"http://'$1':8080/pm-header.js\", \"Interval\": \"10s\" }") String check) {
        registerService.register("localhost", id, name, tags, address, port, check);
        LOGGER.info("value inserted");
    }

    @ShellMethod("Register SDK")
    public void registerSdk(@ShellOption(defaultValue = "sdk-1") String id, @ShellOption(defaultValue = "sdk") String name, @ShellOption(defaultValue = "pm") String tags, @ShellOption(defaultValue = "localhost") String address, @ShellOption(defaultValue = "8080") Integer port, @ShellOption(defaultValue = "{\"HTTP\": \"http://'$1':8080/v1/script.js\", \"Interval\": \"10s\" }") String check) {
        registerService.register("localhost", id, name, tags, address, port, check);
        LOGGER.info("value inserted");
    }

}
