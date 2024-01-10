package heartrates;

public class HeartRate {
    
    //atributes

    private String firstname;
    private String lastname;
    private int bornDay;
    private int bornMonth;
    private int bornYear;


    //get and set

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public void setBornDay(int bornDay)
    {
        this.bornDay = bornDay;
    }

    public void setBornMonth(int bornMonth)
    {
        this.bornMonth = bornMonth;
    }   

    public void setBornYear(int bornYear)
    {
        this.bornYear = bornYear;
    }

    public String getFirstname()
    {
        return this.firstname;
    }

    public String getLastname()
    {
        return this.lastname;
    }

    public int getBornDay()
    {
        return this.bornDay;
    }

    public int getBornMonth()
    {
        return this.bornMonth;
    }

    public int getBornYear()
    {
        return this.bornYear;
    }

    //constructor

    public HeartRate(String firstname, String lastname, int bornDay, int bornMonth, int bornYear)
    {
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setBornDay(bornDay);
        this.setBornMonth(bornMonth);
        this.setBornYear(bornYear);
    }

    //methods 

    private int age()
    {
        int age = 2024 - this.getBornYear();
        if (this.bornDay >= 9 && this.bornMonth >= 1)
        {
            age++;
        }

        return age;
    }

    public void maxHeartRate()
    {
        System.out.println("Max heart rate: " + (220 - age()));
    }

    public void targetHeartRate()
    {
        System.out.println("Target heart rate: " + ((220 - age())/2) + "-" + (int) ((220 - age()) * 0.85));
    }
}
