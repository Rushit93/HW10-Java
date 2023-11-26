import java.util.ArrayList;

/*
Declare global variables of your name, Add all your group names in list, using
for each loop iterate and print ONLY your name.
 */
public class Question11 {
    static String myName = "Rushit";

    public static void main(String[] args) {
        ArrayList <String> name = new ArrayList<>();
        name.add("Rutvi");
        name.add("Kinnari");
        name.add("Hitesh");
        name.add("Alka");
        name.add("Akash");
        name.add(myName);

        for (String n : name) {
            if(n.equalsIgnoreCase("Rushit")){
                System.out.println("Name: " + n);
            }
        }
    }
}

