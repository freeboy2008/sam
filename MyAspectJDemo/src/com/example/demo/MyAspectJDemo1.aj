package com.example.demo;

public aspect MyAspectJDemo1 {
 	/**
     * 定义切点,日志记录切点
     */
    pointcut recordLog():call(* HelloWorld.hiHello(..));

    /**
     * 定义切点,权限验证(实际开发中日志和权限一般会放在不同的切面中,这里仅为方便演示)
     */
    pointcut authCheck():call(* HelloWorld.hiHello(..));
    
    /**
     * 定义前置通知!
     */
    before():authCheck(){
        System.out.println("hiHello方法执行前验证权限");
    }

    /**
     * 定义后置通知
     */
    after():recordLog(){
        System.out.println("hiHello方法执行后记录日志");
    }
    
    
    /**
     * 定义后置通知带返回值
     * after(参数)returning(返回值类型):连接点函数{
     *     函数体
     * }
     */
    pointcut hiHello1():call(* HelloWorld.hiHello1(..));
    after() returning(String x):hiHello1(){
        System.out.println("返回值为:"+x);
    }

    /**
     * 异常通知
     * after(参数) throwing(返回值类型):连接点函数{
     *     函数体
     * }
     */
    pointcut hiHello2():call(* HelloWorld.hiHello2(..));
    after() throwing(Exception e):hiHello2(){
        System.out.println("抛出异常:"+e.toString());
    }



    /**
     * 环绕通知 可通过proceed()控制目标函数是否执行
     * Object around(参数):连接点函数{
     *     函数体
     *     Object result=proceed();//执行目标函数
     *     return result;
     * }
     */
    pointcut aroundAdvice():call(* HelloWorld.hiHello3(..));
    Object around():aroundAdvice(){
        System.out.println("sayAround 执行前执行");
        Object result=proceed();//执行目标函数
        System.out.println("sayAround 执行后执行");
        return result;
    }
}
