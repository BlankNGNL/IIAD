package Week_4_Calculator;
public class VbCalc
{
    public static void main( String args[] )
    {
//        String invoer = "2 2 5 5 + * +";
        String invoer = "10 12 13  + *";
        Calculator pf = new Calculator(invoer);
        System.out.println("uitvoer is : " + pf.getResultaat());
    }
}

