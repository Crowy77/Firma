public class OOP_Firma_Array5 {

    public static void main(String[] args) {
        Firma[] dax = {new Firma("Audi", 60000),
                new Firma("Daewoo", 45000),
                new Firma("BMW", 65000),
                new Firma("Mercedes", 75000),
                new Firma("Toyota", 50000)
        };

        Firma bester = dax[0];
        for (Firma f: dax) {
            if (f.getUmsatz() > bester.getUmsatz()) bester = f;
        }
        System.out.println(bester);

    }
}