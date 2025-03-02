/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam class Dosen
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 27 Feb 2025
 */

package Relasi;

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

// Method
// Konstruktor
    public Dosen() {
        
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

// Selektor (getter)
    public String getNip() { /* untuk mengembalikan nilai nip */
        return this.nip;
    }

    public String getNama() { /* untuk mengembalikan nilai nip */
        return this.nama;
    }

    public String getProdi() { /* untuk mengembalikan nilai nip */
        return this.prodi;
    }

// Mutator (Setter)
    public void setNip(String nip) { /* untuk mengembalikan nilai nip */
        this.nip = nip;
    }

    public void setNama(String nama) { /* untuk mengembalikan nilai nip */
        this.nama = nama;
    }

    public void setProdi(String prodi) { /* untuk mengembalikan nilai nip */
        this.prodi = prodi;
    }
}
