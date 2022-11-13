package Manage;

import Model.SinhVien;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DanhSachSinhVien {

    // khai báo một arraylist có tên là danhSach
    private ArrayList<SinhVien> danhSach;

    // tạo constructer cho nó

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }


    // tạo tiếp một constructor có danh sách bằng với một danh sách mới;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }

    public void inDanhSachSv() {
        for (SinhVien sinhvien : danhSach) {
            System.out.println(sinhvien.toString());
        }
    }

    public boolean kiemTraDsRong() {
        return danhSach.isEmpty();
    }

    public int laySoLuongSv() {
        return danhSach.size();
    }

    public void xoaDssv() {
        danhSach.removeAll(danhSach);
    }

    public boolean kiemTraTonTai(SinhVien sv) {
        return danhSach.contains(sv);
    }

    public boolean xoaSinhVien(SinhVien sv) {
        return danhSach.remove(sv);
    }

    public void timSinhVien(String ten) {
        for (SinhVien sinhVien : danhSach) {
            if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien);
            }
        }
    }
}
