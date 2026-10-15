
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class GenericToolkit 
{
    static class Pair<K, V> 
    {
        private K key;
        private V value;
        Pair(K key, V value) 
        {
            this.key = key;
            this.value = value;
        }
        void display() 
        {
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
    static class Box<T> 
    {
        private T value;
        Box(T value) 
        {
            this.value = value;
        }
        T getValue() 
        {
            return value;
        }
    }
    static <T extends Comparable<T>> T max(T a, T b, T c) 
    {
        T largest = a;
        if(b.compareTo(largest) > 0) 
        {
            largest = b;
        }
        if(c.compareTo(largest) > 0) 
        {
            largest = c;
        }
        return largest;
    }
    static double calculateTotal(List<? extends Number> numbers) 
    {
        double total = 0;
        for(Number number : numbers) 
        {
            total += number.doubleValue();
        }
        return total;
    }
    static void addNumbers(List<? super Integer> numbers) 
    {
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    }
    static class MyResource implements AutoCloseable 
    {
        private String name;
        MyResource(String name) 
        {
            this.name = name;
            System.out.println(name + " opened");
        }
        @Override
        public void close() 
        {
            System.out.println(name + " closed");
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("PAIR");
        Pair<Integer, String> product = new Pair<>(101, "Laptop");
        product.display();
        System.out.println("\nBOX");
        Box<String> box = new Box<>("Java");
        System.out.println("Box contains: " + box.getValue());
        System.out.println("\nMAXIMUM");
        System.out.println("Largest number: " + max(10, 50, 30));
        System.out.println("Largest word: " + max("Apple", "Orange", "Banana"));
        System.out.println("\nWILDCARDS");
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        System.out.println("Total: " + calculateTotal(numbers));
        List<Number> values = new ArrayList<>();
        addNumbers(values);
        System.out.println("Added numbers: " + values);
        System.out.println("\nPRODUCTS FROM CSV");
        try(BufferedReader reader = new BufferedReader(new FileReader("products.csv"))) 
        {
            String line;
            while((line = reader.readLine()) != null) 
            {
                System.out.println(line);
            }
        } 
        catch(IOException e) 
        {
            System.out.println("Could not read products.csv: " + e.getMessage());
        }
        System.out.println("\nRESOURCE CLOSING");
        try(MyResource first = new MyResource("Resource 1");
        MyResource second = new MyResource("Resource 2")) 
        {
            System.out.println("Inside try block");
        } 
        catch(Exception e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
