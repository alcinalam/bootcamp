package stringbuilder;

public class DemoSB {
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "def";

    String result = s1 + s2;
    String result2 = s1.concat(s2); // concat() -> return new String, need a object reference to pick it up
    System.out.println("result=" + result2); // result=abcdef
    System.out.println("s1=" + s1); // s1=abc
    System.out.println("s2=" + s2); // s2=def

    StringBuilder sb1 = new StringBuilder(); // ""
    System.out.println(sb1.toString()); // ""

    StringBuilder sb2 = new StringBuilder("hello");
    System.out.println(sb2.toString()); // "hello"

    StringBuilder sb3 = sb2.append("world"); 
    System.out.println ("sb2=" + sb2.toString()); // helloworld
    System.out.println ("sb3=" + sb3.toString()); // helloworld

    sb2.append("!!!"); // no need object reference,自己就咁加咗落去.
    System.out.println(sb2.toString());

    String[] strings = new String [] {"aaa", "bbb", "ccc"};
    StringBuilder sb4 = new StringBuilder ();
    for (int i = 0 ; i < strings.length; i++) { 
      sb4.append(strings[i]); 
    }
    for (String s: strings)
    sb4.append(s);

    System.out.println(sb4.toString()); // aaabbbccc

    // insert()
    sb4.insert(6, "ddd");
    System.out.println(sb4.toString()); // aaabbbdddccc
    sb4.reverse();
    System.out.println(sb4.toString()); // cccbbbaaacccdddbbbaaa

    sb4.insert(8,"x").append("zzz").reverse();
    System.out.println(sb4.toString());

    sb4.deleteCharAt(3);
    System.out.println(sb4);
    sb4.setCharAt(3,'c');
    System.out.println(sb4);
    sb4.replace(0,3, "!!");
    System.out.println(sb4);

    String result10 = sb4.toString().replace("b","y"); //like copy to String and replace
    System.out.println(result10); // replaced
    System.out.println(sb4.toString()); // no change

    System.out.println(sb4.charAt(0));
    System.out.println(sb4.isEmpty());
    System.out.println(sb4.substring(2,4));

    StringBuilder sb5 = new StringBuilder("mmm");
    StringBuilder sb6 = new StringBuilder("mmm");
    String s = "mmm";
    if (sb5.compareTo(sb6) == 0){
      System.out.println("they are equal");
    }

    if (sb5.toString().equals(s)){ // compare String to StringBuilder, needa change toString
      }

      System.out.println(sb5.length());
      sb5.setLength(100);
      System.out.println(sb5.toString());
      sb5.append("zzz");
      System.out.println(sb5.toString());




  }
}
