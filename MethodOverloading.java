//Method overloading in Java refers to the ability to define multiple methods with the same name but different parameters within a class. It allows you to provide different implementations of a method based on the type and number of arguments passed.

Here's an example of method overloading in Java:

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum1 = calculator.add(3, 4);
        double sum2 = calculator.add(2.5, 3.7);
        int sum3 = calculator.add(1, 2, 3);

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}
//
In this example, the Calculator class has three add methods, each with a different number and type of parameters. The first add method takes two integers and returns their sum, the second add method takes two doubles and returns their sum, and the third add method takes three integers and returns their sum.

In the Main class, we create an instance of the Calculator class and call each add method with different arguments. The Java compiler determines the appropriate method to invoke based on the number and types of arguments provided.

Output:
Sum 1: 7
Sum 2: 6.2
Sum 3: 6
As you can see, method overloading allows us to use the same method name for different purposes, providing flexibility and convenience in our code.
