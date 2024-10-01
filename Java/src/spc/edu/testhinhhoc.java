/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;

/**
 *
 * @author Administrator
 */
public class testhinhhoc {
    public static void main(String[] args) {
        hinhhoc h;
        h=new hinhchunhat(4,5);
        System.out.println("chu vi"+h.tinhchuvi());
        System.out.println("dientich"+h.tinhdientich());
        System.out.println("-------------");
        h=new hinhvuong(5);
         System.out.println("chu vi"+h.tinhchuvi());
         System.out.println("dientich"+h.tinhdientich());
        hinhchunhat hcn =new hinhvuong(5);
        System.out.println("-------------");
         System.out.println("chu vi"+h.tinhchuvi());
         System.out.println("dientich"+h.tinhdientich());
    }
}
