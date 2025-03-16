package TugasPrak4;

public class Tanggal {
    private int hari, bulan, tahun;
    
    public Tanggal(int hari, int bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }
    
    @Override
    public String toString() {
        return hari + "-" + bulan + "-" + tahun;
    }
}