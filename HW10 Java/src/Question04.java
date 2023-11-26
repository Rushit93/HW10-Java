import java.util.ArrayList;
import java.util.Iterator;

/*
Write a Java program to iterate through all elements in an array list using
Iterator.
 */
public class Question04 {
    public static void main(String[] args) {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("White");
        colours.add("Blue");
        colours.add("Yellow");
        colours.add("Black");
        colours.add("Purple");
        colours.add("Orange");

        Iterator<String> colour = colours.iterator();
        while(colour.hasNext()){
            System.out.println(colour.next());

        }
    }
}
