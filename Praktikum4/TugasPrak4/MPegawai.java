package TugasPrak4;

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("9545647548", "Andi", "5 Mei 1990", "1 Januari 2015", 5000000, "78647324");
        dosenTetap.printInfo();

        DosenTamu dosenTamu = new DosenTamu("1234567890", "Budi", "10 Januari 1985", "1 Februari 2020", 4000000, "NIDK123", "31 Desember 2023");
        dosenTamu.printInfo();

        Tendik tendik = new Tendik("0987654321", "Siti", "15 Maret 1995", "1 Maret 2020", 3000000, "A");
        tendik.printInfo();
    }
}
