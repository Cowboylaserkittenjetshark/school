import java.util.ArrayList;
import java.util.Comparator;

public class MailingABox {
  public static void main(String[] args) {
    ArrayList<RectPrism> rectPrismList = new ArrayList<RectPrism>();
    // Populate rectPrismList with RectPrism objects
    for (int index = 0; index < 10; index++) {
      rectPrismList.add(new RectPrism((Math.random() * 10 + 1), (Math.random() * 10 + 1), (Math.random() * 10 + 1)));
    }
    // Print rectPrismList before sorting
    System.out.println(rectPrismList.toString() + "\n");
    // Sort rectPrismList
    rectPrismList.sort(Comparator.naturalOrder());
    // Print rectPrismList after sorting
    System.out.println("Sorting . . .\n");
    System.out.println(rectPrismList.toString());
  }
}
