package com.sb.shared.pm.cli.cli;


import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class RegisterComponent {


    void register(String agentHost, String id, String name, String tags, Integer port) {

        ConsulClient client = new ConsulClient(agentHost);

        NewService newService = new NewService();
        newService.setId(id);
        newService.setName(name);
        newService.setTags(Arrays.asList("pm", "v1.0.0-SNAPSHOT"));
        newService.setPort(port);
        client.agentServiceRegister(newService);

    }

}
