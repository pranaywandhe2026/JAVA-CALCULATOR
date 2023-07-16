package basicsofJAVA;

import java.util.Scanner;

public class JavaCalculator {
    static void add(){
        int a,b,c;
        Scanner x=new Scanner(System.in);
        System.out.println("enter any two numbers");
        a=x.nextInt();
        b=x.nextInt();
        c=a+b;
        System.out.println("result="+c);
    }
    static void sub(){
        int a,b,c;
        Scanner x=new Scanner(System.in);
        System.out.println("enter any two numbers");
        a=x.nextInt();
        b=x.nextInt();
        c=a-b;
        System.out.println("result="+c);
    }
    static void mul(){
        int a,b,c;
        Scanner x=new Scanner(System.in);
        System.out.println("enter any two numbers");
        a=x.nextInt();
        b=x.nextInt();
        c=a*b;
        System.out.println("result="+c);
    }
    static void div(){
        float a,b,c;
        Scanner x=new Scanner(System.in);
        System.out.println("enter any two numbers");
        a=x.nextFloat();
        b=x.nextFloat();
        c=a/b;
        System.out.println("result="+c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO MY JAVA CALCULATOR");
        System.out.println("WHICH OPERATION WOULD YOU LIKE TO PERFORM");
        int press;
        System.out.println("press 1 for addition");
        System.out.println("press 2 for substraction");
        System.out.println("press 3 for multiplication");
        System.out.println("press 4 for division");
        press=sc.nextInt();
        switch (press){
            case 1: add();
            break;
            case 2: sub();
                break;
            case 3: mul();
                break;
            case 4: div();
                break;
            default:
                System.out.println("invalid choice");
        }
    }
}
