package quan_ly_nhan_su;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.*;
import static java.lang.Integer.*;
import static java.lang.String.*;
import static java.lang.System.*;
import static yan_lib.YANConstant.*;
import static yan_lib.YANMethod.*;

public class QuanLyNhanSu {
    public static void main(String[] args) {
        // tit
        out.println(BLUE_BOLD);
        PrintlnAdv("Bài Tập Quản Lý Nhân Sự");
        // content
        Main();
    }

    // Fields
    private static final Scanner _scan = new Scanner(in);
    private static String _tenCongTy;
    private static String _maSoThue;
    private static double _doanhThuThang;
    private static List<NhanSu> _dsNhanSu;

    // Main
    private static void Main() {
        // input
        out.println();
        PrintAdv(GREEN, "Nhập vào số thành viên: ", RESET);
        var n = NumLimit(1, Integer.MAX_VALUE);
        PrintAdv(GREEN, "Tên công ty: ", RESET);
        _tenCongTy = _scan.nextLine();
        PrintAdv(GREEN, "Mã số thuế: ", RESET);
        _maSoThue = _scan.nextLine();
        PrintAdv(GREEN, "Doanh thu tháng: ", RESET);
        _doanhThuThang = NumLimit(Double.MIN_VALUE, Double.MAX_VALUE);
        _dsNhanSu = new ArrayList<NhanSu>();
        for (var i = 0; i < n; i++) {
            out.println();
            PrintlnAdv(CYAN, format("Thành viên thứ %d", i + 1));
            var nhanSu = new NhanSu();
            // nhanSu.NhapNhanSu();
            _dsNhanSu.add(nhanSu);
        }
        // output
        out.println(YELLOW);

        // ctrl
        CheckOut();
    }

    // Showntime
    private static void Showntime(NhanSu hocSinh) {
        PrintlnAdv(format("Tên công ty: %s", _tenCongTy));
        PrintlnAdv(format("Mã số thuế: %s", _maSoThue));
        PrintlnAdv(format("Doanh thu tháng: %s", WritePerfectDub(_doanhThuThang)));
        
        out.println();
    }

    // Check out
    private static void CheckOut() {
        if (Credit() == 1) {
            Main();
        }
    }
}