/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projekbaru;

import java.util.Scanner;
/**
 *
 * @author PC 12 - LAB R1
 */
public class pb2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
String namaDepan = "";
String namaBelakang = "";
Scanner input = new Scanner(System.in);
System.out.println("Nama Depan : ");
//membaca inputan user
namaDepan = input.next();
System.out.println("Nama Belakang : ");
//membaca inputan user
namaBelakang = input.next();
System.out.println("Nama Saya adalah :");
System.out.println(namaDepan + " " + namaBelakang);
}

    }
    

