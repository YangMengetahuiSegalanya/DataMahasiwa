package com.TugasPemrograman;
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Penghasilan: "); long penghasilan = Long.valueOf(sc.nextLine());
        int pajak = 0;
        if(penghasilan < 0) {
            System.out.println("Penghasilan tidak bisa minus");
            return;
        }else if(penghasilan <= 50000000) {
            pajak = 5;
        }else if(penghasilan <= 150000000) {
            pajak = 15;
        }else if(penghasilan <= 500000000) {
            pajak = 25;
        }else if(penghasilan > 500000000) {
            pajak = 30;
        }
        double bayar = penghasilan * pajak / 100f;
        System.out.printf("Pajak yang harus dibayar: %.2f", bayar);
    }
}