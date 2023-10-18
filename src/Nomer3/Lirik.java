/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomer3;

/**
 *
 * @author LENOVO
 */
public class Lirik {
    String line = "There was a farmer who had a dog,\nAnd Bingo was his name-o.";
    String clap = "(clap) - I - N - G - O";

    public Lirik() {
    }

    public void sing() {
        for (int i = 0; i < 5; i++) {
            System.out.println(line);
            
            if(i == 1){
                clap = "(clap) - (clap) - N - G - O";
            }else if (i == 2) {
                clap = "(clap) - (clap) - (clap) - G - O"; 
            }else if(i == 3){
                clap = "(clap) - (clap) - (clap) - (clap) - O";
            }else if(i == 4){
                clap = "(clap) - (clap) - (clap) - (clap) - (clap)";
            }
            
            for(int j = 0; j < 3; j++){
                System.out.println(clap + "\n");
            }
        }
    }
}
