import java.util.*;

public class Mianhe {
    public static void main(String[] args) {
        Queue<Integer> Entry = new PriorityQueue<>();
        Queue<Integer> Bounced = new PriorityQueue<>();

        Scanner in = new Scanner(System.in);
        
        System.out.println("Can only enter human-being with age that in range 0 to 1000");
        System.out.print("Guest Checking (space-separated): ");
        String[] inputan = in.nextLine().trim().split("\\s+");

        for (String input : inputan) {
            int sample = Integer.parseInt(input);
            Bounced.add(sample);
            if (sample > 27 && sample <= 118){
                Entry.add(sample);
                Bounced.remove(sample);
            }
        }
        System.out.println("Entry(ies)  : " + Entry );
        System.out.println("Bounced     : " + Bounced );
        in.close();
    }
}