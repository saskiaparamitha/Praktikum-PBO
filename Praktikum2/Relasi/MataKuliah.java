/* Nama File : MataKuliah.java
 * Deskripsi : Berisi atribut dan method dalam class Mata Kuliah
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 27 Feb 2025
 */

package Relasi;

public class MataKuliah {
    private String idMatkul;
    private String namaMK;
    private int SKS;

// Method
// Konstruktor
    public MataKuliah() {
        
    }

    public MataKuliah(String idMatkul, String namaMK, int SKS) {
        this.idMatkul = idMatkul;
        this.namaMK = namaMK;
        this.SKS = SKS;
    }

// Selektor (getter)
    public String getIDMatkul() { /* untuk mengembalikan nilai nip */
        return this.idMatkul;
    }

    public String getNamaMK() { /* untuk mengembalikan nilai nip */
        return this.namaMK;
    }

    public int getSKS() { /* untuk mengembalikan nilai nip */
        return this.SKS;
    }

//Mutator (Setter)
    public void setIDMatkul(String idMatkul) { /* untuk mengembalikan nilai idMatkul */
        this.idMatkul = idMatkul;
    }

    public void setNamaMK(String namaMK) { /* untuk mengembalikan nilai namaMK */
        this.namaMK = namaMK;
    }

    public void setSKS(int SKS) { /* untuk mengembalikan nilai SKS */
        this.SKS = SKS;
    }

}
