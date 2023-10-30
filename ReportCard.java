import java.util.Scanner;

public class ReportCard {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the Student name: ");
        String name = sc.nextLine();

        System.out.println("Enter the Number of subjects: ");
        int noOfSubjects = sc.nextInt();

        int[] marks = marksEntry(noOfSubjects);
        printReportCard(name, noOfSubjects, marks);
    }

    public static int[] marksEntry(int num) {
        int[] subjectArray = new int[num];

        for (int i=0; i<num; i++) {
            System.out.printf("Enter subject-" + (i+1) + " marks: ");
            subjectArray[i] = sc.nextInt();
        }
        return subjectArray;
    }

    public static void printReportCard(String name, int num, int[] marks){
        int total = 0;
        System.out.println("_______________________________________________");
        System.out.println("                 REPORT CARD                   ");
        System.out.println("Name: " + name);
        System.out.println("_______________________________________________");
        System.out.println(" SUBJECT \t\t\t MARKS \t\n");

        for (int i = 0; i<num; i++) {
            System.out.println("Subject-" + (i+1) + " \t\t\t" + (marks[i]));
            total += marks[i];
        }
        System.out.println("_______________________________________________");
        System.out.println("Total: " + total + "\t\t\t Average: " + total/num);
        System.out.println("_______________________________________________");

    }
}
