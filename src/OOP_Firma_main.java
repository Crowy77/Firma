public class OOP_Firma_main {

    public static void main(String[] args){
        Firma test = new Firma("ABC GmbH", 35000);
        Firma test2 = new Firma("LoanShark AG", 150000);

        String x = test.getName();
        double y = test2.getUmsatz();
        System.out.println(x);
        System.out.println(test2.getName() +" "+ y);


    }
}
