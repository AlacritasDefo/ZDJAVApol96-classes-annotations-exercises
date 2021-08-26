package pl.sda;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee employee1 = new Employee("Jarosław", "Tusk","Spedycja");
        Employee employee2 = new Employee("Miłosz", "Łada", "Magazyn");

        System.out.println(employee1);
        System.out.println(employee2);


        System.out.println(Color.BLACK);

    }
}
