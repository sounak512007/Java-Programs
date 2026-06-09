// Program to Perform Mathematical Operations Using Inheritance

import java.util.Scanner;

// Super Class

class AddSub 
{
    int a, b;

    void getData(int x, int y) 
    {
        a = x;
        b = y;
    }

    void add() 
    {
        System.out.println("Addition = " + (a + b));
    }

    void subtract() 
    {
        System.out.println("Subtraction = " + (a - b));
    }
}

// Sub Class

class MulDiv extends AddSub 
{

    void multiply() 
    {
        System.out.println("Multiplication = " + (a * b));
    }

    void divide() 
    {
        if(b != 0)
            System.out.println("Division = " + (a / b));
        else
            System.out.println("Division by zero not possible");
    }
}

// Main Class

class MathOperations 
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        MulDiv obj = new MulDiv();

        obj.getData(x, y);

        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();
    }
}