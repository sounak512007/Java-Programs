// Program to Print Welcome Message Using Command Line Arguments

class WelcomeStudent 
{
    public static void main(String[] args)
    {

        String name = args[0];
        String surname = args[1];

        System.out.println("Welcome " + name + " " + surname + "!");
    }
}