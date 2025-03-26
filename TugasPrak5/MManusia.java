package TugasPrak5;


public class MManusia {
    public static void main(String[] args) {
        PNS P1 = new PNS("Satriyo", "01-04-2006", "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha Pe1 = new Pengusaha("Adhy", "01-01-2000", "Jl.Air", 55000000, "000-556-773-212-000-5");
        Petani Pt1 = new Petani("Nugraha", "09-01-1977", "Jl. Bunga 9 Tembalang", 5000000, "Wonogiri");
        PNS P2 = new PNS("Panji", "01-04-2010", "Alamat belum diisi", 10000000, "198004212010041002");
       
        P2.setAlamat("Jl. Panorama 111 Tembalang");
       
        // System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        // System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        // System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        // System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
       
        System.out.println("Pajak PNS P1 = " + P1.hitungPajak());
        System.out.println("Pajak Pengusaha Pe1 = " + Pe1.hitungPajak());
        System.out.println("Pajak Petani Pt1 = " + Pt1.hitungPajak());
       
        System.out.println("Masa Kerja P1 = " + P1.hitungMasaKerja());
        System.out.println("Masa Kerja Pe1 = " + Pe1.hitungMasaKerja());
        System.out.println("Masa Kerja Pt1 = " + Pt1.hitungMasaKerja());
       
        P1.printInfo();
        Pe1.printInfo();
        Pt1.printInfo();
    }
}
