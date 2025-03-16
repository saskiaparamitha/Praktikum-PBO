package TugasPrak4;

public class Tendik extends Pegawai {
    private String bidang;
    private int BUP; 

    public Tendik(String NIP, String nama, String tanggalLahir, String tmtBekerja, double gajiPokok, String bidang) {
        super(NIP, nama, tanggalLahir, tmtBekerja, gajiPokok);
        this.bidang = bidang;
        this.BUP = 55; 
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Bidang: " + bidang);
        System.out.println("BUP: " + BUP + " tahun");
    }
}
