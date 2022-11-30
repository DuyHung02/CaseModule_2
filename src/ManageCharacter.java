import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageCharacter {
    static List<Character> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static CreateCharacter createCharacter = new CreateCharacter();

    public static void show() {
        System.out.println("Số Character hiện tại: " + list.size() + "\n");
        for (Character nhanvat : list) {
            System.out.println(nhanvat.toString());
        }
    }

    public static void add() {

        createCharacter();
        list.add(createCharacter);
        System.out.println("Tạo thành công");
    }

    public static int findIndexById(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public static void deleteById() {
        System.out.println("Nhập iD muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int index = findIndexById(id);
        if (index == -1) {
            System.err.println("Không tìm thấy iD");
        } else {
            list.remove(index);
            System.out.println("Xóa thành công");
        }
    }


//    public static void editCharacter() {
//        System.out.println("Nhập iD muốn sửa: ");
//        int id = Integer.parseInt(scanner.nextLine());
//        int index = findIndexById(id);
//        if (index >= 0) {
//            Character character =createCharacter();
//            list.set(index,character);
//        }
//    }

    public static void createCharacter() {
        createCharacter.inputName();
        createCharacter.inputAge();
        createCharacter.inputGender();
        createCharacter.inputModel();
        createCharacter.inputBirthday();
    }
}
