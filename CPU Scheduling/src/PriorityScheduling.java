import java.util.*;

public class PriorityScheduling {
    public static void schedule(Process[] processes) {
        Arrays.sort(processes, Comparator.comparingInt(p -> p.priority));
        FCFS.schedule(processes);  // Reuse FCFS to calculate wait/turnaround time
    }
}
