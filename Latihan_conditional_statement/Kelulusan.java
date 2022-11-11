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
public class Kelulusan {
    public static void main(String[] args) {
        int nilai;
        String nama;
        
        Scanner kelulusan = new Scanner(System.in);
        
        System.out.println("Siapa Namamu?");
        nama = kelulusan.nextLine();
        System.out.println("Berapa Nilaimu?");
        nilai = kelulusan.nextInt();
        
        if(nilai > 75){
            System.out.println("Selamat "+ nama + ", Anda Lulus");
        }else{
            System.out.println("Maaf " +nama + ", Anda Tidak Lulus");
        }
    }
}
