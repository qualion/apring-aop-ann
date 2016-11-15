package in.qt.aop;

import org.springframework.stereotype.Component;

@Component
public class AdvicedGuy {
	public void beAdvised(){
		System.out.println("I am being Advised");
	}

}
