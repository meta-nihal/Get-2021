import java.util.Scanner;

public class JobScheduler{

	  
	
	   static int []comp_time=new int[4];
	    static int []wait_time=new int[4];
	    static int []turn_time=new int[4];
	    static int []avg_wait_time=new int[4];
    
	    /*
	     * this method calculates the completion time of each process
	     * @param time array 
	     */
    public static void completion_time(int time[][])   
    {
        comp_time[0]=time[0][1];
        System.out.println("Completion time of process 1 is "+comp_time[0]);
    for(int i=1;i<time.length;i++)
     {
       if(time[i][0]<=comp_time[i-1])  
        comp_time[i]=time[i][1]+time[i-1][1];
       else 
        comp_time[i]=time[i][0]+time[i][1];
     
     System.out.println("Completion time of process "+(i+1)+" is "+comp_time[i]);
     }
    }
     
    /*
     * this method calculates the waiting time of each process
     * @param time array 
     */
    public static void waiting_time(int time[][])
    {
       wait_time[0]=0;
       System.out.println("Waiting time of process 1 is "+wait_time[0]);
       for(int i=1;i<time.length;i++)
       {
           if(time[i][0]<comp_time[i-1])
           {
               wait_time[i]=comp_time[i-1]-time[i][0];
           }
           else
               wait_time[i]=0;
       
       System.out.println("Waiting time of process "+(i+1)+" is "+wait_time[i]);
       }
    }
     
    /*
     * this method calculates the turn around time of each process
     * @param time array 
     */
    public static void turnaround_time(int time[][])
    {
        for(int i=0;i<time.length;i++)
        {
            turn_time[i]=comp_time[i]-time[i][0];
            System.out.println("Turn Around time of process "+(i+1)+" is " +turn_time[i]);
        }
    }
    
    /*
     * this method calculates the average waiting time of processes
     * @param time array 
     */
    public static void avg_waiting_time(int time[][])
    {
        float sum=0;
        for(int i=0;i<time.length;i++)
        {
            sum+=wait_time[i];
        }
        System.out.println("Average waiting time is "+sum/time.length);
    }
    
    /*
     * this method calculates the maximum waiting time among the processes
     * @param time array 
     */
    public static void max_waiting_time(int time[][])
    {
        int max=0;
        for(int i=0;i<time.length;i++)
        {
            if(max<wait_time[i])
              max=wait_time[i];
        }
        System.out.println("Maximum waiting time is " +max);
    }
    
    
    
}
