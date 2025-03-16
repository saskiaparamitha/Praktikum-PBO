package TugasPrak4;

public class DosenTetap extends Dosen {
    private String NIDN;
    private int BUP; // dalam tahun
    private double tunjangan;

    public DosenTetap(String NIP, String nama, String tanggalLahir, String tmtBekerja, double gajiPokok, String NIDN) {
        super(NIP, nama, tanggalLahir, tmtBekerja, gajiPokok, "Dosen Tetap");
        this.NIDN = NIDN;
        this.BUP = 65; 
        this.tunjangan = 0.02 * (calculateMasaKerja() * gajiPokok);
    }

    private int calculateMasaKerja() {
        // Implementasi logika untuk menghitung masa kerja
        return 10; // Contoh nilai
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDN: " + NIDN);
        System.out.println("BUP: " + BUP + " tahun");
        System.out.println("Tunjangan: Rp " + tunjangan);
    }
}