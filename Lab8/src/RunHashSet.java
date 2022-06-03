import java.util.Scanner;


public class RunHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentHashSet set = new StudentHashSet();

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
                set.addStudent(student);
            }
            else if (choose == 2) {
                set.printStudentList();
            }
            else if (choose == 3) {
                System.out.println("Number of student: "+ set.countStudent());
            }
            else if (choose == 4) {
                set.deleteAll();
            }
            else if (choose == 5) {
                System.out.print("Enter student ID: "); String id = sc.next();
                System.out.println();
                set.findById(id);
            }

            else if (choose == 6) {
                System.out.print("Enter student name: "); String name = sc.nextLine();
                System.out.println();
                set.findByName(name);
            }
            else if (choose == 7) {
//                deleteStudent();
                System.out.println("Insert Student ID: "); String id = sc.nextLine();
                Student student = new Student(id);
                System.out.println("Delete Student in the list: " + set.remove(id));
            }
            else if (choose == 8) {
                set.sortMark();
                set.printStudentList();
            }
        }while (choose != 0);
    }
}
