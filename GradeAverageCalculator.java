/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Nathan Faucett
 */
public class GradeAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> student_scores = new HashMap<String, Double>();
        
        int number_of_students;
        int number_of_test_scores_per_student;
		
        System.out.println("Grade Average Calculator");
		
        System.out.print("Enter number of students to process: ");
        number_of_students = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Enter number of test scores per student: ");
        number_of_test_scores_per_student = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0, il = number_of_students; i < il; i++) {
            System.out.print("Enter name for student #" + (i + 1) + ": ");
            String name = scanner.nextLine();
            double avg = 0;
            
            for (int j = 0, jl = number_of_test_scores_per_student; j < jl; j++) {
                System.out.print(name + " Student #" + (i + 1) + " - Enter test score #" + (j + 1) + ": ");
                avg += Integer.parseInt(scanner.nextLine());
            }
            
            student_scores.put(name, avg / number_of_test_scores_per_student);
        }
        
        System.out.println("Average scores:");
        
        for (Map.Entry<String, Double> entry : student_scores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
		    }
    }
}
