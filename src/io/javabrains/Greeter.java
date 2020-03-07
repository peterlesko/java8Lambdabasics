package io.javabrains;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args){
        Greeter greeter = new Greeter();
                                                                                    //Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting lambdaGreeting = () -> System.out.println("Hello world!");

        Greeting innerClassGreeting = new Greeting() {
            public void perform() {
                System.out.print("Hello world!");
            }
        };

        greeter.greet(lambdaGreeting);
        greeter.greet(innerClassGreeting);


        //helloWorldGreeting.perform();
        //lambdaGreeting.perform();
        //greeter.greet(helloWorldGreeting);
    }
}
