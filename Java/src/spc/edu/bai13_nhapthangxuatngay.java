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
public class bai13_nhapthangxuatngay {
    public static void main(String[] args) {
        System.out.println("chuong trinh ngay thang");
         Scanner sc= new Scanner(System.in);
        int thang;
        System.out.println("nhap vao thang trong nam:");
        thang=sc.nextInt();
        {
        switch (thang)
        {
                case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
                    System.out.println("thang 31  ngay");
                    break;
                case 4:
		case 6:
		case 9:
		case 11:
                    System.out.println("thang co 30 ngay");
                    break;
                case 2:
                   System.out.println("thang co 28 ngay hoac 29 ngay");
                   
                    break;
                default:
                    System.out.println("khong co thang trong nam");
                    break;
        }
}
    }
  }