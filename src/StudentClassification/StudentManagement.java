package StudentClassification;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManagement extends ValidInput{

    public void createStudent(List<Student> ls){
        System.out.println("====== Management Student Program ======");
        while (true) {   
            System.out.print("Name: ");
            String name = checkInput();
            System.out.print("Classes: ");
            String classes = checkInput();
            System.out.print("Maths: ");
            double maths = checkMarks("Maths");
            System.out.print("Chemistry: ");
            double chemistry = checkMarks("Chemistry");
            System.out.print("Physics: ");
            double physics = checkMarks("Physics");
            double avg = (maths + chemistry + physics)/3;
            String type = getAverageMarks(avg);
            ls.add(new Student(name, classes, maths, chemistry, physics, avg, type));
            if (!isEnterMoreStudent()) {
                return;
            }
        }
    }

    public void averageStudent(List<Student> ls){
        int i = 0;
        for (Student student : ls) {
            System.out.println("------ Student" + (++i) + " info ------");
            System.out.println("Name: " + student.getName());
            System.out.println("Classes: " + student.getClasses());
            System.out.println("AVG: " + student.getAverage());
            System.out.println("Type: " + student.getRank());
        }
    }

    public void getPercentTypeStudent(List<Student> ls){
        HashMap<String, Double> typeStudent = new HashMap<>();
        int totalStudent = ls.size();
        double typeA = 0;
        double typeB = 0;
        double typeC = 0;
        double typeD = 0;

        for (int i = 0; i < ls.size(); i++) {
            if (ls.get(i).getRank() == "A") {
                typeA++;
            }
            if (ls.get(i).getRank() == "B") {
                typeB++;
            }
            if (ls.get(i).getRank() == "C") {
                typeC++;
            }
            if (ls.get(i).getRank() == "D") {
                typeD++;
            }
        }

        typeStudent.put("A", (typeA/totalStudent)*100);
        typeStudent.put("B", (typeB/totalStudent)*100);
        typeStudent.put("C", (typeC/totalStudent)*100);
        typeStudent.put("D", (typeD/totalStudent)*100);

        System.out.println("------ Classification Info ------");

        for (Map.Entry<String, Double> student : typeStudent.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue() + "%");
        }
    }

    public String getAverageMarks(double avg){
        if (avg > 7.5) {
            return "A";
        } else if (avg >= 6 && avg <= 7.5){
            return "B";
        } else if (avg >= 4 && avg < 6){
            return "C";
        } else {
            return "D";
        }
    }
}
