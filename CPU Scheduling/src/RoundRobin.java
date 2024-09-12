import java.util.*;

public class RoundRobin {
    public static void schedule(Process[] processes, int quantum) {
        int n = processes.length;
        int[] remainingTime = new int[n];
        int[] waitTime = new int[n];
        int[] turnAroundTime = new int[n];
        
        for (int i = 0; i < n; i++) {
            remainingTime[i] = processes[i].burstTime;
        }

        int currentTime = 0;
        boolean done;

        do {
            done = true;
            for (int i = 0; i < n; i++) {
                if (remainingTime[i] > 0) {
                    done = false;
                    if (remainingTime[i] > quantum) {
                        currentTime += quantum;
                        remainingTime[i] -= quantum;
                    } else {
                        currentTime += remainingTime[i];
                        waitTime[i] = currentTime - processes[i].burstTime;
                        remainingTime[i] = 0;
                    }
                }
            }
        } while (!done);

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
