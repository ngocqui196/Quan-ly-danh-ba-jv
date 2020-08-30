import java.util.ArrayList;
import java.util.List;

public class Method {
    static List<PhoneBook> phoneBooks = new ArrayList<>();

    public static void suaSDT(int sdtCu,int sdtMoi) {
        for (PhoneBook num : phoneBooks) {
            if (sdtCu == num.getSDT()){
                num.setSDT(sdtMoi);
            }
        }
    }
    public static void xoaSDT(int sdt) {
        for (PhoneBook num2: phoneBooks) {
            if (num2.getSDT() == sdt) {
                phoneBooks.remove(num2);
            }
        }
        // Có thể dùng: phoneBooks.removeIf(num2 -> num2.getSDT() == sdt) thay cho mã trên
    }
}
