import java.util.HashMap;
/*
Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
 */
public class Question07 {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap();
        people.put("Rushit", 1);
        people.put("Kinnari", 2);
        people.put("Hitesh", 3);
        people.put("Akash", 4);
        people.put("Rutvi", 5);
        people.put("Alka", 6);

        //Collections.checkedSortedMap(String, Integer);

//        for(Object person : people.entrySet()){
//            System.out.println(person);
//        }
        for (Integer person : people.values()){
            System.out.println(person);
        }
    }
}
