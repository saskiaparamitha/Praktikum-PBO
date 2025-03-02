/* Nama File : MMahasiswa.java
 * Deskripsi : Main class untuk menggunakan class Mahasiswa
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 27 Feb 2025
 */

package Relasi;

public class MMahasiswa {
    public static void main(String[] args) {
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berbasis Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        
        Mahasiswa M1 = new Mahasiswa("144", "Saskiy", "Informatika");
        
        Dosen D1 = new Dosen("123", "APW", "Informatika");
        
        Kendaraan K1 = new Kendaraan("B 3095 KIA", "motor");
        
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        
        M1.addMatkul(PBO);
        M1.addMatkul(MBD);
        
        M1.printDetailMHS();
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS Mata Kuliah = " + M1.getJumlahSKS());
    }
}
