import java.util.Scanner;

/*
Re write the student mark sheet program using if else and while loop.
 */
public class Question02 {
    String grade = null;
    public static void main(String[] args) {
        Question02 result = new Question02();
        result.marksheet();
    }
    public void marksheet(){
        Scanner marks = new Scanner(System.in);         //Scanner Class
        System.out.println("Enter Student Name: ");
        String studentName = marks.nextLine();
        System.out.println("Enter Student RollNo: ");
        int rollno = marks.nextInt();
        System.out.println("Enter Mathematics Marks: ");
        int maths = marks.nextInt();
        System.out.println("Enter Science Marks: ");
        int science = marks.nextInt();
        System.out.println("Enter English Marks: ");
        int english = marks.nextInt();
        while ((maths < 0 || maths > 100 ) || (science < 0 || science > 100) || (english < 0 || english > 100)){
            System.out.println("Invalid Input. Marks should be between 0 to 100");
            System.out.println("Enter Mathematics Marks: ");
            maths = marks.nextInt();
            System.out.println("Enter Science Marks: ");
            science = marks.nextInt();
            System.out.println("Enter English Marks: ");
            english = marks.nextInt();
        }
        int total = (maths + science + english);
        System.out.println("Total = " + total);
        int percentage = (total/3);
        System.out.println("Percentage = " + percentage + "%");
        if (percentage>=80 && percentage<=100) {
            grade = "A+";                      //if else condition
            System.out.println("Grade: " + grade);
        }
        else if (percentage>=60) {
            grade = "A";
            System.out.println("Grade: " + grade);
        }
        else if (percentage>=50) {
            grade = "B";
            System.out.println("Grade: " + grade);        }
        else if (percentage>=35) {
            grade = "C";
            System.out.println("Grade: " + grade);        }
        else if (percentage<35) {
            grade = "Fail";
            System.out.println("Grade: " + grade);        }
        else {
            System.out.println("Invalid Input");
        }
        System.out.println("+--------------------------------+");
        System.out.println("|           MARKSHEET            |");
        System.out.println("| Enter Student Name: " +studentName+"    |");
        System.out.println("| Enter Student RollNo: " +rollno+"       |");
        System.out.println("|--------------------------------|");
        System.out.println("| Enter Mathematics Marks: " +maths+"    |");
        System.out.println("| Enter Science Marks: " +science+"        |");
        System.out.println("| Enter English Marks: " +english+"        |");
        System.out.println("|--------------------------------|");
        System.out.println("| Total = " + total+"                    |");
        System.out.println("| Percentage = " + percentage + "%" +"               |");
        System.out.println("| Grade = " + grade +     "                     |");
        System.out.println("+--------------------------------+");


    }
}

