public class MonthlyUsageAnalyser 
{
    public static void main(String[] args) 
    {
        final int months = 12;
        String[] monthNames = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        int[] usage = {
            100, 150, 200, 110, 160, 180,
            200, 190, 170, 210, 230, 250
        };
        int total = 0;
        int maximum = usage[0];
        int minimum = usage[0];
        int maximumIndex = 0;
        int minimumIndex = 0;
        for (int i=0;i<months;i++) 
        {
            total += usage[i];
            if (usage[i] > maximum) 
            {
                maximum = usage[i];
                maximumIndex = i;
            }
            if (usage[i] < minimum) 
            {
                minimum = usage[i];
                minimumIndex = i;
            }
        }
        double average = (double) total / months;
        System.out.println("---Monthly Usage Analyser---");
        for (int i=0;i<months;i++) 
        {
            System.out.println(monthNames[i] + " : " + usage[i]);
        }
        System.out.println("Total Usage   : " + total);
        System.out.println("Average Usage : " + average);
        System.out.println("Highest Usage : " + maximum + " (" + monthNames[maximumIndex] + ")");
        System.out.println("Lowest Usage  : " + minimum + " (" + monthNames[minimumIndex] + ")");
    }
}
