/* Nama File : Kendaraan.java
 * Deskripsi : Berisi atribut dan method dalam class Kendaraan
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 27 Feb 2025
 */

package Relasi;

public class Kendaraan {
    private String noPlat;
    private String jenis;

// Method
// Konstruktor
    public Kendaraan() {
        
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

// Selektor (getter)
    public String getNoPlat() { /* untuk mengembalikan nilai nip */
        return this.noPlat;
    }

    public String getJenis() { /* untuk mengembalikan nilai nip */
        return this.jenis;
    }

// Mutator (Setter)
    public void setNoPlat(String noPlat) { /* untuk mengembalikan nilai noPlat */
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) { /* untuk mengembalikan nilai jenis */
        if (jenis.equalsIgnoreCase("motor") || jenis.equalsIgnoreCase("mobil")){
            this.jenis = jenis;
        } else {
            System.out.println("Jenis kendaraan harus motor atau mobil!");
        }
    }

}
