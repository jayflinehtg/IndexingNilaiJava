import java.util.Scanner;

public class IndexingNilai {
    public static void main(String[] args) {
        Scanner inputanUser = new Scanner(System.in);

        System.out.println("Halo, sebelum kita mulai, coba input nama kamu dibawah ini");
        String nama = inputanUser.nextLine();

        System.out.println("Sekarang, masukkan NIM kamu!");
        String nim = inputanUser.nextLine();

        System.out.println("Halo " + nama + ", " + " NIM kamu " + nim + " kan? Sekarang coba masukkan nilai kamu.");
        double nilai = inputanUser.nextDouble();

        if (nilai >= 79.5 && nilai <=100){
            System.out.println("Wow, selamat " + nama + ", " + "index dari nilai kamu adalah A! Kamu Keren banget!! Pertahankan kerja keras kamu ya!!!");
        } else if (nilai >= 72 && nilai <79.5){
            System.out.println("Wow, selamat " + nama + ", " + "index dari nilai kamu adalah AB! Kamu Keren banget!! Pertahankan kerja keras kamu ya!!!");
        } else if (nilai >= 64.5 && nilai <72){
            System.out.println("Wow, selamat " + nama + ", " + "index dari nilai kamu adalah B! Kamu keren sudah bisa sampai di titik ini, next time coba lebih keras lagi ya!! ");
        } else if (nilai >= 57 && nilai <64.5){
            System.out.println("Index nilai kamu adalah: BC. Di ujian selanjutnya coba lebih giat lagi belajarnya ya " + nama + ". " + "Kamu pasti bisa!!! Semangat ya");
        } else if (nilai >= 49.5 && nilai <57){
            System.out.println("Index nilai kamu adalah: C. Di ujian selanjutnya coba lebih giat lagi belajarnya ya " + nama + ". " + "Kamu pasti bisa!!! Semangat ya");
        } else if (nilai >= 34 && nilai <49.5){
            System.out.println("Sayang sekali " + nama + ", " + "Nilai yang kamu peroleh belum memuaskan, index nilai kamu adalah D. Di ujian selanjutnya coba lebih giat lagi ya belajarnya!!! Semangat!!!");
        } else if (nilai >= 0 && nilai <34){
            System.out.println("Index nilai kamu adalah: E, kau ga belajar ya " + nama + ", " + "Di ujian selanjutnya belajar ya dek");
        }else {
            System.out.println("Nilai yang kamu berikan tidak valid.");
        }
    }
}
