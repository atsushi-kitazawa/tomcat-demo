package com.example.atsushi.kitazawa.tomcatdemo;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SystemPropertyController {

    @GetMapping("systemProperties")
    public Collection<String> displaySystemProperties() {
        return Arrays.asList(System.getProperty("key1"), System.getProperty("key2"), System.getProperty("key3"));
    }
}
