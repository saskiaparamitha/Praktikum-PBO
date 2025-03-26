package TugasPrak5;


public class PNS extends Manusia implements IPajak {
    protected String nip;
    private static int counterPNS = 0;


    public static int getCounterPNS() {
        return counterPNS;
    }
   
    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }


    public String getNIP() {
        return nip;
    }


    public void setNIP(String nip) {
        this.nip = nip;
    }


    @Override
    public double hitungPajak() {
        return this.pendapatan * 0.1;
    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("NIP : " + nip);
    }
}
