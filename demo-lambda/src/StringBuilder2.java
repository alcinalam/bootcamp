import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface StringBuilder2 {
  String concat (List<String> strings);

  

  public static void main(String[] args) {
    StringBuilder2 sb2 = (strings) -> { //(parameter)
      StringBuilder sb = new StringBuilder(); // method
      for (String s : strings) {
        sb.append(s);
      }
      return sb.toString();
    };

    String result = sb2.concat(new ArrayList<>(List.of("xxx","yyy","zzz")));
    System.out.println(result); // xxxyyyzzz
  }


}
