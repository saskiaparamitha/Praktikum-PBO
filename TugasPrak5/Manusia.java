package TugasPrak5;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    private static int counterMns = 0;


    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = LocalDate.parse(tgl_mulai_kerja);
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }


    public static int getCounterMns() {
        return counterMns;
    }


    public Manusia() {
        counterMns++;
    }


    public String getNama() {
        return nama;
    }


    public void setNama(String nama){
        this.nama = nama;
    }


    public LocalDate getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }


    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }


    public String getAlamat() {
        return alamat;
    }


    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
   
    public double getPendapatan() {
        return pendapatan;
    }


    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }


    public void printInfo() {
        System.out.println("=== INFORMASI MANUSIA ===");
        System.out.println("Nama: " + this.nama);
        System.out.println("Tanggal Mulai Kerja: " + this.tgl_mulai_kerja);
       
        LocalDate today = LocalDate.now();
        long years = ChronoUnit.YEARS.between(this.tgl_mulai_kerja, today);
        LocalDate tempDate = this.tgl_mulai_kerja.plusYears(years);
       
        long months = ChronoUnit.MONTHS.between(tempDate, today);
        tempDate = tempDate.plusMonths(months);
       
        long days = ChronoUnit.DAYS.between(tempDate, today);
       
        System.out.println("Lama Bekerja: " + years + " tahun, " + months + " bulan, " + days + " hari");
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Pendapatan: Rp " + String.format("%,.2f", this.pendapatan));
        System.out.println("========================");
    }


    // public long hitungMasaKerja() {
    //     LocalDate today = LocalDate.now();
    //     // Calculate years between start date and today
    //     long years = ChronoUnit.YEARS.between(this.tgl_mulai_kerja, today);
    //     return years;
    // }


    public String hitungMasaKerja() {
        LocalDate today = LocalDate.now();
        long years = ChronoUnit.YEARS.between(this.tgl_mulai_kerja, today);
        LocalDate tempDate = this.tgl_mulai_kerja.plusYears(years);
       
        long months = ChronoUnit.MONTHS.between(tempDate, today);
        tempDate = tempDate.plusMonths(months);
       
        long days = ChronoUnit.DAYS.between(tempDate, today);
       
        return years + " tahun, " + months + " bulan, " + days + " hari";
    }
}
