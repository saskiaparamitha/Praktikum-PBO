/* Nama File : Lingkaran.java
 * Deskripsi : Berisi atribut dan method dalam class Lingkaran
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 20 Mar 2025
 */

public class Lingkaran extends BangunDatar implements IResize{
    private double jari;

    public Lingkaran() {
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(1, warna, border);
        this.jari = diameter/2;
        // setBorder(border);
        // setWarna(warna);
        // setJmlSisi(1);
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari : " + jari);
        System.out.println("Luas : " + getLuas());
    }

    //prosedur implementasi IResize
    //Menambah ukuran menjadi 10% lebih besar
    @Override
    public void zoomIn(){
        jari = jari * 1.1;
    }

    //Mengurangi ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut(){
        jari = jari * 0.9;
    }

    //Menskalakan input sesuai percent yang diberikan
    @Override
    public void zoom(int percent){
        jari = jari * percent/100;
    }
}
