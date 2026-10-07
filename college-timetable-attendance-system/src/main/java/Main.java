import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do 
        {
            System.out.println("-----College Timetable & Attendance System-----");
            System.out.println("1. Configure Subjects, Sections and Rooms");
            System.out.println("2. Create Timetable with Clash Detection");
            System.out.println("3. Mark and Edit Attendance");
            System.out.println("4. Attendance Percentage and Low Attendance Alerts");
            System.out.println("5. Assign Substitute Faculty");
            System.out.println("6. Generate Section Attendance Reports");
            System.out.println("7. Manage Timetable and Attendance Data");
            System.out.println("8. View Academic Information");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            if(!scanner.hasNextInt()) 
            {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }
            choice = scanner.nextInt();
            switch(choice) 
            {
                case 1:
                    System.out.println("Configure Subjects, Sections and Rooms selected.");
                    break;
                case 2:
                    System.out.println("Create Timetable with Clash Detection selected.");
                    break;
                case 3:
                    System.out.println("Mark and Edit Attendance selected.");
                    break;
                case 4:
                    System.out.println("Attendance Percentage and Low Attendance Alerts selected.");
                    break;
                case 5:
                    System.out.println("Assign Substitute Faculty selected.");
                    break;
                case 6:
                    System.out.println("Generate Section Attendance Reports selected.");
                    break;
                case 7:
                    System.out.println("Manage Timetable and Attendance Data selected.");
                    break;
                case 8:
                    System.out.println("View Academic Information selected.");
                    break;
                case 0:
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select 0 to 8.");
            }

        } while (choice != 0);
    }
}