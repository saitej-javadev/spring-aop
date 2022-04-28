package com.saitej.springaop.aspects;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = Logger.getLogger("LoggingAspect");

    @Pointcut("execution(* com.saitej.springaop.service.*.getBooks())")
    void p1() {

    }

    @Before("p1()")
    public void beforeLog(JoinPoint jp) {
        System.out.println();
        System.out.println("Retrieving books.............." + jp.getSignature());
    }

    @After("p1()")
    public void AfterLog() {
        System.out.println("Books retrieved.................");
    }

    @AfterReturning("execution(* com.saitej.springaop.service.*.saveBook(..))")
    public void afterReturning() {
        System.out.println();
        System.out.println("LoggingAspect.afterReturning.........");
    }


    @Around("execution(* com.saitej.springaop.service.*.saveBook(..))")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("LoggingAspect.aroundAdvice");
        ObjectMapper mapper = new ObjectMapper();
        String methodName = pjp.getSignature().getName();
        String className = pjp.getTarget().getClass().toString();
        Object[] array = pjp.getArgs();

        logger.info("method invoked " + className + " : " + methodName + "()" + "arguments : " + mapper.writeValueAsString(array));

        Object object = pjp.proceed();

        logger.info(className + " : " + methodName + "()" + "Response: " + mapper.writeValueAsString(object));

        return object;
    }


    @AfterThrowing(pointcut = "p1()", throwing = "error")
    public void afterThrowing(Throwable error
    ) {
        System.out.println("LoggingAspect.afterThrowing" + error);
    }

}
