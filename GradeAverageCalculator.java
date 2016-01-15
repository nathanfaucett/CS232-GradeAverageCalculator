import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Nathan Faucett
 */
public class GradeAverageCalculator {
	
	static int getShort(Scanner scanner) {
		if (!scanner.hasNextShort()) {
			System.out.println("Enter a valid Integer:");
			scanner.next();
			return GradeAverageCalculator.getShort(scanner);
		} else {
			return scanner.nextShort();
		}
	}
	
	static double getDouble(Scanner scanner) {
		if (!scanner.hasNextDouble()) {
			System.out.print("Enter a valid Double:");
			scanner.next();
			return GradeAverageCalculator.getDouble(scanner);
		} else {
			return scanner.nextDouble();
		}
	}
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> student_scores = new HashMap<String, Double>();
        
        int number_of_students = 0;
        int number_of_test_scores_per_student = 0;
		
        System.out.println("Grade Average Calculator");
		
        System.out.print("Enter number of students to process: ");
	number_of_students = GradeAverageCalculator.getShort(scanner);
        
        System.out.print("Enter number of test scores per student: ");
        number_of_test_scores_per_student = GradeAverageCalculator.getShort(scanner);
        
        for (int i = 0, il = number_of_students; i < il; i++) {
            System.out.print("Enter name for student #" + (i + 1) + ": ");
            String name = scanner.next();
            double avg = 0;
            
            for (int j = 0, jl = number_of_test_scores_per_student; j < jl; j++) {
                System.out.print(name + " Student #" + (i + 1) + " - Enter test score #" + (j + 1) + ": ");
                avg += GradeAverageCalculator.getDouble(scanner);
            }
            
            student_scores.put(name, avg / number_of_test_scores_per_student);
        }
        
        System.out.println("Average scores:");
        
        for (Map.Entry<String, Double> entry : student_scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
	}
    }
}
