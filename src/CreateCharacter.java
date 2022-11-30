import javax.lang.model.element.Name;
import java.time.LocalDate;
import java.util.Scanner;

public class CreateCharacter extends Character {
    static Scanner scanner = new Scanner(System.in);

    public void inputName() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        this.setName(name);
    }

    public void inputAge() {
        while (true) {
            try {
                System.out.println("Nhập tuổi: ");
                int age = Integer.parseInt(scanner.nextLine());
                if (age < 5 || age > 150) {
                    System.out.println("Tuổi không hợp lệ");
                } else {
                    this.setAge(age);
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số!");
            }
        }
    }

    public void inputGender() {
        System.out.println("Chọn giới tính: ");
        String menu = "1. Nam" + "\n"
                + "2. Nữ" + "\n"
                + "3. Khác";
        System.out.println(menu);
        String gender = null;
        int choice;
        do {
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    gender = "Nam";
                    break;
                case 2:
                    gender = "Nữ";
                    break;
                case 3:
                    gender = "Khác";
                    break;
                default:
                    System.out.println("Nhập lại");
                    break;
            }
            this.setGender(gender);
        } while (choice > 4 || choice < 0);
    }

    public void inputModel() {

        System.out.println("Chọn ngoại hình: ");
        String model = scanner.nextLine();
        this.setModel(model);
    }

    public void inputBirthday() {
        int day;
        while (true) {
            try {
                System.out.println("Nhập ngày sinh: ");
                day = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số!");
            }
        }
        int month;
        while (true) {
            try {
                System.out.println("Nhập tháng sinh: ");
                month = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số!");
            }
        }
        int year;
        while (true) {
            try {
                System.out.println("Nhập năm sinh: ");
                year = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số!");
            }
        }
        setBirthday(LocalDate.of(year, month, day));
    }
}
