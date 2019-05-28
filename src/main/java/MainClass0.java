import java.util.ArrayList;

/**
 * Differences between Arrays vs Collections
 * Not resizable | Dynamically resizable
 * Stores Primitives and Objects | Stores only Objects
 * Homogeneous | Can be Heterogenous
 * Special notation to access elements [] | Methods to access elements
 * Special syntax for initialization {} | No special initialization syntax
 */

public class MainClass0 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();

        list.add("Hello");
        list.add("World");
        list.add("Welcome");
        list.add("To");
        list.add("Sunday");
        list.add("To");

        list.remove("To");

        System.out.println(list);


    }
}
