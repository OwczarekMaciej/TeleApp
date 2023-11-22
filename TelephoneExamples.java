import java.util.Map;
import java.util.TreeMap;

import java.util.Iterator;

public class TelephoneExamples {
        public static void main(String[] args) {
                Person person1 = new Person("Michael", "Scott", new Address(new TelephoneNumber(93, "212789345"),
                                "13 Main Street", "New York", "12-298"));
                Person person2 = new Person("Jim", "Halpert", new Address(new TelephoneNumber(81, "678460213"),
                                "Big 43", "London", "45-876"));
                Person person3 = new Person("Oscar", "Martinez", new Address(new TelephoneNumber(23, "954023765"),
                                "Small 65", "Warsaw", "92-338"));
                Person person4 = new Person("Pamela", "Beesly", new Address(new TelephoneNumber(23, "207518443"),
                                "Medium 55", "Dublin", "76-093"));
                Company comp1 = new Company("Amazon", new Address(new TelephoneNumber(55, "694628465"),
                                "Huge 98", "Paris", "87-090"));
                Company comp2 = new Company("Allegro", new Address(new TelephoneNumber(75, "812435768"),
                                "Enormous 44", "Madrid", "13-133"));

                TreeMap<TelephoneNumber, TelephoneEntry> phoneBook = new TreeMap<TelephoneNumber, TelephoneEntry>();

                phoneBook.put(person1.getAddress().getTelephoneNumber(), person1);
                phoneBook.put(person2.getAddress().getTelephoneNumber(), person2);
                phoneBook.put(person3.getAddress().getTelephoneNumber(), person3);
                phoneBook.put(person4.getAddress().getTelephoneNumber(), person4);
                phoneBook.put(comp1.getAddress().getTelephoneNumber(), comp1);
                phoneBook.put(comp2.getAddress().getTelephoneNumber(), comp2);

                Iterator<Map.Entry<TelephoneNumber, TelephoneEntry>> iterator = phoneBook.entrySet().iterator();
                Map.Entry<TelephoneNumber, TelephoneEntry> entry = null;

                while (iterator.hasNext()) {
                        entry = iterator.next();
                        System.out.println("Telephone numer: " + entry.getKey().getTelephoneNum() + " Name, address: "
                                        + entry.getValue().description());
                }
        }
}
