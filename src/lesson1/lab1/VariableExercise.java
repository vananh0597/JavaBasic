package lesson1.lab1;

public class VariableExercise {
    public static void main(String[] args) {
        int maHocSinh = 10;
        float diemToan = 4.5f;
        float diemVan = 5.5f;
        float diemTiengAnh = 6.0f;
        float diemTrungBinh = (diemToan * 2 + diemVan * 2 + diemTiengAnh) / 5;
        boolean xetDiem = diemTrungBinh >= 5f;
        System.out.println("Mã học sinh: " + maHocSinh);
        System.out.printf("Điểm trung bình cộng của học sinh có mã số %d là: %.1f%n", maHocSinh, diemTrungBinh);
        System.out.println("Học sinh có đủ điểm yêu cầu hay không? " + xetDiem);
    }
}