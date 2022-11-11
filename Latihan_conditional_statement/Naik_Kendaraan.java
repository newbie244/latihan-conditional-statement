/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_conditional_statement;

import java.util.Scanner;

/**
 *
 * @author LK5_20
 */
public class Naik_Kendaraan {
    public static void main(String[] args) {
        String kendaraan;
        
        Scanner transportasi = new Scanner(System.in);
        
         System.out.println("Masukkan Jumlah Penumpang");
         kendaraan = transportasi.nextLine();
         
         switch(kendaraan){
             case "1":
                 System.out.println("Sepeda");
                 break;
                 
             case "2":
                 System.out.println("Motor");
                 break;
                 
             case "3":
                 System.out.println("Becak");
                 break;
                 
             case "4":
                 System.out.println("Mobil");
                 break;
                 
             default :
                 System.out.println("Bus");
         }  
     }
}
