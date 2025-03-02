/* Nama File : MTitik.java
 * Deskripsi : Main class untuk menggunakan class Titik
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 20 Feb 2025
 */ 

public class MTitik {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello, World!");
        
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3,4);
        T1.printTitik();

        Titik T2 = T1;
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik();

        Titik T3 = new Titik();
        T3.printCounterTitik();

        int counterTitik = Titik.getCounterTitik();
        System.out.println("Jumlah Objek Titik =" +counterTitik);

        /*Titik t1 = new Titik();
        Titik t2 = new Titik();

        t1.setAbsis(10);
        t1.setOrdinat(6.5);*/

        System.out.println("Absis dari T1 = "+T1.getAbsis()+", Ordinat dari T1 = "+T1.getOrdinat()+"");
        System.out.println("\nAbsis dari T2 = "+T2.getAbsis()+", Ordinat dari T2 = "+T2.getOrdinat()+"");
        System.out.println("Absis dari T3 = "+T3.getAbsis()+", Ordinat dari T3 = "+T3.getOrdinat()+"");
        
        System.out.println("\nKuadran T2 = " +T2.getKuadran());
        System.out.println("\nJarak pusat T1 = " +T1.getJarakPusat());
        System.out.println("\nJarak T1 dan T2 = " +T1.getJarak(T2));

        T2.refleksiX();
        T2.printTitik();
        T2.refleksiY();
        T2.printTitik();

        Titik T4 = T2.getRefleksiX();
        Titik T5 = T2.getRefleksiY();
        T4.printTitik();
        T5.printTitik();
    }
}