/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class bai18_ArrayLIst1 {
    public static void main(String[] args) {
        System.out.println("chuong trinh ArrayList");
        ArrayList ds = new ArrayList();
        System.out.println("Hien thi ArrayList"+ds);
         
         //thêm 1 tới 9 vào
         for(int i=1;i<10;i++){
             ds.add(i);
         }
         //thêm tên mình vào
        ds.add("dinh");
        //xóa số 7
        ds.remove(6);
        //xóa đầu
        //ds.removeLast();
        //xóa cuối
        //ds.removeFirst();
     
        for (int i=0;i<ds.size();i++){
            System.out.print(ds.get(i)+ " ");
        }
    }
}
