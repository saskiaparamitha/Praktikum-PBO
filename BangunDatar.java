/* Nama File : BangunDatar.java
 * Deskripsi : Berisi atribut dan method dalam class BangunDatar
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 20 Mar 2025
 */

public abstract class BangunDatar {
// public final class BangunDatar {
// final berarti tidak mewariskan
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;
    // protected bisa diakses di class dan package yang sama

    public BangunDatar() {
        counterBangunDatar++;
    }

    protected BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // Method abstract
    public abstract double getLuas();
    public abstract double getKeliling();
    
    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek Bangun Datar :" + counterBangunDatar);
    }

    public void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna : " + warna);
        System.out.println("Border : " + border);
    }
    //static tidak bisa di-Override 
    //yang bisa melakukan Override hanya subclass

    //Fungsi untuk membandingkan luas objek bangundatar apakah
    public boolean isEqualLuas(BangunDatar X){
        return this.getLuas() == X.getLuas();
    }

    //Fungsi untuk membandingkan keliling objek bengundatar
    public boolean isEqualKeliling(BangunDatar X){
        return this.getKeliling() == X.getKeliling();
    }
}