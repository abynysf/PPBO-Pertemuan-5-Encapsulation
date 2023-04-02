public class Buku {
    private String idBuku;
    private String judul;
    private double rate;
    private int jumlahStock;
    private int totalRate;
    private int totalReviewer;

    public Buku(String idBuku, String judul, int stock) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.jumlahStock = stock;
    }

    public String getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }

    Boolean bisaDipinjam(){
        if (jumlahStock > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    int dendaPerHari() {
        if (rate >= 4.0){
            return 3000;
        } else if (rate >=  3.0) {
            return 2000;
        }
        else {
            return 1000;
        }
    }

}