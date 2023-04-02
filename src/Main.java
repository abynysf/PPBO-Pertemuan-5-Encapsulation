public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan1 = new Perpustakaan();
        perpustakaan1.setNama("Perpustakaan TEDI");
        System.out.println(perpustakaan1.getNama());
        System.out.println("");

        // batasan stok buku adalah 5
        perpustakaan1.inputBuku("B1", "Naruto", 3);
        perpustakaan1.inputBuku("B2", "Wibu", 0);
        perpustakaan1.inputBuku("B4", "Wibu Vol.2", 6);
        System.out.println("");

        perpustakaan1.cekBuku("B1");
        perpustakaan1.cekBuku("B2");
        perpustakaan1.cekBuku("B4");

        perpustakaan1.cekDataBukuAdaAtauTidak("B3");
        perpustakaan1.cekDataBukuAdaAtauTidak("B2");
        perpustakaan1.cekDataBukuAdaAtauTidak("B1");
        perpustakaan1.cekDataBukuAdaAtauTidak("B4");

        perpustakaan1.cariBuku("Nar");
        perpustakaan1.cariBuku("OOP");
        perpustakaan1.cariBuku("w");

    }
}