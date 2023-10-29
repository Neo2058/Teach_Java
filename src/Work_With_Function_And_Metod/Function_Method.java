package Work_With_Function_And_Metod;

public class Function_Method {

    public static void the_counter()
    {
        System.out.println("I'm nothing to return");
    }
    public static void the_counter_two_parametrs(int a, int b)
    {
        int c = a + b;
        System.out.println("I'm folding two meanings: " + c);
    }

    public static void the_counter_two_backstape_parametrs_without(int a, int b, String c)
    {
        int sum = a * b;
        System.out.println(sum + " - This sum last calculations.\n" + c + " - That's your name?");
    }

    public static int the_counter_two_backstape_parametrs()
    {
        int a = 7;
        int b = 9;
        int c = a + b * b;
        System.out.println("I'm folding two meanings of which the second squared: " + c);
        return c;
    }

    public static int the_counter_two_backstape_parametrs_without(int a, int b)
    {
        int c = a + b * b;
        System.out.println("I'm folding two meanings of which the second squared: " + c);
        return c;
    }
}
