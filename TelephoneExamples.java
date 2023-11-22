import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import java.util.Iterator;

public class TelephoneExamples {
        public static void main(String[] args) {
                Person person1 = new Person("Michael", "Scott", new Address(new TelephoneNumber(93, "212789345"),
                                "Main Street", "13", "New York", "12-298", "United States"));
                Person person2 = new Person("Jim", "Halpert", new Address(new TelephoneNumber(81, "678460213"),
                                "Big", "43", "London", "45-876", "United Kingdom"));
                Person person3 = new Person("Oscar", "Martinez", new Address(new TelephoneNumber(23, "954023765"),
                                "Small", "12A", "Warsaw", "92-338", "Poland"));
                Person person4 = new Person("Pamela", "Beesly", new Address(new TelephoneNumber(23, "207518443"),
                                "Medium", "18C", "Dublin", "76-093", "Ireland"));
                Company comp1 = new Company("Amazon", new Address(new TelephoneNumber(55, "694628465"),
                                "Huge", "2", "Paris", "87-090", "France"));
                Company comp2 = new Company("Allegro", new Address(new TelephoneNumber(75, "812435768"),
                                "Enormous", "7B", "Madrid", "13-133", "Spain"));

                TreeMap<TelephoneNumber, TelephoneEntry> phoneBook = new TreeMap<TelephoneNumber, TelephoneEntry>();

                phoneBook.put(person1.getAddress().getTelephoneNumber(), person1);
                phoneBook.put(person2.getAddress().getTelephoneNumber(), person2);
                phoneBook.put(person3.getAddress().getTelephoneNumber(), person3);
                phoneBook.put(person4.getAddress().getTelephoneNumber(), person4);
                phoneBook.put(comp1.getAddress().getTelephoneNumber(), comp1);
                phoneBook.put(comp2.getAddress().getTelephoneNumber(), comp2);
                
                Set<Map.Entry<TelephoneNumber, TelephoneEntry>> entries = phoneBook.entrySet(); 
                Iterator<Map.Entry<TelephoneNumber, TelephoneEntry>> iterator = entries.iterator();
                Map.Entry<TelephoneNumber, TelephoneEntry> entry = null;

                while (iterator.hasNext()) {
                        entry = iterator.next();
                        System.out.println("Telephone numer: " + entry.getKey().getTelephoneNum() + " Description: "
                                        + entry.getValue().description());
                }
        }
}
