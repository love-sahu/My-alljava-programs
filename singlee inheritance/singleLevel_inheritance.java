class country {
  private String countryName;
  private String language1;
  private long population;
  private String countryCode;
  private String primeMinister;
  private String currency;
  private double area;
  private int state;
  private int unionTer;

  public country(String countryName, String language1, long population, String countruCode, String primeMinister,
      String curremcy, double area, int state, int unionTer) {
    super();
    this.countryName = countryName;
    this.language1 = language1;
    this.countryCode = countruCode;
    this.population = population;
    this.primeMinister = primeMinister;
    this.currency = curremcy;
    this.area = area;
    this.state = state;
    this.unionTer = unionTer;
  }

  public void displaycountry() {
    System.out
        .println(" countryName :" + countryName + " countruLanguage :" + language1 + " countryCode :" + countryCode
            + " primeMinister :" + primeMinister
            + " currency :" + currency + " area :" + area + " state :" + state + " unionTeratory :" + unionTer);
  }
}

class State extends country {
  private String stateName;
  private String language;
  private String capitals;
  private String cm;
  private long populations;
  private double area1;
  private int districs;

  public State(String countryName, String language1, long population, String countruCode, String primeMinister,
      String curremcy, double area1, int state, int unionTer,

      String stateName, String language, String capitals,
      String cm, long populations, double area, int districs) {
    super(countryName, language1, population, countruCode, primeMinister, curremcy, area, state, unionTer);
    this.stateName = stateName;
    this.language = language;
    this.capitals = capitals;
    this.cm = cm;
    this.populations = populations;
    this.area1 = area;
    this.districs = districs;
  }

  public void displayState() {
    System.out.println(" statenmae :" + stateName + " stateLanguage :" + language + " capital :" + capitals + "cm" + cm
        + " pupulation :" + populations + " area:" + area1 + " districts :" + districs);
  }
}

public class singleLevel_inheritance {
  public static void main(String[] args) {
    State obj = new State("india", "hindi+Eng+Marathi", 14286276631l, "+91", "narendraModi", "Rupees", 3287263, 28, 7,
        "Maharashtra", "Marathi", "Mombai", "phadnavis", 112374331, 307713, 36);
    obj.displayState();
    obj.displaycountry();
  }
}