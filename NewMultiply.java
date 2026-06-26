public class NewMultiply
{
    public static void main(String[] args) 
    {
        System.out.println("0 through 10 multiplied by 2 and by 10\n");

        for (int i = 0; i <= 10; i++) 
        {
            System.out.println("Number: " + i);
            System.out.println("Multiplied by 2: " + (i * 2));
            System.out.println("Multiplied by 10: " + (i * 10));
        }
    }
}