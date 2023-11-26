import java.util.ArrayList;

/*
Write program and add all group members names in to array and iterates
through for each loop and print your name.
 */
public class Question10 {
    public static void main(String[] args) {
        ArrayList<String> groupMembers = new ArrayList<>();
        groupMembers.add("Rushit");
        groupMembers.add("Rutvi");
        groupMembers.add("kinnari");
        groupMembers.add("Hitesh");
        groupMembers.add("Alka");
        groupMembers.add("Akash");

        for (String name : groupMembers) {
            if(name.equalsIgnoreCase("Rushit")){
                System.out.println("Name: " + name);

            }
        }
    }
}

