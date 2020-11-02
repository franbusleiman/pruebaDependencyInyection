package franciscobusleiman.dependencieinyection12.dependencyinyectionproyect12.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN", "default"})
@Service("greetingServicei")
public class GreetingServiceImplEng implements GreetingService{

    public void sayHello() {
        System.out.println("Hello folks");
    }
}
