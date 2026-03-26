import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public class Person {
    private final String firstName;
    private final String lastName;
    private final LocalDate birthday;

    private final Set<Person> children = new HashSet<>();

    public Person(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }
    public boolean adopt(Person child){
        if (child == this) return false;
        return children.add(child);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday + '\'' +
                ", children=" + children +
                '}';
    }

    public Person getYoungestChild(){

    }
    /*public Person getYoungestChild(){
        if (this.children.isEmpty()){
            return null;
        }
        Iterator<Person> iter = this.children.iterator();
        Person now = iter.next();
        Person youngest = now;
        while (true) {
            if (youngest.birthday.compareTo(now.birthday)>0)
                youngest=now;
        }
        try {
            now = iter.next();
        } catch (NoSuchElementException e) {
            break;
        }
        return youngest;
    }
*/
}