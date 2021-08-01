package com.company;

import java.util.Scanner;


public class Execute {
    public void giailode() {
        Integer n;
        Scanner input = new Scanner(System.in);
        boolean check = false;
        System.out.print("Input value: ");
        while (!check) {
            try {
                n = input.nextInt();
                if (n > 100) {
                    check = true;
                    System.out.println("Your lottery is: " + (n %= 100));
                } else {
                    System.out.println("retype cuz you input <100");
                    System.out.print("Retype: " + input.nextLine());
                }
            } catch (Exception e) {
                System.out.println("Input number only!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
    }

    public void giailode2(){
        Integer n;
        int n2;
        Scanner input = new Scanner(System.in);
        boolean check = false;
        System.out.print("Input value: ");
        while (!check) {
            try {
                n = input.nextInt();
                if (n > 100) {
                    check = true;
                    n2 = n/100;
                    n = n - n2*100;
                    System.out.println(n);
                } else {
                    System.out.println("retype cuz you input <100");
                    System.out.print("Retype: " + input.nextLine());
                }
            } catch (Exception e) {
                System.out.println("Input number only!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
    }
}




