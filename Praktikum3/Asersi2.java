/* Nama File : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 06 Mar 2025
 */

// class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran (double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling () {
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String [] args) {
        double jariJari = 0;
        assert(jariJari > 0) : "Jari-Jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = "
            +kelilingLingkaran);
    }
}

/* PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas. 
                Jelaskan pada lembar laporan praktikum!
JAWABAN : 
- assert hanya aktif ketika program dijalankan dengan -ea (enable assertions)
- jika tidak pakai -ea, kode akan tetap berjalan walaupun input salah
- asersi tidak cocok untuk memeriksa input dari pengguna 
Solusi : gunakan if + return untuk keluar dari program jika ada kesalahan

public class Asersi2 {
    public static void main(String[] args) {
        int jariJari = -5; // Ubah angka ini untuk tes

        if (jariJari <= 0) {
            System.out.println("ERROR: Jari-jari harus lebih dari 0!");
            return; // Langsung keluar dari program
        }

        int keliling = 2 * 3 * jariJari; // π diganti 3
        System.out.println("Keliling lingkaran: " + keliling);
    }
}
*/