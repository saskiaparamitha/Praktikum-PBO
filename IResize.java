/* Nama File : IResize.java
 * Deskripsi : Berisi atribut dan method dalam interface Iresize
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 20 Mar 2025
 */

public interface IResize {
    //Menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    //Mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    //Menskalakan input sesuai percent yang diberikan
    public void zoom(int percent);
}
