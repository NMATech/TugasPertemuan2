/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomer2;

import interfaceMatematika;
/**
 *
 * @author LENOVO
 */
public class Matematika implements interfaceMatematika {
    public int pertambahan(int A, int B){
        int hasil = A + B;
        return hasil;
    }
    public int pengurangan(int A, int B){
        int hasil = A - B;
        return hasil;
    }
    public int perkalian(int A, int B){
        int hasil = A * B;
        return hasil;
    }
    public int pembagian(int A, int B){
        int hasil = A / B;
        return hasil;
    }
}
