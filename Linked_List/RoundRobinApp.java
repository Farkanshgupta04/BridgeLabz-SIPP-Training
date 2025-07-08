class Process {
    int id, burstTime, remainingTime;
    int priority;
    Process next;

    Process(int id, int burstTime, int priority) {
        this.id = id;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}

class RoundRobinScheduler {
    Process head = null;

    void addProcess(Process p) {
        if (head == null) {
            head = p;
            p.next = head;
        } else {
            Process temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = p;
            p.next = head;
        }
    }

    void simulate(int timeQuantum) {
        if (head == null) return;
        Process current = head;
        while (true) {
            if (current.remainingTime > 0) {
                int usedTime = Math.min(current.remainingTime, timeQuantum);
                System.out.println("Process " + current.id + " runs for " + usedTime + " units");
                current.remainingTime -= usedTime;
            }

            boolean done = true;
            Process temp = head;
            do {
                if (temp.remainingTime > 0) {
                    done = false;
                    break;
                }
                temp = temp.next;
            } while (temp != head);

            if (done) break;
            current = current.next;
        }
    }
}

public class RoundRobinApp {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();
        scheduler.addProcess(new Process(1, 10, 2));
        scheduler.addProcess(new Process(2, 5, 1));
        scheduler.addProcess(new Process(3, 8, 3));

        System.out.println("Simulating Round Robin with Time Quantum = 4");
        scheduler.simulate(4);
    }
}