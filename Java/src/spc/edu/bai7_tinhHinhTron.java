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
public class bai7_tinhHinhTron {
    public static void main(String[] args) {
        double R,CV,DT;
        System.out.println("chuong trinh tinh hinh tròn:");
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap R:");
        R=sc.nextDouble();
         CV=2*Math.PI*R;
        System.out.println("chu vi="+CV);
        DT=R*R*Math.PI;
        System.out.println("dien tich="+DT);
    }
}
