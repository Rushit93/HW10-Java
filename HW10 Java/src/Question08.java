import java.util.LinkedList;
import java.util.Scanner;

/*
Write the program that tell you which line pass through particular stations.
Just use Zone 1 stations name. (Challenge)
 */
public class Question08 {
    public static void main(String[] args) {
        Question08 question08 = new Question08();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line name: ");
        String tube = scanner.next();
        LinkedList<String> Central = new LinkedList();
        Central.add("Liverpool Street");
        Central.add("Bank");
        Central.add("St Pauls");
        Central.add("Chancery Lane");
        Central.add("Holborn");
        Central.add("Tottenham Court Road");
        Central.add("Bond Street");
        Central.add("Holland Park");

        LinkedList<String> Victoria = new LinkedList();
        Victoria.add("Pimlico");
        Victoria.add("Warren Street");
        Victoria.add("Victoria");
        Victoria.add("Kings Cross");

        LinkedList<String> Northern = new LinkedList();
        Northern.add("King's Cross");
        Northern.add("Moorgate");
        Northern.add("Bank");
        Northern.add("Euston");
        Northern.add("Tottenham Court Road");
        Northern.add("Goodge Street");
        Northern.add("Angel");
        Northern.add("Charing Cross");
        Northern.add("Borough");
        Northern.add("Waterloo");



        while (true) {
            if (tube.equalsIgnoreCase("Central")) {
                System.out.println("Stations of Central Line in Zone 1 are: ");
                System.out.println(Central);
            }
            else if (tube.equalsIgnoreCase("Victoria")) {
                System.out.println("Stations of Victoria Line in Zone 1 are: ");
                System.out.println(Victoria);
            } else if (tube.equalsIgnoreCase("Norther")){
                System.out.println("Stations of Northern Line in Zone 1 are: ");
                System.out.println(Northern);
            }
            System.exit(0);
        }
    }
}
/*
Chancery Lane: Central
Temple: District, Circle
Old Street: Northern Line
Barbican: Hammersmith and City, Circle, Metropolitan
Green Park: Jubilee, Piccadilly, Victoria
Paddington: Circle, District, Hammersmith and City, Bakerloo, Elizabeth
St. John's Wood: Jubilee

Elizabeth: Liverpool Street, Farringdon, Tottenham Court Road, Bond Street, Paddington
Overground: Liverpool Street, Shoreditch High Street, Euston
Piccadilly: King's Cross, Russell Square, Holborn, Covent Garden, Leicester Square,
Piccadilly Circus, Green Park, Hyde Park Corner, Knightsbridge, South Kensington, Gloucester Road
 */
