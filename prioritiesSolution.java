import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class prioritiesSolution {
    class Student {
        private int id;
        private String name;
        private double cgpa;

        Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        public int getID() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public double getCGPA() {
            return this.cgpa;
        }

    }
    class Priorities {

        List<Student> getStudents(List<String> events) {
           
            PriorityQueue<Student> StudentQuery = new PriorityQueue<>(Comparator.comparing(Student::getCGPA).reversed()
                    .thenComparing(Student::getName)
                    .thenComparing(Student::getID));
            for (String event : events) {
                List<String> words = new ArrayList<>(Arrays.asList(event.split(" ")));
                if (words.get(0).equals("ENTER")) {
                    StudentQuery.add(new Student(Integer.parseInt(words.get(3)), words.get(1),
                            Double.parseDouble(words.get(2))));
                } else {
                    StudentQuery.poll();
                }
            }
            List<Student> students = new ArrayList<>();
            while(StudentQuery.peek()!=null){
                students.add(StudentQuery.poll());
            }
            return students;
        }

    }

    public void run(Scanner scan) {
        final Priorities priorities = new Priorities();
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }

}
