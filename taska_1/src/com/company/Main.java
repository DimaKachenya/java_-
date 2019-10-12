package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in= new Scanner(System.in);
        int a=in.nextInt(), b=in.nextInt() , c;
        if(a+b<180) {
            System.out.println("существует");
            c=180-a-b;
            if(a==90||b==90||c==90)
                System.out.println("прямоугольный");
            else
                System.out.println("не прямоугольный");
        }
        else
            System.out.println("несуществует");



    }
}
