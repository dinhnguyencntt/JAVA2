/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spc.edu;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Administrator
 */
public class bai15_JFrame1 {
    public static void main(String[] args) {
        //tạo một JFrame mới
        JFrame frame= new JFrame("ví dụ đơn giản");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);//kích thước cửa sổ
        //tạo một JPaner
        JPanel panel=new JPanel();
        //tạo một nút
        JButton button= new JButton("nhấn tôi!");
        //thêm nút vào JPanel
        panel.add(button);
        //thêm JPannel Vào JFrame
        frame.add(panel);
        //hiển thị cửa sổ
        frame.setVisible(true);
    }
}
