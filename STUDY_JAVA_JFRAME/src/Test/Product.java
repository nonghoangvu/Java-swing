package Test;

public class Product {
    private String ten, ma, danhMuc, tinhTrang, donGia;

    public Product(String ten, String ma, String danhMuc, String tinhTrang, String donGia) {
        this.ten = ten;
        this.ma = ma;
        this.danhMuc = danhMuc;
        this.tinhTrang = tinhTrang;
        this.donGia = donGia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }
}
