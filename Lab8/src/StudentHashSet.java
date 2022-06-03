import java.util.*;
import java.util.stream.Collectors;

public class StudentHashSet {
    HashSet<Student> set = new HashSet<>();
    List<Student> list = new ArrayList<>(set);
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

    public void deleteById(String id) {
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
            else {
                System.out.println("Cannot finding this student: " + id);
                found = false;
            }
        }
    }

    public boolean remove(String id) {
        Student student = this.set.stream()
                .filter(student1 -> student1.getId().equals(id))
                .findFirst().orElse(null);
        if (student == null) {
            return false;
        }
        this.set.remove(student);
        return true;
    }

    public void deleteAll() {
        this.set.removeAll(set);
    }

    public void findByName(String name) {
        for (Student student :
                set) {
            if (student.getName().contains(name)) {
                System.out.println(student);
            }
        }
    }

    public void sortMark() {
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
        for (Student student :
                list) {
            System.out.println("After Sorting" + list);
        }
    }

}

