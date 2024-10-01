/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class de_2_Cau_2 {
    public static void main(String[] args) {
        System.out.println("chương trinh tinh dien tich the tich hinh cau");
        double d,S,V;
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap d: ");
        d=sc.nextDouble();
        S=Math.PI*(d*d);
        System.out.println("Dien tich: "+S);
        V=(Math.PI*(d*d*d))/6;
        System.out.println("The tich: "+V);
    }
}
