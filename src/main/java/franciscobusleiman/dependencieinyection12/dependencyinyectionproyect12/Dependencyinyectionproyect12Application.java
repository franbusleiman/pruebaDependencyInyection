package franciscobusleiman.dependencieinyection12.dependencyinyectionproyect12;

import franciscobusleiman.dependencieinyection12.dependencyinyectionproyect12.controllers.InyectedController;
import franciscobusleiman.dependencieinyection12.dependencyinyectionproyect12.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class Dependencyinyectionproyect12Application {

	public static void main(String[] args) {

		ApplicationContext ctx =SpringApplication.run(Dependencyinyectionproyect12Application.class, args);


		InyectedController controller = (InyectedController)ctx.getBean("inyectedController");

		controller.greet();

	}

}
