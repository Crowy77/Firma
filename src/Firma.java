import java.text.NumberFormat;

public class Firma {

   // private static Image icon;
    private String name;
    private double umsatz;


    // Konstruktor
    public Firma(String name, double ums){
        umsatz = ums;
        this.name = name;

    }

    //Klassenmethoden: auf den Typ "Firma" bezogen
  //  public static Icon getIcon() { return icon;};

    //auf die Instanz bezogen
    public String getName() {return name;}
    public double getUmsatz() {return umsatz;}

    public String toString(){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        return name + "(" + nf.format(umsatz) + ")";
    }
}
