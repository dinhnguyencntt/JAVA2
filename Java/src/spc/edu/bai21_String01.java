/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

import java.util.Scanner;
import javax.swing.SpringLayout;

/**
 *
 * @author Administrator
 */
public class bai21_String01 {
    public static void main(String[] args) {
        System.out.println("nhap ho va ten xuat thong tin");
        Scanner sc  =new Scanner(System.in);
        System.out.print("nhap ho va ten:  ");
        String hoten=sc.nextLine();
      
        System.out.println("ho:"+hoten.substring(0,7));
        System.out.println("chu lot:"+hoten.substring(7,11));
        System.out.println("ten :"+hoten.substring(11,15));
        System.out.println("chu in hoa:"+hoten.toUpperCase());
        System.out.println("do dai: "+hoten.length());
    }
    
}
