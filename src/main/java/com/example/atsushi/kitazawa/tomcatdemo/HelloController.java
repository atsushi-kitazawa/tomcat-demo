package com.example.atsushi.kitazawa.tomcatdemo;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello")
    public Collection<String> sayHello() {
        return IntStream.range(0, 5).mapToObj(i -> "Hello" + i)
                .collect(Collectors.toList());
    }
}
