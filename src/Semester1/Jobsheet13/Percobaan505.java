package Semester1.Jobsheet13;

import java.util.Scanner;

public class Percobaan505 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Masukkan panjang");
        p = input.nextInt();
        System.out.println("Masukkan lebar");
        l = input.nextInt();
        System.out.println("Masukkan tinggi");
        t = input.nextInt();
        
        L = hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalah "+ L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah "+ vol);
    }

    static int hitungLuas (int panjang, int lebar) {
        int Luas = panjang*lebar;
        return Luas;
    }
    
    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b)*tinggi;
        return volume;
    }
}
