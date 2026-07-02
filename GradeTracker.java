import java.util.*;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        
        System.out.println("--- Student Grade Tracker ---");
        
        // Input loop
        while (true) {
            System.out.print("Enter a grade (or type -1 to finish): ");
            double grade = sc.nextDouble();
            
            if (grade == -1) break;
            if (grade < 0 || grade > 100) {
                System.out.println("Please enter a valid grade between 0 and 100.");
                continue;
            }
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            displaySummary(grades);
        }
        
        sc.close();
    }

    public static void displaySummary(ArrayList<Double> grades) {
        double sum = 0;
        double max = grades.get(0);
        double min = grades.get(0);

        for (double grade : grades) {
            sum += grade;
            if (grade > max) max = grade;
            if (grade < min) min = grade;
        }

        double average = sum / grades.size();

        System.out.println("\n--- Summary Report ---");
        System.out.println("Total Students: " + grades.size());
        System.out.printf("Average Score: %.2f%n", average);
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score:  " + min);
    }
}