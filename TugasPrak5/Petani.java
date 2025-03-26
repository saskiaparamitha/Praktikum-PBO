package TugasPrak5;

public class Petani extends Manusia implements IPajak{
    protected String asal_kota;
    private static int counterPetani = 0;

    public static int getCounterPetani() {
        return counterPetani;
    }
    
    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    public String getAsalKota() {
        return asal_kota;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }  

    @Override
    public double hitungPajak() {
        return 0; 
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Asal Kota : " + asal_kota);
    }
}
