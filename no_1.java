/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Console;
import java.util.Scanner;
/**
 *
 * @author Ikhsan Maulana
 */
public class no_1 {
    public static void main(String [] args){
        int jumlah;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Input");
        try{
            jumlah = scan.nextInt();
            if(jumlah > 0){
                for (int i = 1; i <= jumlah; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("#");
                    }
                    System.out.print("\n");
                }
            }else{
                System.out.println("Paramemeter harus angka dan positif!");
            }
        }catch(java.util.InputMismatchException e){
            System.out.println("Paramemeter harus angka dan positif!");
        }
    }
}
