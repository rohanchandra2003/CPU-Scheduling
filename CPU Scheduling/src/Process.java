public class Process {
    int pid;  // Process ID
    int burstTime;  // Burst Time of the process
    int arrivalTime;  // Arrival Time of the process
    int priority;  // Priority (for Priority Scheduling)
    
    public Process(int pid, int burstTime, int arrivalTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
        this.priority = priority;
    }
}
