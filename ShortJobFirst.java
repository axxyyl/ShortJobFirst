package my.exercises.shortjob;

public class ShortJobFirst {

    public  static final MyQueueLinked readyQ = new MyQueueLinked();

    public  static void jobDisplayFormat(Job job) {
        System.out.printf("\tJob Size: %d | ", job.getJobSize());
    }
    public static  void displayRQ(){
        for(int i= readyQ.size(); i !=0; i--){
            Job job = (Job) readyQ.dequeue();
            jobDisplayFormat(job);
            readyQ.enqueue(job);
        }
    }
    public static void setReadyQ(Job job) {
            final MyQueueLinked greaterJobs = new MyQueueLinked();
            for(int i = readyQ.size(); i!=0; i--){
                Job currentJob = (Job) readyQ.dequeue();
                if(currentJob.compareTo(job) > 0) greaterJobs.enqueue(currentJob);
                else readyQ.enqueue(currentJob);
            }
            readyQ.enqueue(job);
            while(!greaterJobs.isEmpty()) readyQ.enqueue(greaterJobs.dequeue());
    }
    public static void main(String[] args){
        Job[] jobQueue = {
                new Job(1, 40, 1, 1),
                new Job(2, 10, 2, 2),
                new Job(3, 10, 3, 3),
                new Job(4, 20, 4, 4),
                new Job(5, 30, 5, 4),
        };
        System.out.println("In Queue Jobs: ");
        for(Job job: jobQueue) {
            jobDisplayFormat(job); 
            setReadyQ(job);
        }
        System.out.println("\nReady Queue: ");
        displayRQ();
    }
}
