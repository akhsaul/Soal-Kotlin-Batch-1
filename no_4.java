/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ikhsan Maulana
 */
public class no_4 {
    public static void main(String[] args){
        String kalimat = "cepat kerjakan!!!";
        char[] data = kalimat.toCharArray();
        String[][] tes = new String[100][100];
        int[] total = new int[100];
        
            for(int i=0; i<data.length; i++){
                tes[i][0] = Character.toString(data[i]);
                
                if(tes[i][0].equalsIgnoreCase("a")){
                    total[0]++;
                    tes[0][0] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("b")){
                    total[1]++;
                    tes[0][1] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("c")){
                    total[2]++;
                    tes[0][2] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("d")){
                    total[3]++;
                    tes[0][3] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("e")){
                    total[4]++;
                    tes[0][4] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("f")){
                    total[5]++;
                    tes[0][5] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("g")){
                    total[6]++;
                    tes[0][6] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("h")){
                    total[7]++;
                    tes[0][7] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("i")){
                    total[8]++;
                    tes[0][8] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("j")){
                    total[9]++;
                    tes[0][9] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("k")){
                    total[10]++;
                    tes[0][10] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("l")){
                    total[11]++;
                    tes[0][11] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("m")){
                    total[12]++;
                    tes[0][12] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("n")){
                    total[13]++;
                    tes[0][13] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("o")){
                    total[14]++;
                    tes[0][14] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("p")){
                    total[15]++;
                    tes[0][15] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("q")){
                    total[16]++;
                    tes[0][16] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("r")){
                    total[17]++;
                    tes[0][17] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("s")){
                    total[18]++;
                    tes[0][18] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("t")){
                    total[19]++;
                    tes[0][19] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("u")){
                    total[20]++;
                    tes[0][20] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("v")){
                    total[21]++;
                    tes[0][21] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("w")){
                    total[22]++;
                    tes[0][22] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("x")){
                    total[23]++;
                    tes[0][23] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("y")){
                    total[24]++;
                    tes[0][24] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("z")){
                    total[25]++;
                    tes[0][25] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("!")){
                    total[26]++;
                    tes[0][26] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("@")){
                    total[27]++;
                    tes[0][27] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("#")){
                    total[28]++;
                    tes[0][28] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("$")){
                    total[29]++;
                    tes[0][29] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("%")){
                    total[30]++;
                    tes[0][30] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("^")){
                    total[31]++;
                    tes[0][31] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("&")){
                    total[32]++;
                    tes[0][32] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase(".")){
                    total[33]++;
                    tes[0][33] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase(",")){
                    total[34]++;
                    tes[0][34] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("?")){
                    total[35]++;
                    tes[0][35] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase(":")){
                    total[36]++;
                    tes[0][36] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("/")){
                    total[37]++;
                    tes[0][37] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase(";")){
                    total[38]++;
                    tes[0][38] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("=")){
                    total[39]++;
                    tes[0][39] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("+")){
                    total[40]++;
                    tes[0][40] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("-")){
                    total[41]++;
                    tes[0][41] = tes[i][0];
                }else if(tes[i][0].equalsIgnoreCase("_")){
                    total[42]++;
                    tes[0][42] = tes[i][0];
                }
            }
        boolean duplicate = false;
        boolean noDuplicate = true;
        for(int i=0; i<total.length; i++){
            if(total[i] > 1){
                System.out.println("huruf " + tes[0][i] +" jumlahnya ada = " + total[i]);
                noDuplicate = false;
            }else if(total[i] == 1 && noDuplicate){
                duplicate = true;
            }
        }
        
        if(duplicate){
            System.out.println("Tidak ada duplicate");
        }
    }
}
