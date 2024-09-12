import java.util.*;

public class SJF {
    public static void schedule(Process[] processes) {
        Arrays.sort(processes, Comparator.comparingInt(p -> p.burstTime));
        FCFS.schedule(processes);  // Reuse FCFS to calculate wait/turnaround time
    }
}
