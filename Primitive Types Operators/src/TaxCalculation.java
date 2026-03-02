public class TaxCalculation{
    public static void main(String[] args){

        //import java.math.BigDecimal;
        //Using double
        double netPrice = 9.99;
        double vatRate = 0.23;
        int quantity = 10000;

        //Gross Value
        double grossPrice = netPrice *(1 + vatRate);
        System.out.println("Net price: " + " $ " + "netPrice" );
        System.out.println("Gross price (with VAT):  " + " $ " + " grossPrice" );

        //Calculate total net for 10000 pcs
        double totalGrossDouble = grossPrice * quantity;
        System.out.println("\nTotal gross for " + quantity + " items (using double): " +
               "$" + totalGrossDouble );
    }
}
