public class WeeklyData 
{
    public static void main(String[] args) 
    {
        String[] days = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday"
        };

        int[] attendance = {
            82,78,91,74,88
        };

        System.out.println("---Weekly Attendance Data---");
        for (int i=0;i<days.length;i++) 
        {
            System.out.println(days[i] + " : " + attendance[i] + "%");
        }
    }
}