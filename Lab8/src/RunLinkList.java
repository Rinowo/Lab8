import java.util.Scanner;

public class RunLinkList {
    public static void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList linkedList = new StudentLinkedList();

        String id;
        System.out.println("Enter student id: " );
        id = sc.nextLine();
        linkedList.delete(id);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList link = new StudentLinkedList();

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
                link.addStudent(student);
            }
            else if (choose == 2) {
                link.printStudentList();
            }
            else if (choose == 3) {
                System.out.println("Number of student: "+ link.countStudent());
            }
            else if (choose == 4) {
                link.deleteAll();
            }
            else if (choose == 5) {
                System.out.print("Enter student ID: "); String id = sc.next();
                System.out.println();
                Student student = new Student(id);
                link.findById(id);
            }

            else if (choose == 6) {
                System.out.print("Enter student name: "); String name = sc.nextLine();
                Student student = new Student(name);
                System.out.println();
                link.findByName(name);
            }
            else if (choose == 7) {
                deleteStudent();
//                System.out.println("Enter Student ID: "); String id = sc.nextLine();
//                Student student = new Student(id);
//                System.out.println("Delete Student in the list: " + link.deleteById(student));
            }
            else if (choose == 8) {
                link.sortByMark();
                link.printStudentList();
            }
        }while (choose != 0);
    }
}
