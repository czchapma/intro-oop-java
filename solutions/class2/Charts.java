import java.util.Scanner;

public class Charts {
    public static void main(String[] args) {
        String[] topMovies = {"Black Panther", "Tomb Raider", "I Can Only Imagine", "A Wrinkle in Time",
        "Love, Simon", "Game Night", "Peter Rabbit", "The Strangers: Prey at Night", "Red Sparrow", "Death Wish"};
        double[] weekendAmount = {26.7, 23.6, 17.1, 16.3, 11.8, 5.6, 5.2, 4.7, 4.5, 3.4};

        System.out.println("Box office for the weekend of March 16 - 18");
        for (int i = 0; i < topMovies.length; i++) {
            System.out.println("#" + (i + 1) + " " + topMovies[i].toUpperCase() + ": " + weekendAmount[i] + "M");
        }

        System.out.println("Amazon Charts Week of March 11");
        String[] bookTitles = {"Ready Player One", "Oathbringer", "The Great Alone", "A Wrinkle in Time",
        "Harry Potter and the Order of the Phoenix", "Harry Potter and the Sorcerer's Stone", "Origin",
        "Harry Potter and the Goblet of Fire", "Red Sparrow", "Little Fires Everywhere"};
        String[] authors = {"ERNEST CLINE", "BRANDON SANDERSON", "KRISTIN HANNAH", "MADELEINE L'ENGLE",
        "J.K. ROWLING", "J.K. ROWLING", "DAN BROWN", "J.K. ROWLING", "JASON MATTHEWS", "CELESTE NG"};

        int harryPotterCount = 0;
        int shortestLength = 10000;
        int longestLength = 0;
        String longestBook = "";
        String shortestBook = "";
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.println("#" + (i+1) + " " + bookTitles[i] + " by " + authors[i]);
            if (bookTitles[i].contains("Harry Potter")) {
                harryPotterCount++;
            }
            int length = bookTitles[i].length();
            if (length < shortestLength) {
                shortestLength = length;
                shortestBook = bookTitles[i];
            }
            if (length > longestLength) {
                longestLength = length;
                longestBook = bookTitles[i];
            }
        }
        System.out.println("There were " + harryPotterCount + " Harry Potter books ranked this week");
        System.out.println("Longest title: " + longestBook);
        System.out.println("Shortest title: " + shortestBook);

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String input = sc.nextLine();
            boolean found = false;
            for (int i = 0; i < bookTitles.length; i++) {
                if (bookTitles[i].contains(input)) {
                    System.out.println(bookTitles[i] + " is ranked " + (i+1) + " this week");
                    found = true;
                }
            }
            if (!found) {
                System.out.println(input + " was not ranked this week");
            }
        }

    }
}
