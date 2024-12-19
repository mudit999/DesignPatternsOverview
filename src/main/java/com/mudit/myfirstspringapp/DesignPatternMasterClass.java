package com.mudit.myfirstspringapp;
import com.mudit.myfirstspringapp.pool.Car;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesignPatternMasterClass {

    @RequestMapping("/hello")
    public String sayHello(){
        Car car = new Car
                .Builder()
                .initBmwM4Defaults()
                .color("red").build();
        return "Hello";
    }

    @RequestMapping("/hello/{name}")
    public String sayHelloToPerson(@PathVariable("name") String name){
        return "Hello " + name;
    }
}

/*
--- Patterns covered in this project
- Singleton
- Adaptor
- Observer : logging/monitoring
- Builder


--- Useful patterns
- Factory
- Decorator
 */