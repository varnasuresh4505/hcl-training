# Day 10 — Memory Management

## Objective
To understand Java stack and heap memory, garbage collection, and common memory-related pitfalls through practical experiments.

## Topics Covered
- Stack frames and heap objects
- StackOverflowError
- OutOfMemoryError
- String concatenation vs StringBuilder
- Garbage collection logs
- Integer caching and reference comparison

## How to Run

Compile:

```bash
javac MemoryLab.java
```

Run individual experiments:

```bash
java -Xss256k MemoryLab stack
java -Xss1m MemoryLab stack
java -Xmx64m MemoryLab heap
java MemoryLab string
java -Xlog:gc MemoryLab gc
java MemoryLab integer
```

## Deliverables
- MemoryLab.java
- memory-results.md
- Experiment observations and explanations