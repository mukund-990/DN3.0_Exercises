package com.library.aspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
    @Before("execution(* com.library.service.BookService.*(..))")
    public void logBefore() {
        System.out.println("Logging before method execution...");
        logger.info("before");
    }

    @After("execution(* com.library.service.BookService.*(..))")
    public void logAfter() {
        System.out.println("Logging after method execution...");
        logger.info("after");
    }
}
