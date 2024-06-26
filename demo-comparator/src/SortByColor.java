import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class SortByColor implements Comparator<Ball> {
  
  @Override
  public int compare (Ball b1, Ball b2) {
    return b1.getColor().name().charAt(0) > b2.getColor().name().charAt(0) ? -1 : 1;
  }


  public static void main(String[] args) {
    List<Ball> balls = new LinkedList<>();
    balls.add(new Ball(Color.BLACK, 10.3));
    balls.add(new Ball(Color.YELLOW, 2.0d));
    balls.add (new Ball(Color.YELLOW,9d));
    balls.add (new Ball(Color.RED,8.4d));

    int random = new Random().nextInt(2); // 0 or 1
    Comparator<Ball> formula = null; // List
    if (random == 0) {
      formula = new SortByColor();
    } else if (random == 1) {
      formula = new SortBySize();
    }

    Collections.sort(balls, formula); // this. & a list
    System.out.println(balls);
    
  }
}
