/**
 *
 */
package com.itplayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author caijun.yang
 */
@SpringBootApplication
@Controller
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

        return "hello spring device";
    }
    @RequestMapping("/hq")
    public ModelAndView mvc1() {
        return new ModelAndView("index");
    }

}
