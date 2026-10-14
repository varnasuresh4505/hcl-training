
import java.util.*;
public class LibraryWaitlist 
{
    public static void main(String[] args) 
    {
        List<String> books = new ArrayList<>();
        books.add("Java");
        books.add("Python");
        books.add("SQL");
        books.add("Java");
        System.out.println("Library Catalogue:");
        for(String book : books) 
        {
            System.out.println(book);
        }
        Set<String> uniqueBooks = new LinkedHashSet<>(books);
        System.out.println("\nUnique Books:");
        for(String book : uniqueBooks) 
        {
            System.out.println(book);
        }
        Queue<String> waitlist = new ArrayDeque<>();
        waitlist.offer("Arun");
        waitlist.offer("Priya");
        waitlist.offer("Kumar");
        System.out.println("\nLibrary Waitlist:");
        while(!waitlist.isEmpty()) 
        {
            System.out.println(waitlist.poll());
        }
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer("Student");
        priorityQueue.offer("Faculty");
        priorityQueue.offer("Student");
        System.out.println("\nPriority Queue:");
        while(!priorityQueue.isEmpty()) 
        {
            System.out.println(priorityQueue.poll());
        }
        List<String> borrowedBooks = new ArrayList<>();
        borrowedBooks.add("Java");
        borrowedBooks.add("Python");
        borrowedBooks.add("SQL");
        Iterator<String> iterator = borrowedBooks.iterator();
        while(iterator.hasNext()) 
        {
            String book = iterator.next();
            if(book.equals("Python")) 
            {
                iterator.remove();
            }
        }
        System.out.println("\nBooks After Removing Overdue Book:");
        for(String book : borrowedBooks) 
        {
            System.out.println(book);
        }
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long start = System.nanoTime();
        for(int i = 0; i < 10000; i++) 
        {
            arrayList.add(0, i);
        }
        long arrayTime = System.nanoTime() - start;
        start = System.nanoTime();
        for(int i = 0; i < 10000; i++) 
        {
            linkedList.add(0, i);
        }
        long linkedTime = System.nanoTime() - start;
        System.out.println("\nInsertion Timing:");
        System.out.println("ArrayList: " + arrayTime + " ns");
        System.out.println("LinkedList: " + linkedTime + " ns");
        start = System.nanoTime();
        for(int i = 0; i < 10000; i++) 
        {
            arrayList.get(i);
        }
        arrayTime = System.nanoTime() - start;
        start = System.nanoTime();
        for(int i = 0; i < 10000; i++) 
        {
            linkedList.get(i);
        }
        linkedTime = System.nanoTime() - start;
        System.out.println("\nget(i) Timing:");
        System.out.println("ArrayList: " + arrayTime + " ns");
        System.out.println("LinkedList: " + linkedTime + " ns");
    }
}
