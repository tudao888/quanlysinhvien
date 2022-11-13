import Manage.DanhSachSinhVien;
import Model.SinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();

        while (true) {
            System.out.println("MENU ---------");
            System.out.println("Vui lòng chọn chức năng");
            System.out.println("1.Thêm sv");
            System.out.println("2.In dssv ra màn hình");
            System.out.println("3.Kiểm tra ds có rỗng hay không?");
            System.out.println("4.Lấy ra số lượng sinh viên trong ds");
            System.out.println("5.Làm rỗng dssv");
            System.out.println("6.Kiểm tra sinh viên có trong hs hay không? Tìm bằng mã sv");
            System.out.println("7.Xóa sinh viên bằng mã sinh viên");
            System.out.println("8.Tìm sinh viên theo tên nhập từ bàn phím");
            System.out.println("0. Thoát");
            int luaChon = Integer.parseInt(scanner.nextLine());
            switch (luaChon) {
                case 1:
                    System.out.println("Nhập mã sinh viên");
                    String maSinhVien = scanner.nextLine();
                    System.out.println("Nhập họ và tên:");
                    String hoVaTen = scanner.nextLine();
                    System.out.println("Nhập vào năm sinh");
                    int namSinh = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập vào diểm TB");
                    float diemTrungBinh = Float.parseFloat(scanner.nextLine());
                    SinhVien sv = new SinhVien(maSinhVien,hoVaTen,namSinh,diemTrungBinh);
                    dssv.themSinhVien(sv);
                    break;
                case 2:
                    dssv.inDanhSachSv();
                    break;
                case 3:
                    dssv.kiemTraDsRong();
                    break;
                case 4:
                    dssv.laySoLuongSv();
                    break;
                case 5:
                    dssv.xoaDssv();
                    break;
                case 6:
                    System.out.println("Nhập mã sinh viên");
                    String maSinhVien1 = scanner.nextLine();
                    SinhVien svNew = new SinhVien(maSinhVien1);
                    System.out.println("Kiểm tra sinh viên có trong danh sach hay không?" + dssv.kiemTraTonTai(svNew));
                    break;
                case 7:
                    System.out.println("Nhập mã sinh viên");
                    String maSinhVien2 = scanner.nextLine();
                    SinhVien svNew2 = new SinhVien(maSinhVien2);
                    System.out.println("Kiểm tra sinh viên có trong danh sach hay không?" + dssv.kiemTraTonTai(svNew2));
                    dssv.xoaSinhVien(svNew2);
                    break;
                case 8:
                    System.out.println("Nhập họ và tên:");
                    String hovaTen = scanner.nextLine();
                    System.out.println("Kết quả tìm kiếm");
                    dssv.timSinhVien(hovaTen);
                    break;
                default:
                    System.exit(0);

            }
        }
    }
}