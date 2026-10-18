# Day 10 — Memory Management Lab

## Experiment Results

Experiment                  Command / Test                  Actual Result          

StackOverflowError      | `java -Xss256k MemoryLab stack` | Recursion depth: 2445 
StackOverflowError      | `java -Xss1m MemoryLab stack`   | Recursion depth: 22461  
OutOfMemoryError        | `java -Xmx64m MemoryLab heap`   | Approximate allocated MB: 31
String vs StringBuilder | `java MemoryLab string`         | String: 74599200 ns; StringBuilder: 2500600 ns 
Garbage collection      | `java -Xlog:gc MemoryLab gc`    | GC log messages observed: 3.774ms 
Integer cache           | `java MemoryLab integer`        | `100` references equal; `200` references unequal by `==` on standard 

## My Observations

1. **StackOverflowError:** Recursion creates stack frames. Too many recursive calls can exhaust the thread stack.
2. **OutOfMemoryError:** Retaining too many objects can exhaust the available Java heap.
3. **String vs StringBuilder:** StringBuilder is generally more efficient for repeated concatenation in loops.
4. **Garbage collection:** The JVM can reclaim objects that are no longer reachable.
5. **Integer cache:** `==` compares object references, while `equals()` compares integer values.

## Conclusion

These experiments helped me understand stack and heap memory, garbage collection, common memory pitfalls, and the importance of choosing suitable Java APIs.
