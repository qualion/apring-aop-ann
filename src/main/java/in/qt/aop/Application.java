package in.qt.aop;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@ComponentScan
@EnableAspectJAutoProxy
@SpringBootApplication
public class Application 
{ 
	public static void main(String a[])
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		AdvicedGuy ag = context.getBean(AdvicedGuy.class);
		ag.beAdvised();
	 
		 
	}
}
