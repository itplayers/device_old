/**
 *
 */
package com.itplayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author caijun.yang
 */
@SpringBootApplication
@RestController
//@EnableSwagger2
public class DeviceApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DeviceApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {

        return "hello spring security";
    }

}
