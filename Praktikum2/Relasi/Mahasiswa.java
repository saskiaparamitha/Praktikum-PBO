/* Nama File : Mahasiswa.java
 * Deskripsi : Berisi atribut dan method dalam class Mahasiswa
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 27 Feb 2025
 */

package Relasi;

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String namaMHS;
    private String prodiMHS;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    ArrayList <MataKuliah> listMatkul;

// Method
// Konstruktor
    public Mahasiswa() {
        this.listMatkul = new ArrayList<>();
    }

    public Mahasiswa(String nim, String namaMHS, String prodiMHS) {
        this.nim = nim;
        this.namaMHS = namaMHS;
        this.prodiMHS = prodiMHS;
        this.listMatkul = new ArrayList<>();
    }

// Selektor (getter)
    public String getNIM() { /* untuk mengembalikan nilai nim */
        return this.nim;
    }

    public String getNamaMHS() { /* untuk mengembalikan nilai nim */
        return this.namaMHS;
    }

    public String getProdiMHS() { /* untuk mengembalikan nilai nim */
        return this.prodiMHS;
    }

    public Dosen getDosenWali() { /* untuk mengembalikan nilai nim */
        return this.dosenWali;
    }
    
    public Kendaraan getKendaraan() { /* untuk mengembalikan nilai nim */
        return this.kendaraan;
    }

// Mutator (Setter)
    public void setnim(String nim) { /* untuk mengembalikan nilai nim */
        this.nim = nim;
    }

    public void setNamaMHS(String namaMHS) { /* untuk mengembalikan nilai nim */
        this.namaMHS = namaMHS;
    }

    public void setProdiMHS(String prodiMHS) { /* untuk mengembalikan nilai nim */
        this.prodiMHS = prodiMHS;
    }

    public void setDosenWali(Dosen dosenWali) { /* untuk mengembalikan nilai nim */
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) { /* untuk mengembalikan nilai nim */
        this.kendaraan = kendaraan;
    }

//
    public void addMatkul(MataKuliah newMatkul) {
        if (this.listMatkul.size() < 50) {
            this.listMatkul.add(newMatkul);
        } else { 
            System.out.println("List Mata Kuliah sudah penuh!");
        }
    }

    public ArrayList<MataKuliah> getListMatkul() {
        return listMatkul;
    }

    public int getJumlahSKS() {
        int jumlah = 0;
        for (MataKuliah matkul : this.listMatkul) {
            jumlah += matkul.getSKS();
        }
        return jumlah;
    }

    public int getJumlahMatkul() {
        return this.listMatkul.size();
    }

    public void printMHS() {
        System.out.println("NIM \t\t" + nim);
        System.out.println("Nama \t\t" + namaMHS);
        System.out.println("Prodi \t\t" + prodiMHS);
    }

    public void printDetailMHS() {
        printMHS();
        System.out.println("Daftar mata kuliah");
        int i;
        for (i = 0; i < listMatkul.size(); i++){
            System.out.println(listMatkul.get(i).getNamaMK()); 
        }
        System.out.println("Dosen Wali\t" + dosenWali.getNama());
        System.out.println("Kendaraan\t" + kendaraan.getJenis());
    }
}
