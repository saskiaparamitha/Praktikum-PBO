/* Nama File : Persegi.java
 * Deskripsi : Berisi atribut dan method dalam class Persegi
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 20 Mar 2025
 */

public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi() {
        super();
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(4);

        // this.jmlSisi = 4;
        // this.warna = warna;
        // this.border = border;
        // this.sisi = sisi;
    }
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + sisi);
        System.out.println("Luas : " + getLuas());
        System.out.println("Keliling : " + getKeliling());
        System.out.println("Diagonal : " + getDiagonal());
    }

    //prosedur implementasi IResize
    //Menambah ukuran menjadi 10% lebih besar
    @Override
    public void zoomIn(){
        sisi = sisi * 1.1;
    }

    //Mengurangi ukuran menjadi 10% lebih kecil
    @Override
    public void zoomOut(){
        sisi = sisi * 0.9;
    }

    //Menskalakan input sesuai percent yang diberikan
    @Override
    public void zoom(int percent){
        sisi = sisi * percent/100;
    }
}
