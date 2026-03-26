import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Person> people=new ArrayList<>();
        people.add(new Person( "Mike", "Tyson", LocalDate.of(1966, 5, 18)));
        people.add(new Person( "Quorthon", "Bathory", LocalDate.of(1963, 9, 11)));
        people.add(new Person( "Aaaa", "BB", LocalDate.of(2000, 4, 1)));
        System.out.println(people);
    }
}
