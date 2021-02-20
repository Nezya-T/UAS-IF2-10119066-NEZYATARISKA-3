/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119066.nezyatariska.pkg3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class UASIF210119066NEZYATARISKA3 {
    
    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        // TODO code application logic here
        String dewasa;
        int umur = 0 ;
        Scanner n = new Scanner(System.in);
        
        System.out.println("Masukan Umur Anda : ");
        umur = n.nextInt();
        
        if (umur >= 17){
            dewasa = "true";
        }
        else{
            dewasa = "false";
        }
        System.out.println("Status Dewasa : "+dewasa);
    }
}