# spring-aop
Spring AOP basic example

# Summary

add aspectj runtime and aspectj weaver dependencies in pom.xml
enable @EnableAspectJAutoProxy on the top of main class to work AOP
@Aspect is used to say class as Aspect class where methods needs to be executed before or after the particular methods in acutal class
@Pointcut is used to tell which method to be called
@JointPoint is used to tell where the method to be called
@Before calls the method before the actual method is called
@After call the method after the actual method is called
@AfterReturning call the method after the returning the value from the actual method
@AroundAdvice calls before and after the actual method is called
