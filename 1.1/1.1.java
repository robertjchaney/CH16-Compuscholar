import java.util.*;
class Telephone
{
    private static String ringtone = "Ring Ring";
    
    private String myNumber;
    
    // no changes should be made to the main() method
    public static void main(String[] args)
    {
       Telephone t1 = new Telephone("555-1212");
       Telephone t2 = new Telephone("555-3434");

       t1.dial("555-8888");
       t2.dial("555-9999");

       Scanner input = new Scanner(System.in);
       System.out.print("What is your new ringtone? ");
       String newRing = input.nextLine();
       input.close();

       // student code here - update the static ringtone
       Telephone.setRingtone(newRing);

       t1.dial("555-8888");
       t2.dial("555-9999");
    }
    
    // constructor to initalize non-static
    public Telephone(String aNumber)
    {
        myNumber = aNumber;
    }

    public void dial(String target)
    {
        System.out.println(myNumber + " calling " + target + "..." + ringtone);
        
    }
        // setter for updating ringtone
    public static void setRingtone(String newRingtone)
    {
        ringtone = newRingtone;
    }
} 
                