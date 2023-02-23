package StudentClassification;

import java.util.Scanner;

public class ValidInput {
    Scanner sc = new Scanner(System.in);

    public String checkInput(){
        while (true) {
            String input = sc.nextLine().trim();
            if (input.isBlank()) {
                System.err.println("Can't leave blank");
                System.out.print("Enter again: ");
            }else{
                return input;
            }
        }
    }


    public double checkMarks(String subject){
        while (true) {
            try {
                double mark = Double.parseDouble(sc.nextLine());
                if (mark > 10) {
                    System.out.println(subject + " is less than equal ten");
                    System.out.print(subject + ": ");
                } else if (mark < 0){
                    System.out.println(subject + " is greater than equal zero");
                    System.out.print(subject + ": ");
                }else{
                    return mark;
                }
            } catch (NumberFormatException nfe) {
                System.out.println(subject + " is digit");
                System.out.print(subject + ": ");
            }
        }
    }

    public boolean isEnterMoreStudent(){
        while (true) {
            System.out.print("Do you want enter more student information? (Y/N): ");
            String choice = checkInput();
            if (choice.length() == 1) {
                if (choice.charAt(0) == 'Y' || choice.charAt(0) == 'y') {
                    return true;
                }
                if (choice.charAt(0) == 'N' || choice.charAt(0) == 'n') {
                    return false;
                }
            }
            System.err.println("Just enter Y or N");
        }
    }
}
