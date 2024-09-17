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
public class bai6_tinhchuvivadientichhinhchunhat {
    public static void main(String[] args) {
        double CD,CR,CV,DT;
        System.out.println("chuong trinh tinh CV va DT hinh chu nhat");
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap chieu dai:");
        CD=sc.nextDouble();
        System.out.println("nhap chieu rong:");
        CR=sc.nextDouble();
        CV=(CD+CR)*2;
        System.out.println("chu vi"+CV);
        DT=CD*CR;
        System.out.println("dien tich"+DT);
    }
}
