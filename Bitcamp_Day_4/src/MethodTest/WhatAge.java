package MethodTest;

import java.util.Scanner;

public class WhatAge {
    static int inputAge(Scanner sc)    {
        System.out.print("학생 나이 : ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = inputAge(sc);
        System.out.print("나이 : " + age);
        System.out.println("사랑해요 그대 있는 모습 그대로 너의 모든 시간 ");
    }
}
