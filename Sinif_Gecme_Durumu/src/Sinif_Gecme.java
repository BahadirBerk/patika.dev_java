import java.util.Scanner;

public class Sinif_Gecme {
    public static void main(String[] args) {
        String[] subjects = { "Matematik", "Fizik", "Türkçe", "Kimya", "Müzik" };
        int passingGrade = 55;
        int totalGrade = 0;
        int validGrades = 0;

        Scanner input = new Scanner(System.in);

        for (String subject : subjects) {
            System.out.print(subject + " dersi notunu giriniz: ");
            int grade = input.nextInt();

            if (grade >= 0 && grade <= 100) {
                totalGrade += grade;
                validGrades++;
            }
        }

        if (validGrades > 0) {
            double average = (double) totalGrade / validGrades;

            if (average >= passingGrade) {
                System.out.println("Tebrikler, ortalaman " + average + " , geçme notunu aştın :')");
            } else {
                System.out.println("Maalesef, ortalaman " + average + " , kaldın :/ ");
            }
        } else {
            System.out.println("Geçersiz not.");
        }
    }
}
