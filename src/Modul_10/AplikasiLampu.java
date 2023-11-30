package Modul_10;

import java.util.Scanner;

public class AplikasiLampu {
    public static void main(String[] args) {
        Lampu lampu = new Lampu();
        Scanner sc = new Scanner(System.in);
        lampu.statusLampu = lampu.setSaklar(0);
        System.out.println("Status lampu saat ini: "
                + lampu.statusLampu + "\nketikkan");
        System.out.println("2 untuk menyalakan lampu terang \n1 untuk meredupkan lampu \n0 untuk mematikan lampu");
        while (true) {
            System.out.println("___________________\nStatus lampu = " + lampu.statusLampu);
            System.out.println("Masukkan pilihan : "); int input = sc.nextInt();

            if(input==2){
                lampu.hidupkanLampu();
            } else if(input==1){
                lampu.redupkanLampu();
            } else if(input==0){
                lampu.matikanLampu();
            } else {
                System.out.println("Keluar dari program lampu");
                break;
            }
        }
    }
}