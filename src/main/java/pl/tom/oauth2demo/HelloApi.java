package pl.tom.oauth2demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @GetMapping("/appi/hello")
    public String sayHello(){
        return "Hello";
    }
}
