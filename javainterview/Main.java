package javainterview;
import java.util.*;
class Score {
   private String country;
   private int score;
   public Score(String c, int s) {
       country = c;
       score = s;
   }
   public String getCountry() {
       return country;
   }
   public int getScore() {
       return score;
   }
}
public class Main {
   public static Map<String, Integer> countCenturiesPerCountry(ArrayList<Score> scores) {
       Map<String, Integer> centuriesMap = new HashMap<>();
       for (Score score : scores) {
           String country = score.getCountry();
           int currentScore = score.getScore();
           if (currentScore >= 100) {
               centuriesMap.put(country, centuriesMap.getOrDefault(country, 0) + 1);
           }
       }
       return centuriesMap;
   }
   public static int noCenturyCountryCount(ArrayList<Score> scores) {
       Map<String, Integer> centuriesMap = countCenturiesPerCountry(scores);
       int noCenturyCount = 0;
       for (Map.Entry<String, Integer> entry : centuriesMap.entrySet()) {
           if (entry.getValue() == 0) {
               noCenturyCount++;
           }
       }
       return noCenturyCount;
   }
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       ArrayList<Score> scores = readScores(scanner);
       int noCenturyCount = noCenturyCountryCount(scores);
       System.out.println(noCenturyCount);
   }
   public static ArrayList<Score> readScores(Scanner scanner) {
       ArrayList<Score> scores = new ArrayList<>();
       while (scanner.hasNextLine()) {
           String line = scanner.nextLine().trim();
           if (!line.isEmpty()) {
               String[] fields = line.split(":");
               Score score = new Score(fields[0].trim(), Integer.parseInt(fields[1].trim()));
               scores.add(score);
           }
       }
       return scores;
   }
}
