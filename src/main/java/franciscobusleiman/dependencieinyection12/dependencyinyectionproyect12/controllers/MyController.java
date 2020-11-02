package franciscobusleiman.dependencieinyection12.dependencyinyectionproyect12.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello world");

        return "Hello world again";
    }
}
