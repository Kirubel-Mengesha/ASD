package customers.Aop;

import customers.integration.ILogger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
@Aspect
public class TraceEmail {
    @Autowired
    private ILogger logger;
    @After("execution(* customers.integration.EmailSender.sendEmail(..))")
    public void trace(JoinPoint joinpoint) {
        System.out.println(LocalDateTime.now() + " method= " + joinpoint.getSignature().getName());
    }
}
