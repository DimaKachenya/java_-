package com.company;
import java.util.Scanner;

import static java.lang.Math.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int a=in.nextInt() , b=in.nextInt() , c=in.nextInt();
        System.out.println(max(min(a,b),min(c,b)));

    }
}
