/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class de_2_cau1 {

    public static void main(String[] args) {
        System.out.println("chuong trinh day so Fibonacci");

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap day so Fibonacci");
        int c = sc.nextInt();
        ArrayList<Integer> ds = new ArrayList<>();
        int a = 0, b = 1;
        int sum = 0;
        System.out.println("day so fibonacci la : ");
        for (int i = 0; i < c; i++) {
            ds.add(a);
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        
        for (int num : ds) {
            sum += num;
        }
        System.out.println("\nTong:  " + sum);
        sc.close();
    }
}
