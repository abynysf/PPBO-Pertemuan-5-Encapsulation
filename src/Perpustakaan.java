import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
    private String nama;
    private List<Buku> listBuku;

    Perpustakaan() {
        listBuku = new ArrayList<>();
    }

    void inputBuku(String idBuku, String judul, int stock){
        if (stock > 5) {
            System.out.println("-Stok buku dengan ID " + idBuku + " yang dimasukkan melebihi 5, jadi akan di-set menjadi 5");
            Buku buku1 = new Buku(idBuku.toLowerCase(), judul.toLowerCase(), stock);
            listBuku.add(buku1);
        }
        else {
            Buku buku1 = new Buku(idBuku.toLowerCase(), judul.toLowerCase(), stock);
            listBuku.add(buku1);
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    void cekBuku(String idBukuYangDiCari) {
        for(int i= 0; i < listBuku.size(); i++){
            Buku currentBuku = listBuku.get(i);
            if (currentBuku.getIdBuku().equals(idBukuYangDiCari)) {
                if (currentBuku.bisaDipinjam()) {
                    System.out.println("-Buku " + currentBuku.getJudul() + " Bisa Dipinjam");
                }
                else {
                    System.out.println("-Buku " + currentBuku.getJudul() + " Tidak Bisa Dipinjam");
                }
            }
        }
    }


    void cekDataBukuAdaAtauTidak(String idBukuYangDiCari) {
        boolean bukuDitemukan = false;
        for (int i = 0; i < listBuku.size(); i++) {
            Buku currentBuku = listBuku.get(i);
            if (currentBuku.getIdBuku().equals(idBukuYangDiCari.toLowerCase())) {
                bukuDitemukan = true;
                break;
            }
        }
        if (bukuDitemukan) {
            System.out.println("-Buku dengan ID " + idBukuYangDiCari + " ditemukan di perpustakaan.");
        } else {
            System.out.println("-Buku dengan ID " + idBukuYangDiCari + " tidak ditemukan di perpustakaan.");
        }
    }

    void cariBuku(String keyword) {
        boolean bukuDitemukan = false;
        for (int i = 0; i < listBuku.size(); i++) {
            Buku currentBuku = listBuku.get(i);
            if (currentBuku.getJudul().contains(keyword.toLowerCase())) {
                if (!bukuDitemukan) {
                    System.out.println("-Buku yang ditemukan:");
                    bukuDitemukan = true;
                }
                System.out.println(currentBuku.getJudul());
            }
        }
        if (!bukuDitemukan) {
            System.out.println("-Buku dengan keyword " + keyword + " tidak ditemukan.");
        }
    }

}