package franciscobusleiman.dependencieinyection12.dependencyinyectionproyect12.controllers;

import franciscobusleiman.dependencieinyection12.dependencyinyectionproyect12.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class InyectedController {


    private final GreetingService greetingService;


@Autowired
    public InyectedController(@Qualifier("greetingServicei") GreetingService greetingService){
    this.greetingService = greetingService;

}




    public void greet(){
    this.greetingService.sayHello();
    }
}
