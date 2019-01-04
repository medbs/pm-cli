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
    public String registerHeader(@ShellOption(defaultValue = "header-1") String id, @ShellOption(defaultValue = "header") String name, @ShellOption(defaultValue = "pm") String tags, @ShellOption(defaultValue = "localhost") String address, @ShellOption(defaultValue = "8080") Integer port, @ShellOption(defaultValue = "http://'localhost':8080/pm-header.js") String http, @ShellOption(defaultValue = "10s") String interval) {
        registerService.register("localhost", id, name, tags, address, port, http, interval);

        return "Header registration : Id, Name, Tags, Address, Port and Checks inserted with the following values: " + id + " ," + name + " ," + tags + " ," + address + " ," + port + " ," + "{HTTP:" + http + ",Interval: " + interval + "}";
    }

    @ShellMethod("Register SDK")
    public String registerSdk(@ShellOption(defaultValue = "sdk-1") String id, @ShellOption(defaultValue = "sdk") String name, @ShellOption(defaultValue = "pm") String tags, @ShellOption(defaultValue = "localhost") String address, @ShellOption(defaultValue = "8080") Integer port, @ShellOption(defaultValue = "http://'localhost':8080/v1/script.js") String http, @ShellOption(defaultValue = "10s") String interval) {

        registerService.register("localhost", id, name, tags, address, port, http, interval);


        return "SDK registration : Id, Name, Tags, Address, Port and Checks inserted with the following values: " + id + " ," + name + " ," + tags + " ," + address + " ," + port + " ," + "{HTTP:" + http + ",Interval: " + interval + "}";


    }

}
