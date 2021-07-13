import java.util.Scanner;
public class JobSchedulerMain {
  
   static int [][]time ;
    
   public static void main(String []args){ 
	   
   System.out.println("Given array consists of arrival time in column one and burst time is column2 respectively");
   System.out.println("Enter no. of processes");
   
   Scanner sc=new Scanner(System.in);
   int process=sc.nextInt();
   
   time=new int[process][2];
   
   System.out.println("Enter arrival time and burst time of each process respectively");
   
   for(int i=0;i<process;i++)
   {
	   for(int j=0;j<2;j++)
	   {
		   time[i][j]=sc.nextInt();
	   }
   }
    JobScheduler.completion_time(time);
    JobScheduler.waiting_time(time);
    JobScheduler.turnaround_time(time);
    JobScheduler.avg_waiting_time(time);
    JobScheduler.max_waiting_time(time);
   } 
}
