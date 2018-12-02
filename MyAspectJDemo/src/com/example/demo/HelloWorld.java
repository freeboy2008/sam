package com.example.demo;

public class HelloWorld {

    public void hiHello(){
        System.out.println("hello world !");
    }
    
    public String hiHello1(){
        return "Hello world Test1";
    }
    
    public void hiHello2() throws Exception{
        throw new Exception("Hello world Test2");
    }
    
    public void hiHello3(){
        System.out.println("hello world !");
    }
    
    public static void main(String args[]){
    	HelloWorld helloWorld =new HelloWorld();
    	helloWorld.hiHello();
    	helloWorld.hiHello1();
    	helloWorld.hiHello3();
    	try {
			helloWorld.hiHello2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

