package TugasPrak5;


public class Pengusaha extends Manusia implements IPajak {
    protected String npwp;
    private static int counterPengusaha = 0;


    public static int getCounterPengusaha() {
        return counterPengusaha;
    }


    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }


    public String getNPWP() {
        return npwp;
    }


    public void setNPWP(String npwp) {
        this.npwp = npwp;
    }


    @Override
    public double hitungPajak() {
        return this.pendapatan * 0.15;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NPWP: " + npwp);
    }
}
