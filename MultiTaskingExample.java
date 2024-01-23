class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Task 1: " + i);
            try {
                Thread.sleep(500); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Task2 extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'J'; ch++) {
            System.out.println("Task 2: " + ch);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Task3 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 3: Square of " + i + " is " + i * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Task4 extends Thread {
    public void run() {
        System.out.println("Task 4: Hello from Task 4!");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class MultiTaskingExample {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();

        // Start all threads
        task1.start();
        task2.start();
        task3.start();
        task4.start();
    }
}
