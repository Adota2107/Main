package StudentClassification;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws Exception {
        List<Student> list = new ArrayList<>();
        StudentManagement studentManagement = new StudentManagement();
        //Step 1: Create student information
        studentManagement.createStudent(list);
        //Step 2: Average marks of student
        studentManagement.averageStudent(list);
        //Step 3: Static types of student
        studentManagement.getPercentTypeStudent(list);
        //Step 4: Exit program
        System.exit(0);
    }
}
