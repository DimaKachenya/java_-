package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // две точки всегда лежат на одной прямой
        // y1=k*x1+b
        //y2=k*x2+b
        //y1-y2=k*(x1-x2)
        //k1=(y1-y2)/(x1-x2)

        //y2=k*x2+b
        //y3=k*x3+b
        //y2-y3=k(x2-x3)
        //k2=(y2-y3)/(x2-x3)

        //если к1 == к2 то эти три точки лежат на одной прямой


        Scanner in= new Scanner(System.in);
        System.out.println("Введите x1 и y1 ");
        int x1=in.nextInt(), y1=in.nextInt();
        System.out.println("Введите x2 и y2 ");
        int x2=in.nextInt(), y2=in.nextInt();
        System.out.println("Введите x3 и y3 ");
        int x3=in.nextInt(), y3=in.nextInt();


        if(((y1-y2)/(x1-x2))==((y2-y3)/(x2-x3)))
            System.out.print("Они лежат на одной прямой");
        else
            System.out.print("Они не лежат на одной прямой ");

    }
}
