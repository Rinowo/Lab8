import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentLinkedList {
    private LinkedList<Student> linkedlist = new LinkedList<>();

    public StudentLinkedList() {
        linkedlist.add(new Student("ms1", "Ng Tung Anh", 9));
        linkedlist.add(new Student("ms2", "Ng Hong Nhung", 10));
        linkedlist.add(new Student("ms3", "Ng Phuong Anh", 7));
        linkedlist.add(new Student("ms4", "Ng Thuy Linh", 6));
        linkedlist.add(new Student("ms5", "Ng Huong Mai", 4));
    }

    public void addStudent(Student student) {
        this.linkedlist.add(student);
    }

    public void printStudentList() {
        for (Student student :
                linkedlist) {
            System.out.println(student);
        }
    }

    public int countStudent() {
        return this.linkedlist.size();
    }

    public void findById(String id) {
        for (Student student :
                linkedlist) {
            if (student.getId().contains(id)) {
                System.out.println(student);
            }
        }
    }

    public void deleteAll() {
        this.linkedlist.removeAll(linkedlist);
    }

    public boolean deleteById(Student student) {
        return this.linkedlist.remove(student);
    }

    public void findByName(String name) {
        for (Student student :
                linkedlist) {
            if (student.getId().contains(name)) {
                System.out.println(student);
            }
        }
    }

    public void delete(String id) {
        boolean found = false;
        for (Student student :
                linkedlist) {
            if (student.getId() == id) {
                int choice;
                System.out.println("Are you sure deleting this student?  (1.Yes 2.No");
                choice = new Scanner(System.in).nextInt();
                if (choice == 1)
                    linkedlist.remove(student);
                found = true;
            }
        }
    }

    public void sortByMark() {
        Collections.sort(this.linkedlist, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getMark() > o2.getMark()) {
                    return -1;
                }
                else if (o1.getMark() < o2.getMark()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });
    }
}
