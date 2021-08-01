package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap 1 hoac 2 de tinh lo de: ");
        int i;
        Scanner nhap = new Scanner(System.in);
        i = nhap.nextInt();
        switch (i) {
            case 1:
                Execute lo = new Execute();
                lo.giailode();
                break;

            case 2:
                Execute lo2 = new Execute();
                lo2.giailode2();
                break;
        }
    }
}
