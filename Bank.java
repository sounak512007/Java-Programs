// Program Using Interface Bank

interface Bank 
{
    void rate_of_interest();
}

class SBI implements Bank 
{

    String name;
    float rate;

    SBI(String n, float r) 
    {
        name = n;
        rate = r;
    }

    public void rate_of_interest() 
    {
        System.out.println(name + " Interest Rate = " + rate + "%");
    }
}

class PNB implements Bank 
{

    String name;
    float rate;

    PNB(String n, float r) 
    {
        name = n;
        rate = r;
    }

    public void rate_of_interest() 
    {
        System.out.println(name + " Interest Rate = " + rate + "%");
    }
}

class BankDemo 
{
    public static void main(String[] args) 
    {

        SBI s = new SBI("SBI", 6.5f);
        PNB p = new PNB("PNB", 7.0f);

        s.rate_of_interest();
        p.rate_of_interest();
    }
}