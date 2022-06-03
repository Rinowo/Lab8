import java.util.Scanner;

public class RunLinkList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();

        int choose;

        do {
            Menu.mainMenu();
            choose = sc.nextInt();
            sc.nextLine();

            if (choose == 1) {
                System.out.print("Enter student ID: "); String id = sc.nextLine();
                System.out.print("Enter student name: "); String name = sc.nextLine();
                System.out.print("Enter student mark: "); double mark = sc.nextDouble();
                Student student = new Student(id, name, mark);
                list.addStudent(student);
            }
            else if (choose == 2) {
                list.printStudentList();
            }
            else if (choose == 3) {
                System.out.println("Number of student: "+ list.countStudent());
            }
            else if (choose == 4) {
                list.deleteAll();
            }
            else if (choose == 5) {
                System.out.print("Enter student ID: "); String id = sc.next();
                System.out.println();
                Student student = new Student(id);
                list.findById(id);
            }

            else if (choose == 6) {
                System.out.print("Enter student name: "); String name = sc.nextLine();
                Student student = new Student(name);
                System.out.println();
                list.findByName(name);
            }
            else if (choose == 7) {
                System.out.println("Enter Student ID: "); String id = sc.nextLine();
                Student student = new Student(id);
                list.deleteByID(id);
            }
            else if (choose == 8) {
                list.sortByMark();
                list.printStudentList();
            }
        }while (choose != 0);
    }
}
