  
// Main Class 
public class threadless 
{ 
    public static void main(String[] args) 
    { 
        long startTime = System.nanoTime();
        int n = 80; // Number of threads 
        for (int i=0; i<n; i++) 
        { 
            int primea = 179424691;
            int primeb = 217645199;
            float workprime = primea * primeb;
            double workprimeb = Math.sqrt(workprime);
            // Displaying the thread that is running 
            System.out.println ("primea " + primea + " prime b" + primeb); 
            System.out.println("multiplied " + 
                                workprime + " rooted: " + workprimeb);
            System.out.println("loop number "  + i);
        }
        long endTime = System.nanoTime();

        long duration = (endTime - startTime) / 1000000;  //divide by 1000000 to get milliseconds. 
        System.out.println("time to do all this " + duration + " milliseconds");
    } 
} 