/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author Admin
 * 
 */
public class bài_3 {
class NhanVien{
    
String tenNhanVien ;
double Luongcoban;
double hesoLuong;
final double Max_Salary = 20000000;//add random
void inTTin(){
    System.out.println("Staff's name: "+ tenNhanVien);
    System.out.println("Basic salary "+ Luongcoban);
    System.out.println("Coefficients salary "+ hesoLuong);
    
}
double luong;
boolean tangluong;

        public double getLuong() {
            return luong;
        }

        public void setLuong(double luong) {
            this.luong = Luongcoban*hesoLuong;
        }

        public boolean getTangluong() {
            return tangluong;
        }

        public boolean setTangluong(double tangluong) {
            if((hesoLuong+1)*Luongcoban>Max_Salary)
            {
                System.out.println("Your salary exceeps the maximum.");
                return false;
            }else{
                System.out.println("Your salary increase is acepted");
                hesoLuong ++;
                return  true;
            }
            
                    
        }

}    
}
