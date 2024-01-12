package heartrates;

public class Date {
    
    //atributes 

    private int year, month, day;

    // get and set

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public int getYear()
    {
        return this.year;
    }

    public int getMonth()
    {
        return this.month;
    }

    public int getDay()
    {
        return this.day;
    }

    //constructor

    public Date(int month, int day, int year)
    {
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
        System.out.format("Date: %i/%i/%i", this.getMonth(), this.getDay(), this.getYear());
    }

}
