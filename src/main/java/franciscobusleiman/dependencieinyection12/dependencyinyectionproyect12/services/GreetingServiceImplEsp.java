package franciscobusleiman.dependencieinyection12.dependencyinyectionproyect12.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("greetingServicei")
public class GreetingServiceImplEsp implements GreetingService{

    public void sayHello() {
        System.out.println("Hola amigos");
    }
}
