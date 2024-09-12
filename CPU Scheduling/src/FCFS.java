import java.util.*;

public class FCFS {
    public static void schedule(Process[] processes) {
        int n = processes.length;
        int[] waitTime = new int[n];
        int[] turnAroundTime = new int[n];

        waitTime[0] = 0; // First process has no waiting time

        // Calculate waiting time for all other processes
        for (int i = 1; i < n; i++) {
            waitTime[i] = processes[i - 1].burstTime + waitTime[i - 1];
        }

        // Calculate turn around time
        for (int i = 0; i < n; i++) {
            turnAroundTime[i] = processes[i].burstTime + waitTime[i];
        }

        // Display results
        System.out.println("Process\tBurst Time\tWaiting Time\tTurnaround Time");
        for (int i = 0; i < n; i++) {
            System.out.println(processes[i].pid + "\t\t" + processes[i].burstTime + "\t\t" + waitTime[i] + "\t\t" + turnAroundTime[i]);
        }
    }
}
