/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projekpertama;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KonversiNilai {
    public static void main(String[] args){
        String nim, nama, matkul, Prodi;
        int nilai;
        Scanner Masukan = new Scanner(System.in);
        nim = Masukan.nextLine();
        System.out.println("Masukan nama = ");
        nama= Masukan.nextLine();
        //====mengambil jurusan dari nim
        Prodi = nim.substring(3);
        System.out.println(Prodi);
    }
    
}
