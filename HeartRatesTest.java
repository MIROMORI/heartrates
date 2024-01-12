package heartrates;

public class HeartRatesTest 
{
    public static void main(String[] args)
    {
        Date dtest = new Date(2, 3, 2003);
        HeartRate h = new HeartRate("Jorge", "Amado", 1, 1, 2000);
        
        h.maxHeartRate();
        h.targetHeartRate();
        
    }  
}
