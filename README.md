Multi-Threading Example in Java
---
This project demonstrates how to create and manage threads in Java using two approaches:
1. **Extending the `Thread` class**.
2. **Implementing the `Runnable` interface**.

## Table of Contents
1. [Introduction](#introduction)
2. [Thread Example](#thread-example)
3. [Runnable Example](#runnable-example)
4. [How to Run the Code](#how-to-run-the-code)
5. [Key Concepts](#key-concepts)

---

## Introduction

Multithreading is a powerful feature in Java that allows concurrent execution of two or more threads. Threads are lightweight sub-processes that share the same memory space, making them efficient for tasks that can be parallelized.

This project provides two examples:
1. **Extending the `Thread` class**: A simple way to create threads by inheriting from the `Thread` class.
2. **Implementing the `Runnable` interface**: A more flexible approach that separates the thread's task from the thread itself.

---

## Thread Example

### Code: `ThreadExample.java`

```java
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(500); // Pause the thread for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        }
    }
}
```
---
### Main class
```Java
 class ThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Start the thread

        // Main thread continues to run
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread is running: " + i);
            try {
                Thread.sleep(500); // Pause the main thread for 500ms
            } catch (InterruptedException e) {
                System.out.println("Main thread was interrupted!");
            }
        }
    }
}
```


### Explanation:
- **`MyThread`**: A class that extends `Thread` and overrides the `run()` method to define the thread's behavior.
- **`thread.start()`**: Starts the thread, which executes the `run()` method concurrently with the main thread.
- **`Thread.sleep(500)`**: Pauses the thread for 500 milliseconds to simulate a task taking time.

---

## Runnable Example

### Code: `RunnableExample.java`

```java
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable thread is running: " + i);
            try {
                Thread.sleep(500); // Pause the thread for 500ms
            } catch (InterruptedException e) {
                System.out.println("Runnable thread was interrupted!");
            }
        }
    }
}
```
### Main class

```java
public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable); // Pass Runnable to Thread
        thread.start(); // Start the thread

        // Main thread continues to run
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread is running: " + i);
            try {
                Thread.sleep(500); // Pause the main thread for 500ms
            } catch (InterruptedException e) {
                System.out.println("Main thread was interrupted!");
            }
        }
    }
}
```

### Explanation:
- **`MyRunnable`**: A class that implements the `Runnable` interface and overrides the `run()` method.
- **`Thread thread = new Thread(myRunnable)`**: Creates a `Thread` object by passing the `Runnable` instance.
- **`thread.start()`**: Starts the thread, which executes the `run()` method concurrently with the main thread.

---

## How to Run the Code

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/multi-threading-example.git
   cd multi-threading-example
   ```

2. **Compile the Java files**:
   ```bash
   javac ThreadExample.java
   javac RunnableExample.java
   ```

3. **Run the examples**:
    - For the `Thread` example:
      ```bash
      java ThreadExample
      ```
    - For the `Runnable` example:
      ```bash
      java RunnableExample
      ```

---

## Key Concepts

### 1. **Thread Lifecycle**
- **New**: The thread is created but not started.
- **Runnable**: The thread is ready to run.
- **Running**: The thread is executing.
- **Blocked/Waiting**: The thread is paused (e.g., waiting for resources).
- **Terminated**: The thread has finished execution.

### 2. **Thread vs Runnable**
- **Thread**: Simple to use but less flexible (Java doesn't support multiple inheritance).
- **Runnable**: More flexible and recommended for most cases (separates task from thread).

### 3. **Thread Synchronization**
- When multiple threads access shared resources, synchronization is required to avoid race conditions.
- Use `synchronized` blocks or methods to ensure thread safety.

---