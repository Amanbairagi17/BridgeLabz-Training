package com.linkedlist.roundrobinalgorithm;

public class  RoundRobinScheduler {
    private ProcessNode head;
    private int timeQuantum;

    RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process at end
    public void addProcess(int pid, int burst, int priority) {
        ProcessNode node = new ProcessNode(pid, burst, priority);

        if (head == null) {
            head = node;
            node.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
    }

    // Execute Round Robin Scheduling
    public void execute() {
        if (head == null) return;

        int time = 0;
        int completed = 0;
        int totalProcesses = countProcesses();
        ProcessNode curr = head;

        while (completed < totalProcesses) {

            if (curr.remainingTime > 0) {
                System.out.println("\nExecuting Process P" + curr.pid);

                int execTime = Math.min(timeQuantum, curr.remainingTime);
                curr.remainingTime -= execTime;
                time += execTime;

                updateWaitingTime(curr, execTime);

                if (curr.remainingTime == 0) {
                    curr.turnaroundTime = time;
                    completed++;
                    System.out.println("Process P" + curr.pid + " completed");
                }
            }

            displayQueue();
            curr = curr.next;
        }

        calculateAverageTimes();
    }

    // Update waiting time for other processes
    private void updateWaitingTime(ProcessNode current, int execTime) {
        ProcessNode temp = head;
        do {
            if (temp != current && temp.remainingTime > 0) {
                temp.waitingTime += execTime;
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Display queue after each round
    public void displayQueue() {
        ProcessNode temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print("P" + temp.pid + "(" + temp.remainingTime + ") ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Count processes
    private int countProcesses() {
        int count = 0;
        ProcessNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    // Average waiting & turnaround time
    private void calculateAverageTimes() {
        double totalWT = 0, totalTAT = 0;
        int count = 0;

        ProcessNode temp = head;
        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnaroundTime;
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("\nAverage Waiting Time = " + (totalWT / count));
        System.out.println("Average Turnaround Time = " + (totalTAT / count));
    }
}

