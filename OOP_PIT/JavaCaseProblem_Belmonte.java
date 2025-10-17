import java.util.Scanner;

public class JavaCaseProblem_Belmonte{

    public static void main(String[] args) {
        
        String name = "Charlie Belmonte";
        String idNumber = "2024303252";

        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter grade (0-100): ");
        int grade = scanner.nextInt();

        char letterGrade;

        if (grade >= 90 && grade <= 100) {
            letterGrade = 'A';
        } else if (grade >= 80) {
            letterGrade = 'B';
        } else if (grade >= 70) {
            letterGrade = 'C';
        } else if (grade >= 60) {
            letterGrade = 'D';
        } else if (grade >= 0) {
            letterGrade = 'F';
        } else {
            System.out.println("Invalid grade entered.");
            scanner.close();
            return;
        }

        System.out.println("Letter Grade: " + letterGrade);

        scanner.close();
    }
}