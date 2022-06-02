import java.util.HashSet;
import java.util.Scanner;

public class StudentHashSet {
    HashSet<Student> set = new HashSet<>();
    Scanner sc = new Scanner(System.in);

    public StudentHashSet() {
        set.add(new Student("ms1", "Ng Tung Anh", 9));
        set.add(new Student("ms2", "Ng Hong Nhung", 10));
        set.add(new Student("ms3", "Ng Phuong Anh", 7));
        set.add(new Student("ms4", "Ng Thuy Linh", 6));
        set.add(new Student("ms5", "Ng Huong Mai", 4));
    }

    public void addStudent(Student student) {
        this.set.add(student);
    }

    public void printStudentList() {
        for (Student student :
                set) {
            System.out.println(student);
        }
    }

    public int countStudent() {
        return this.set.size();
    }

    public void findById(String id) {
        for (Student student :
                set) {
            if (student.getId().contains(id)) {
                System.out.println(student);
            }
        }
    }

    public void deleteAll() {
        this.set.removeAll(set);
    }

    public void delete(String id) {
        boolean found = false;
        for (Student student :
                set) {
            if (student.getId() == id) {
                int choice;
                System.out.println("Are you sure deleting this student?  (1.Yes 2.No");
                choice = new Scanner(System.in).nextInt();
                if (choice == 1)
                    set.remove(student);
                found = true;
            }
        }
    }

    public boolean deleteById(Student student) {
        return this.set.remove(student);
    }

    public void findByName(String name) {
        for (Student student :
                set) {
            if (student.getName().contains(name)) {
                System.out.println(student);
            }
        }
    }

}
