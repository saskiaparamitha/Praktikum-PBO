package TugasPrak4;

public class DosenTamu extends Dosen {
    private String NIDK;
    private String tanggalAkhirKontrak;

    public DosenTamu(String NIP, String nama, String tanggalLahir, String tmtBekerja, double gajiPokok, String NIDK, String tanggalAkhirKontrak) {
        super(NIP, nama, tanggalLahir, tmtBekerja, gajiPokok, "Dosen Tamu");
        this.NIDK = NIDK;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIDK: " + NIDK);
        System.out.println("Tanggal Akhir Kontrak: " + tanggalAkhirKontrak);
    }
}