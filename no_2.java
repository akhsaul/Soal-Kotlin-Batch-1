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
public class no_2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan kalimat sebagai input");
        String kata = scan.nextLine();
        String[] cek_kata = kata.split("\\s+");
        int total = cek_kata.length;
        int totalNum = 0;
        
        for(String result : cek_kata){
            char[] data = result.toCharArray();
            boolean isAngka;
            int num = 0;
            int i=0;
            while( i<data.length){
                isAngka = Character.isDigit(data[i]);
                if(isAngka){
                    num++;
                }
                i++;
            }
            if(num > 0){
                totalNum++;
            }
        }
        System.out.println((total-totalNum)+"/"+total);
    }
}
