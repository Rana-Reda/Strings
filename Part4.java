
import edu.duke.*;
import java.io.File;

public class Part4 {
    
    public void printYouTubeLinks() {
        URLResource ur = new URLResource("https://www.dukelearntoprogram.com/course2/data/manylinks.html");
        // System.out.println(ur);
        for (String word : ur.words()) {
            // System.out.println(word);
            String lowerCaseWord = word.toLowerCase();
            // Check to see if “youtube.com” is in the current word
            // Since “youtube.com” can be in different form such as “YouTube.com” or “YOUTUBE.com”,
            // We need to make a lowercase version of the origional word and then, just check to see if "youtube.com" is in it,
            // instead of trying to handle all different form of "youtube.com" there can be
            int ytLinkIndex = lowerCaseWord.indexOf("youtube.com");
            if (ytLinkIndex != -1) {
                // If yes, identify:
                // Beginning: Opening quotation mark + 1
                int linkStart = word.indexOf('"') + 1;
                // Ending: Closing quotation mark
                int linkEnd = word.indexOf('"', linkStart);
                // The complete YouTube Link
                String ytLink = word.substring(linkStart, linkEnd);
                System.out.println(ytLink);
            }
        }
    }
    
    public static void main (String[] args) {
        Part4 part4 = new Part4();
        part4.printYouTubeLinks();
    }
}
