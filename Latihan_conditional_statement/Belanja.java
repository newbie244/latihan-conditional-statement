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
public class Belanja {
    public static void main(String[] args) {
        int harga,diskon,total;
        
        Scanner belanja = new Scanner(System.in);
        System.out.println("Masukkan Harga Total Belanja Anda");
        harga = belanja.nextInt();
        
        if(harga > 100000){
            diskon = harga-10000;
            total = diskon;
            System.out.println("anda mendapatkan diskon"+ diskon); 
            System.out.println("total belanja anda adalah "+ total);
        }
        
       
    }
}
