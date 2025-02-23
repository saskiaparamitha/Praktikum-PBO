/* Nama File : MGaris.java
 * Deskripsi : Main class untuk menggunakan class Garis
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 23 Feb 2025
 */

 public class MGaris {
    public static void main(String[] args) {
        // Membuat objek Garis
        Titik titikAwal1 = new Titik(-2, 0);
        Titik titikAkhir1 = new Titik(0, 4);
        Garis garis1 = new Garis(titikAwal1, titikAkhir1);

        // Menampilkan informasi garis
        System.out.println("Informasi Garis 1:");
        garis1.printGaris();
        System.out.println("Panjang Garis: " + garis1.getPanjang());
        System.out.println("Gradien Garis: " + garis1.getGradien());
        System.out.println("Titik Tengah Garis: (" + garis1.getTitikTengah().getAbsis() + ", " + garis1.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis: " + garis1.getPersamaanGaris());

        // Membuat objek Garis lain untuk pengujian sejajar dan tegak lurus
        Titik titikAwal2 = new Titik(1, 1);
        Titik titikAkhir2 = new Titik(2, 3);
        Garis garis2 = new Garis(titikAwal2, titikAkhir2);

        System.out.println("\nInformasi Garis 2:");
        garis2.printGaris();
        System.out.println("Panjang Garis: " + garis2.getPanjang());
        System.out.println("Gradien Garis: " + garis2.getGradien());
        System.out.println("Titik Tengah Garis: (" + garis2.getTitikTengah().getAbsis() + ", " + garis2.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan Garis: " + garis2.getPersamaanGaris());

        // Pengujian sejajar dan tegak lurus
        System.out.println("\nApakah Garis 1 sejajar dengan Garis 2? " + garis1.isSejajar(garis2));
        System.out.println("Apakah Garis 1 tegak lurus dengan Garis 2? " + garis1.isTegakLurus(garis2));

        // Menampilkan jumlah objek Garis yang telah dibuat
        System.out.println("\nJumlah objek Garis yang telah dibuat: " + Garis.getCounterGaris());
    }
}
