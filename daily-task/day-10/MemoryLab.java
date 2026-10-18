import java.util.ArrayList;
import java.util.List;
public class MemoryLab 
{
    static int depth = 0;
    static void recursiveMethod() 
    {
        depth++;
        recursiveMethod();
    }
    static void stackExperiment() 
    {
        try 
        {
            recursiveMethod();
        } 
        catch(StackOverflowError e) 
        {
            System.out.println("StackOverflowError occurred.");
            System.out.println("Approximate recursion depth: " + depth);
        }
    }
    //OutOfMemoryError
    static void heapExperiment() 
    {
        List<byte[]> memory = new ArrayList<>();
        int count = 0;
        try 
        {
            while(true) 
            {
                memory.add(new byte[1024 * 1024]); 
                count++;
            }
        } 
        catch(OutOfMemoryError e) 
        {
            System.out.println("OutOfMemoryError occurred.");
            System.out.println("Allocated approximately " + count + " MB.");
        }
    }
    //String vs StringBuilder
    static void stringExperiment() 
    {
        int count = 15000;
        long start = System.nanoTime();
        String text = "";
        for(int i = 0; i < count; i++) 
        {
            text += "a";
        }
        long stringTime = System.nanoTime() - start;
        start = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < count; i++) 
        {
            builder.append("a");
        }
        String result = builder.toString();
        long builderTime = System.nanoTime() - start;
        System.out.println("String length: " + text.length());
        System.out.println("Builder length: " + result.length());
        System.out.println("String += time: " + stringTime + " ns");
        System.out.println("StringBuilder time: " + builderTime + " ns");
    }
    //Garbage collection
    static void gcExperiment() 
    {
        for(int i = 0; i < 100; i++) 
        {
            byte[] data = new byte[1024 * 1024]; 
        }
        System.gc();
        System.out.println("GC experiment completed.");
        System.out.println("Check the -Xlog:gc output.");
    }
    //Integer cache
    static void integerExperiment() 
    {
        Integer a = 100;
        Integer b = 100;
        Integer x = 200;
        Integer y = 200;
        System.out.println("a == b: " + (a == b));
        System.out.println("x == y: " + (x == y));
        System.out.println("x.equals(y): " + x.equals(y));
    }
    public static void main(String[] args) 
    {
        if(args.length == 0) 
        {
            System.out.println("Choose an experiment:");
            System.out.println("stack, heap, string, gc, integer");
            return;
        }
        switch(args[0].toLowerCase()) 
        {
            case "stack":
                stackExperiment();
                break;
            case "heap":
                heapExperiment();
                break;
            case "string":
                stringExperiment();
                break;
            case "gc":
                gcExperiment();
                break;
            case "integer":
                integerExperiment();
                break;
            default:
                System.out.println("Invalid experiment name.");
        }
    }
}
