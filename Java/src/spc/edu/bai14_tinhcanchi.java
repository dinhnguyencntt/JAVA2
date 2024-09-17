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
public class bai14_tinhcanchi {
    public static void main(String[] args) {
            System.out.println("chuong trinh tinh can chi nam");
            Scanner sc= new Scanner(System.in);
            System.out.println("nhap nam:");
            int nam=sc.nextInt();
           string can=tinhcan(nam);
           string chi=tinhchi(nam);
            System.out.println("Năm " + nam + " là: " + can + " " + chi);
            sc.close();
       public static String tinhCan(int nam){
        String can = "";
            switch (nam % 10) {
        case 0: 
            can="Canh"; 
            break;
        case 1: 
            can="Tân"; 
            break;
        case 2: 
            can="Nhâm"; 
            break;
        case 3: 
            can="Quý"; 
            break;
        case 4: 
            can="Giáp"; 
            break;
        case 5: 
            can="Ất"; 
            break;
        case 6: 
            can="Bính"; 
            break;
        case 7: 
            can="Đinh"; 
            break;
        case 8: 
            can="Mậu"; 
            break;
        case 9: 
            can="Kỷ"; 
            break;
            }
          
       }
     public static String tinhChi(int nam){
        String chi = "";
    }
            switch (nam % 10) {
        case 0: 
            can="Canh"; 
            break;
        case 1: 
            can="Tân"; 
            break;
        case 2: 
            can="Nhâm"; 
            break;
        case 3: 
            can="Quý"; 
            break;
        case 4: 
            can="Giáp"; 
            break;
        case 5: 
            can="Ất"; 
            break;
        case 6: 
            can="Bính"; 
            break;
        case 7: 
            can="Đinh"; 
            break;
        case 8: 
            can="Mậu"; 
            break;
        case 9: 
            can="Kỷ"; 
            break;
            }
 
}
}
