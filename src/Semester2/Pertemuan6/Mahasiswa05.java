package Semester2.Pertemuan6;

public class Mahasiswa05 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa05() {

    }

    Mahasiswa05(String nm, String name, double ip, String kls) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("IPK   : " + ipk);
        System.out.println("Kelas : " + kelas);
        System.out.println("---------------------------");
    }
}
