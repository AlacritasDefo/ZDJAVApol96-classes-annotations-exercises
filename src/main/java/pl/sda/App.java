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

        System.out.println(Color.WHITE.isPretty());

        Pair<String, Person> pair1 = new Pair<>("Value1", new Person("Adam", "Adamski"));
        Pair<Color, Integer> pair2 = new Pair<>(Color.WHITE, 20);

        System.out.println(pair1);
        System.out.println(pair2);
    }
}
