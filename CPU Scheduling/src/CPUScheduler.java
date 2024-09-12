import java.util.Scanner;

public class CPUScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Sample Processes (pid, burstTime, arrivalTime, priority)
        Process[] processes = {
            new Process(1, 10, 0, 3),
            new Process(2, 5, 1, 1),
            new Process(3, 8, 2, 2)
        };

        System.out.println("Choose CPU Scheduling Algorithm:");
        System.out.println("1. FCFS");
        System.out.println("2. SJF");
        System.out.println("3. Priority Scheduling");
        System.out.println("4. Round Robin");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                FCFS.schedule(processes);
                break;
            case 2:
                SJF.schedule(processes);
                break;
            case 3:
                PriorityScheduling.schedule(processes);
                break;
            case 4:
                System.out.println("Enter Quantum Time:");
                int quantum = scanner.nextInt();
                RoundRobin.schedule(processes, quantum);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
