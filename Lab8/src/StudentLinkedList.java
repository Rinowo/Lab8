import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentLinkedList {
    private LinkedList<Student> list = new LinkedList<>();

    public StudentLinkedList() {
        list.add(new Student("ms1", "Ng Tung Anh", 9));
        list.add(new Student("ms2", "Ng Hong Nhung", 10));
        list.add(new Student("ms3", "Ng Phuong Anh", 7));
        list.add(new Student("ms4", "Ng Thuy Linh", 6));
        list.add(new Student("ms5", "Ng Huong Mai", 4));
    }

    public void addStudent(Student student) {
        this.list.add(student);
    }

    public void printStudentList() {
        for (Student student :
                list) {
            System.out.println(student);
        }
    }

    public int countStudent() {
        return this.list.size();
    }

    public void findById(String id) {
        for (Student student :
                list) {
            if (student.getId().contains(id)) {
                System.out.println(student);
            }
        }
    }



    public void deleteAll() {
        this.list.removeAll(list);
    }

    public boolean deleteById(Student student) {
        return this.list.remove(student);
    }

    public void findByName(String name) {
        for (Student student :
                list) {
            if (student.getName().contains(name)) {
                System.out.println(student);
            }
        }
    }

    public void deleteByID(String id) {
        boolean found = false;
        for (Student student :
                list) {
            if (student.getId() == id) {
                int choice;
                System.out.println("Are you sure deleting this student?  (1.Yes 2.No");
                choice = new Scanner(System.in).nextInt();
                if (choice == 1)
                    list.remove(student);
                found = true;
            }
            if (found == false){
                System.out.println("Cannot finding this student: " + id);
                found = false;
            }
        }
    }

    public boolean removeById(Student student) {
        return this.list.remove(student);
    }

    public boolean delete(Student id) {
        Student student = this.list.stream()
                .filter(student1 -> student1.getId().equals(id))
                .findFirst().orElse(null);
        if (student ==null) {
            return false;
        }
        this.list.remove(student);
        return true;
    }

    public void sortByMark() {
        Collections.sort(this.list, new Comparator<Student>() {
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
