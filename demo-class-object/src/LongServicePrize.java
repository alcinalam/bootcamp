import java.time.Year;

public class LongServicePrize {
  // Attributes
  private String name;
  private int yearOnboard;
  // private int thisYear;

  // setter and getter
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setYearOnboard(int yearOnboard) {
    this.yearOnboard = yearOnboard;
  }

  public int getYearOnboard() {
    return this.yearOnboard;
  }

  // public void setThisYear(int thisYear) {
  //   this.thisYear = thisYear;
  // }

  public String yearAward() {
    return "YearAward : ".concat(String.valueOf(Year.now().getValue() - this.yearOnboard));
  }

  // public boolean tenYearAward() {
  //   return Year.now().getValue() - this.yearOnboard == 10;
  // }

  public String toString() {
    return "LongServicePrize("//
        + "name=" + this.name //
        + ", yearOnboard=" + this.yearOnboard //
        + ")";
  }

  public static void main(String[] args) {
    LongServicePrize prize = new LongServicePrize();
    prize.setName("Carmen Chan");
    // prize.setThisYear(2024);
    prize.setYearOnboard(1999);
    System.out.println(prize.toString());
    System.out.println(prize.yearAward());
    // System.out.println("Ten year Award? " + prize.tenYearAward());

    LongServicePrize prize1 = new LongServicePrize();
    prize1.setName("Mandy Lee");
    //prize1.setThisYear(2024);
    prize1.setYearOnboard(2019);
    System.out.println(prize1.toString());
    System.out.println(prize1.yearAward());
    // System.out.println("Ten year Award? " + prize1.tenYearAward());

    LongServicePrize prize2 = new LongServicePrize();
    prize2.setName("Martin cheng");
    // prize2.setThisYear(2024);
    prize2.setYearOnboard(2014);
    System.out.println(prize2.toString());
    System.out.println(prize2.yearAward());
    // System.out.println("Ten year Award? " + prize2.tenYearAward());

  }

}


