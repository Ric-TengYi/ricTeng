package com.cloud.starter;

import cn.hutool.core.net.NetUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class RicApplication {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ConfigurableApplicationContext applicationContext = SpringApplication.run(RicApplication.class, args);

        log.info(">>>>>>>>>>>>>>>>>>>>>> forklift（profiles: {}）启动成功，启动时长: {}s，当前IP: {}，PORT: {} <<<<<<<<<<<<<<<<<<<<<<<<",
                applicationContext.getEnvironment().getProperty("spring.profiles.active"),
                (System.currentTimeMillis() - startTime) / 1000.0,
                NetUtil.getLocalhostStr(),
                applicationContext.getEnvironment().getProperty("server.port"));
    }
}
