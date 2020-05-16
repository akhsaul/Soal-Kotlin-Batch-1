/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Ikhsan Maulana
 */
public class no_3 {
    static void triangle(int rows){
        int i, j;
        if(rows%2 != 0){
            for(i=1; i<=rows; i++){
                for(j=1; j<i; j++){
                    System.out.print(" ");//printf(" ");
                }
                for(j=1; j<=(rows*2 - (2*i-1)); j++){
                    if(i==1 || j==1 || j==(rows*2 - (2*i - 1))){
                        System.out.print("o");//printf("*");
                    }else{
                        System.out.print("x");//printf(" ");
                    }
                }
                System.out.println("");//printf("\n");
            }
        }else{
            System.out.println("Input wajib Bilangan Ganjil");
        }
    }
    public static void main(String [] args){
        System.out.print("Masukkan Input: ");
        Scanner scan = new Scanner(System.in);
        triangle(scan.nextInt());
    }
}
