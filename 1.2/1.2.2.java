class Telephone
{
    private static String target;
    
    private String myNumber;

    // constructor to initalize non-static property
    public Telephone(String aNumber)
    {
        myNumber = aNumber;
    }

    public void dial()
    {
        // student code here
        System.out.println(myNumber + " calling " + Telephone.target);
    }
    
    // student code here

} 
                