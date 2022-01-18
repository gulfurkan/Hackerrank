import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class javaSortSolution {
    class Student {
        private int id;
        private String fname;
        private double cgpa;

        public Student(int id, String fname, double cgpa) {
            super();
            this.id = id;
            this.fname = fname;
            this.cgpa = cgpa;
        }

        public int getId() {
            return id;
        }

        public String getFname() {
            return fname;
        }

        public double getCgpa() {
            return cgpa;
        }
    }

    class compareStudents implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            int i = o1.getCgpa() > o2.getCgpa() ? -1 : o1.getCgpa() < o2.getCgpa() ? 1 : 0;
            if (i != 0)
                return i;
            i = o1.getFname().compareTo(o2.getFname());
            if (i != 0)
                return i;
            return o2.getId() - o1.getId();
        }

    }

    public void run(Scanner in) {
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        compareStudents cStudents = new compareStudents();
        Collections.sort(studentList, cStudents);
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
