/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percabangan;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class PraktikPercabangan {
        public static void main(String[] args) {
        int x;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        x = input.nextInt();

        if (x >= 10) {
            if (x <= 20) {
                System.out.println("\nNilai " + x + " ada di antara 10 dan 20");
            } else {
                System.out.println("\nNilai " + x + " lebih dari 20");
            }
        } else {
            System.out.println("\nNilai " + x + " kurang dari 10");
        }
    }
}
