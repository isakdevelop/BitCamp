package MethodTest;

import java.util.Scanner;

public class WhatName {
    static String inputName(Scanner sc)    {
        System.out.print("학생 이름 : ");
        return sc.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = inputName(sc);
        System.out.print("이름 : " + name);
    }
}


