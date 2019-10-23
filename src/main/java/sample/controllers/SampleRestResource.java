package sample.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestResource {

    @RequestMapping("")
    public String hello() {
        return "Hello OFBiz user";
    }
}
