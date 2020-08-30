import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Method method = new Method();


        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. Thêm Thông tin liên lạc");
            System.out.println("2. Hiển thị danh bạ");
            System.out.println("3. Sửa thông tin liên lạc");
            System.out.println("4. Xóa thông tin liên lạc");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise){
                case 1:
                    System.out.println("Tên liên lạc:");
                    String name = sc.nextLine();
                    System.out.println("Số điện thoại liên lạc: ");
                    int SDT = Integer.parseInt(sc.nextLine());
                    PhoneBook phoneBook = new PhoneBook(name,SDT);
                    method.phoneBooks.add(phoneBook);
                    break;
                case 2:
                    System.out.println(method.phoneBooks);
                    break;
                case 3:
                    System.out.println("Nhập SĐT bạn muốn sửa");
                    int numPhone = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập SDDT mới");
                    int numPhone2 = Integer.parseInt(sc.nextLine());
                    method.suaSDT(numPhone,numPhone2);
                case 4:
                    System.out.println("Nhập số điện thoại bạn muốn xóa: ");
                    int numPhone3 = Integer.parseInt(sc.nextLine());
                    method.xoaSDT(numPhone3);
            }
        }while (true);
    }
}
