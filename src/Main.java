import java.util.Scanner;

public class Main {
    static ManageCharacter manageCharacter = new ManageCharacter();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = "1. Hiển thị\n" +
                "2. Thêm nhân vật\n" +
                "3. Xóa nhân vật\n" +
                "4. Chỉnh sửa nhân vật\n" +
                "5. Tìm nhân vật\n" +
                "6. Thoát\n" +
                "Chọn chức năng: ";
        int choice;
        while (true) {
            System.out.println(menu);
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ManageCharacter.show();
                    break;
                case 2:
                    ManageCharacter.add();
                    break;
                case 3:
                    ManageCharacter.deleteById();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Không có chức năng này");
            }
        }
    }
}