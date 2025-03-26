/* Nama File : MBangunDatar.java
 * Deskripsi : Main class untuk menggunakan class BangunDatar
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 20 Mar 2025
 */

public class MBangunDatar {
    public static void main(String[] args){

    //Membuat objek BangunDatar
    //BangunDatar B1 = new BangunDatar(); 
    BangunDatar P1 = new Persegi(10.0, "Biru", "Putih"); 
    Persegi P2 = new Persegi(5.0, "Ungu", "Merah"); 
    BangunDatar L1 = new Lingkaran(7.0, "Hijau", "Hitam"); 
    Lingkaran L2 = new Lingkaran (14.0, "Coklat", "Hitam");

    //Menampilkan informasi objek Persegi
    System.out.println("Informasi Persegi P1 : ");
    P1.printInfo();
    System.out.println();
    System.out.println("Informasi Persegi P2 : ");
    P2.printInfo();
    System.out.println();

    //Menampilkan informasi objek Lingkaran
    System.out.println("Informasi Lingkaran L1 : ");
    L1.printInfo();
    System.out.println();
    System.out.println("Informasi Lingkaran L2 : ");
    L2.printInfo();
    System.out.println();

    //Membandingkan objek bangundatar

    //Menampilkan informasi sebelum di zoom 
    System.out.println("Sebelum Zoom : ");
    System.out.println("Sisi Persegi P2 : " + P2.getSisi());
    System.out.println("Sisi Lingkaran L2 : " + L2.getJari());
    System.out.println();

    // Menggunakan method dari IResize
    P2.zoom(50); //Memperbesar ukuran Persegi 10% 
    L2.zoom(200); //Memperbesar ukuran Persegi 10% 

    System.out.println("Setelah Zoom : ");
    System.out.println("Sisi Persegi P2 : " + P2.getSisi());
    System.out.println("Sisi Lingkaran L2 : " + L2.getJari());
    System.out.println();

    // Menggunakan zoom dengan persen tertentu
    P2.zoom(50); //Memperbesar ukuran Persegi menjadi 50% dari ukuran aslinya
    L2.zoom(200); //Memperbesar ukuran Persegi menjadi 200% dari ukuran aslinya

    System.out.println("Setelah Zoom dengan percent : ");
    System.out.println("Sisi Persegi P2 : " + P2.getSisi());
    System.out.println("Sisi Lingkaran L2 : " + L2.getJari());
}
}
