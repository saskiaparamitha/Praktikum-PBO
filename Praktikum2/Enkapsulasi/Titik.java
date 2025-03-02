/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 20 Feb 2025
 */ 

public class Titik {
    /*Atribut*/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /*Method*/
    //Konstruktor untuk membuat titik (0,0)
    public Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    
    //This
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    /*
    Titik() {
        this (0,0);
    }
    */

    //Getter
    //mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //Kuadran
    public int getKuadran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        } else if (absis < 0 && ordinat > 0) {
            return 2;
        } else if (absis < 0 && ordinat < 0) {
            return 3;
        } else if (absis > 0 && ordinat < 0) {
            return 4;
        } else {
            return 0;
        }
    }

    //Jarak Pusat
    public double getJarakPusat() {
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    //Jarak
    public double getJarak(Titik T) {
        return Math.sqrt(((this.absis - T.absis) * (this.absis - T.absis)) + ((this.ordinat - T.ordinat) * (this.ordinat - T.ordinat)));
    }

    //Refleksi X
    public void refleksiX() {
        ordinat = -ordinat;
    }

    //Refleksi Y
    public void refleksiY() {
        absis = -absis;
    }

    //get Refleksi X
    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    //get Refleksi Y
    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    //mencetak koordinat titik 
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    public void printCounterTitik() {
        System.out.println(counterTitik);
    }

    //mengembalikan nilai counterTitik
    public static int getCounterTitik() {
        return counterTitik;
    }

} //end class Titik