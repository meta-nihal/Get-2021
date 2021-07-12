import java.util.Scanner;

public class JobScheduler{

	
    static int [][]time ;
    
    static int []comp_time=new int[4];
    static int []wait_time=new int[4];
    static int []turn_time=new int[4];
    static int []avg_wait_time=new int[4];
    

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
    completion_time();
    waiting_time();
    turnaround_time();
    avg_waiting_time();
    max_waiting_time();
   } 
                                                //method to calculate completion time
    public static void completion_time()   
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
                                                //method to calculate waiting time
    public static void waiting_time()
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
                                                     //method to calculate turnaround time
    public static void turnaround_time()
    {
        for(int i=0;i<time.length;i++)
        {
            turn_time[i]=comp_time[i]-time[i][0];
            System.out.println("Turn Around time of process "+(i+1)+" is " +turn_time[i]);
        }
    }
                                                    //method to calculate average waiting time
    public static void avg_waiting_time()
    {
        float sum=0;
        for(int i=0;i<time.length;i++)
        {
            sum+=wait_time[i];
        }
        System.out.println("Average waiting time is "+sum/time.length);
    }
                                                    //method to calcualate maximum waiting time
    public static void max_waiting_time()
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
