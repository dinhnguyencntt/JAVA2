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
public class bai5_nhaptenvaxuat {
    public static void main(String[] args) {
        System.out.println("chuong trinh nhap ten va xuat nam sinh:");
          Scanner sc  =new Scanner(System.in);
        System.out.print("nhap ho va ten");
        String hoten=sc.nextLine();
        System.out.print("nhap nam sinh cua ban");
        int namsinh= sc.nextInt();
        System.out.print("chao ban"+hoten);
        System.out.print("tuoi cua ban la "+(2024-namsinh));
    }
}
