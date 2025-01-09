
---

# Time complexity 

- It is the relation between input size & Running Time(Operations).

## Time complexity is calculated in the three ways:

- Best Case
- Avg Case
- Worst Case

### Best Case :

When we get the output in minimum numbers of step like only 1 step or something.
It is denoted as **Ω**(1).

### Average Case :

When we calculate the average runtime by adding the runtime of all the cases and dividing it by 'n'.
like 

~~~
(1+2+3+4+5 ..... n)/n
~~~

It is denoted by θ(n).

### Worst case

When we are sure that our program will not exceed this time limit.

It is denoted by O(n).

---

### ==We Always consider the worst case time complexity.==

----

## Examples:

1)

```java
// Outer loop
for (int i = 1; i <= n; i++) {
  System.out.println("Outer: " + i); // Executes 2 times
  
  // Inner loop
  for (int j = 1; j <= n; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
} 
```

The time complexity for this will be O (n$^2$ ) or O ( n x n).

2)

```java
// Outer loop
for (int i = 1; i <= m; i++) {
  System.out.println("Outer: " + i); // Executes 2 times
  
  // Inner loop
  for (int j = 1; j <= n; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
} 

```

The time complexity for this will be O (n x m).

3)

```java
// First loop
for (int i = 1; i <= m; i++) {
  System.out.println("Outer: " + i); // Executes 2 times
  
  // Second loop
for (int j = 1; j <= n; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
} 
```

The time complexity for this will be O (n + m).

**If one of the variable is like 10$^6$ and other is like 5. The final time complexity will 10$^6$ because the other one is negligible compared to 10$^6$ .**

---
# Space Complexity

It is how many variables are stored in the code because of our code.

## Generally the code does not depends on our input size 

For anyone of you who still has confusion that why the size of n does not alter the memory space because n is an int variable and it does not matter how much big or small a number is stored in it an int variable will always take 4 bytes of space in memory. This also applies for the rest of the primitive datatypes like double variable will take 8 bytes.

## But in some cases Like

Arrays: Our memory storage taken depends on our input.
