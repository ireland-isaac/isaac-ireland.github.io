  
// Main Class 
public class threadless 
{ 
    public static void main(String[] args) 
    { 
        // I got assistance doing the timing from https://stackoverflow.com/questions/180158/how-do-i-time-a-methods-execution-in-java
        long startTime = System.nanoTime();
        int n = 80; // Number of threads 
        for (int i=0; i<n; i++) 
        { 
            // I had larger prime numbers but work prime turned negative due to overflow issues
            int primea = 179424691;
            int primeb = 217645199;
            float workprime = primea * primeb;
            // if workprime is negative than workprimeb will be the NaN (root of a negative number and all)
            double workprimeb = Math.sqrt(workprime);
            // Displaying the thread that is running 
            System.out.println("multiplied " + 
                                workprime + " rooted: " + workprimeb);
            System.out.println("loop number "  + i);
        }
        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000000;  //divide by 1000000 to get milliseconds. 
        System.out.println("time to do all this " + duration + " milliseconds");
    } 
} 