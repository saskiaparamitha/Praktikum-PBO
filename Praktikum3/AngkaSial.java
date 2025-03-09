/* Nama File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 06 Mar 2025
 */

public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException { 
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!");
        }
    }
}

/* PERTANYAAN: 
*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?  
JAWABAN : Kodingan pada baris 12 tidak dieksekusi jika angka yang dimasukkan 13. Jika memasukkan angka 13, 
program akan berhenti sebelum sampai ke baris tersebut.

*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?  
JAWABAN : Ya, kodingan pada baris 21 selalu dieksekusi. */