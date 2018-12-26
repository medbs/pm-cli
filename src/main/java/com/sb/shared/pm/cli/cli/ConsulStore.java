package com.sb.shared.pm.cli.cli;

import com.ecwid.consul.v1.ConsulClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
class ConsulStore {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConsulStore.class);

    private final ConsulClient consulClient;


    ConsulStore(ConsulClient consulClient) {
        this.consulClient = consulClient;
    }

    void storeValue(String key, String value) {
        try {
            consulClient.setKVValue(key, value);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        }
    }

}

