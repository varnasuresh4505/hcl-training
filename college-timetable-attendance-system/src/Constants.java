public class Constants 
{

    public static final int DAYS_IN_WEEK = 5;
    public static final int WORKING_HOURS_PER_DAY = 8;
    public static final int LOW_ATTENDANCE_THRESHOLD = 75;
    public static final String PROJECT_NAME = "College Timetable & Attendance System";
    public static void main(String[] args) 
    {
        System.out.println("Project: " + PROJECT_NAME);
        System.out.println("Working Days: " + DAYS_IN_WEEK);
        System.out.println("Working Hours Per Day: " + WORKING_HOURS_PER_DAY);
        System.out.println("Low Attendance Threshold: " + LOW_ATTENDANCE_THRESHOLD + "%");
    }
}
