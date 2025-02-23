/* Nama File : Titik.java
 * Deskripsi : Berisi atribut dan method dalam class Titik
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 20 Feb 2025
 */ 

public class Titik {
    /*Atribut*/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*Method*/
    //Konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }
    
    //This
    Titik(double absis, double ordinat) {
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
    double getAbsis() {
        return absis;
    }

    //mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    //Kuadran
    int getKuadran() {
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
    double getJarakPusat() {
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    //Jarak
    double getJarak(Titik T) {
        return Math.sqrt(((this.absis - T.absis) * (this.absis - T.absis)) + ((this.ordinat - T.ordinat) * (this.ordinat - T.ordinat)));
    }

    //Refleksi X
    void refleksiX() {
        ordinat = -ordinat;
    }

    //Refleksi Y
    void refleksiY() {
        absis = -absis;
    }

    //get Refleksi X
    Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    //get Refleksi Y
    Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }

    //mencetak koordinat titik 
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    void printCounterTitik() {
        System.out.println(counterTitik);
    }

    //mengembalikan nilai counterTitik
    static int getCounterTitik() {
        return counterTitik;
    }

} //end class Titik