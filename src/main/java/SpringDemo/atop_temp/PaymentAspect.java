package SpringDemo.atop_temp;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class PaymentAspect {
    @Before("execution(* SpringDemo.atop_temp.PaymentService.makePayment(..))")       //will run for any return type and any arguments passed (.. means 0 or more arguments)
    void beforePayment()
    {
        System.out.println("Before Payment");
    }

    @After("execution(* SpringDemo.atop_temp.PaymentService.makePayment(..))")
    void afterPayment()
    {
        System.out.println("Payment has been processed");
    }

    @AfterReturning(value = "execution(* SpringDemo.atop_temp.PaymentService.makePayment(..))",returning = "amt")
    void afterPaymentReturn(int amt)
    {
        System.out.println("After Payment returned :"+amt);
    }

    @Around("execution(* SpringDemo.atop_temp.PaymentService.makePayment(..))")
    int timer(ProceedingJoinPoint proceedingJoinPoint)      //proceedingJoinPoint contains 100(arg passed) as argument
    {
        long start=System.nanoTime();
        Object proceed = null;
        Object args[]= proceedingJoinPoint.getArgs();
        System.out.println(Arrays.toString(args));      //will give the arguments passed in makePayment function as a list
        try {
           proceed= proceedingJoinPoint.proceed();
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        long duration=System.nanoTime()-start;

        System.out.printf("It took [%d] nanos to make payment\n",duration);
        System.out.println("After invoking makePayment() method, Return value= "+proceed);
        return (Integer) proceed;
    }

}
