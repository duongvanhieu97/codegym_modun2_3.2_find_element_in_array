import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a names student");
        String name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Vị trí thành viên trong danh sách " + name + " là " + i);
                isExist =  true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy" + name + "trong danh sách");
        }
    }
}
