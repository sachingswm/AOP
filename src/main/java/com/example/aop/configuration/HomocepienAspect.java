package com.example.aop.configuration;

import com.example.aop.dao.HomosepienDao;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class HomocepienAspect {

    @Autowired
    private HomosepienDao homosepienDao;


    @Before("execution(* com.example.aop.service.HomosepienService.saveHomosepien(..))")
    public void beforeSaving(JoinPoint joinPoint)
    {
        System.out.println("Saving Homosepien");
    }
    @After("execution(* com.example.aop.service.HomosepienService.deleteHomosepien(..)) && args(id)")
    public void afterDeletion(JoinPoint joinPoint,int id)
    {
        System.out.println("Homecepien deleted");
    }
    @Around("execution(* com.example.aop.service.HomosepienService.*(..))")
    public void aliveFor(ProceedingJoinPoint joinPoint)throws Throwable
    {
        long start=System.currentTimeMillis();
        try{
            joinPoint.proceed();
        }
        catch (Exception e)
        {

        }
        finally {

        }
        System.out.println(System.currentTimeMillis()-start);
    }
}
