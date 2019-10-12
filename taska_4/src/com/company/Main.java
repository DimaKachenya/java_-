package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int A=in.nextInt() ,B=in.nextInt();
        int x=in.nextInt() , y=in.nextInt(), z=in.nextInt();


       if(A==x&&B==y)
            System.out.println("Влезет");
        else if(A==x&&B==z )
            System.out.println("Влезет");
        else if(A==y&&B==x )
            System.out.println("Влезет");
        else if(A==y&&B==z )
            System.out.println("Влезет");
        else if(A==z&&B==x )
            System.out.println("Влезет");
        else if(A==z&&B==y )
            System.out.println("Влезет");
        else
           System.out.println("не влезет");











    }
}
