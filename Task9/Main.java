package Task9;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args)
    {

        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");

        Random random = new Random();

        list.forEach((l) ->
        {
            System.out.println(l + "^ " + random.nextInt(100));
        });

        System.out.println("----------------------------");

        Stream stream = list.stream();

        stream.forEach(x -> System.out.println(x + ": " + random.nextInt(100)));


        // --------------------------------------------------------------------------------

        ArrayList<BiblioSim> biblsArray = new ArrayList<BiblioSim>();
        biblsArray.add(new BiblioSim("Aride and Prejudice", "Jane Austen", 1878, "34r213r23" ));
        biblsArray.add(new BiblioSim("Warhammer40kBible", "God Emperor of Humankind", 40000, "Unknow" ));
        biblsArray.add(new BiblioSim("Ahe Great Gatsby", "F. Scott Fitzgerald", 1899, "7j43" ));
        biblsArray.add(new BiblioSim("Jane Eyre", "Charlotte Brontë", 1850, "k755e" ));
        biblsArray.add(new BiblioSim("To Kill a Mockingbird", " Harper Lee", 1960, "s53y3r23" ));
        biblsArray.add(new BiblioSim("AA_Test book from modern times_with_first_a", "Naruto Putin1", 2021, "n64h3" ));
        biblsArray.add(new BiblioSim("AB_Test book from modern times", "Naruto 2", 2021, "n6423" ));
        biblsArray.add(new BiblioSim("CC Kill a Mockingbird", " Harper Lee", 1960, "s53y3r23" ));
        biblsArray.add(new BiblioSim("AD_Test book from modern times", "Naruto Putin33", 2021, "n63313" ));

        ArrayList<BiblioSim> biblsArray_A_books = new ArrayList<BiblioSim>();

        Consumer<BiblioSim> getABooks = X ->
        {
            if(X.getBookName().indexOf('A') == 0)
            {
                biblsArray_A_books.add(X);
                System.out.println(X.getBookName());
            }
        };

        biblsArray.forEach(getABooks);

        System.out.println();

        biblsArray_A_books.stream().filter(x1 -> x1.getBookYear()  < 1980).forEach(x2 -> System.out.println(x2.getBookName()));
    }
}

