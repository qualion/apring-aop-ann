package in.qt.aop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component /* Needed */
public class Advicer 
{
	/*@Before("execution(* in.qt.aop.AdvicedGuy.*(..))")
	public void logMessage()
	{
		System.out.println("before methode execution");
	}*/
	/*@Around("execution(* in.qt.aop.AdvicedGuy.*(..))")
	public void logMessageAround()
	{
		System.out.println("after & before method execution");
	}
	*/
	
	@Pointcut("execution(* in.qt.aop.AdvicedGuy.*(..))")
	public void watcher() {}
	
	@Around("execution(* in.qt.aop.AdvicedGuy.*(..))")
	public void logMessageAroundA(ProceedingJoinPoint jp)
	{
		System.out.println("before around method execution");
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after around  method execution");

	}
	
	@Around("execution(* in.qt.aop.AdvicedGuy.*(..))")
	public void logMessageAroundAA(ProceedingJoinPoint jp)
	{
		System.out.println("before around method execution");
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after around  method execution");

	}
	
	@Before("watcher()")
	public void watch()
	{
		System.out.println("Watcher");
	}
	
	@Before("watcher()")
	public void watch2()
	{
		System.out.println("Watcher 2");
	}
	
	@After("watcher()")
	public void watchafter()
	{
		System.out.println("WatcherAfter ");
	}
}
