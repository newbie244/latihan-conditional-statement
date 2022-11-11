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
public class Menonton_Film_Bioskop {
    public static void main(String[] args) {
        String Film;
        
        Scanner bioskop = new Scanner(System.in);
        
         System.out.println("Masukkan Kategori Umur Penonton");
         Film = bioskop.nextLine();
         
         switch(Film){
             case "Anak-Anak":
                 System.out.println("Kartun");
                 break;
             case "Remaja":
                 System.out.println("Drama");
                 break;
             default :
                 System.out.println("Action");
         }  
     }
}
