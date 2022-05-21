# spring-aop
Spring AOP basic example

# SUMMARY

**STEP_1:** Add Aspectj Runtime and Aspectj Weaver dependencies in pom.xml
**STEP_2:** Enable _@EnableAspectJAutoProxy_ on the top of main class to work AOP
**STEP_3:** Add _@Component_ on `Aspect class`
_@Aspect_ is used to say class as Aspect class where methods needs to be executed before or after the particular methods in acutal class
@_Pointcut_ is used to tell which method to be called
_@JointPoint_ is used to tell where the method to be called
_@Before_ the method before the actual method is called
_@After_ call the method after the actual method is called
_@AfterReturning_ call the method after the returning the value from the actual method
_@AroundAdvice_ calls before and after the actual method is called
