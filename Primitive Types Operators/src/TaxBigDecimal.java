import java.math.BigDecimal;
public class TaxBigDecimal {
    public static void main(String[] args){

                BigDecimal netPrice = new BigDecimal("9.99");
                BigDecimal vat = new BigDecimal("1.23");

                BigDecimal grossPrice = netPrice.multiply(vat);
                BigDecimal totalGross = grossPrice.multiply(new BigDecimal("10000"));
                BigDecimal totalNet = totalGross.divide(vat);

                System.out.println("Using BigDecimal:");
                System.out.println("Gross price: " + grossPrice);
                System.out.println("Total gross: " + totalGross);
                System.out.println("Total net: " + totalNet);

                //Conclusion
        System.out.println("\n=== CONCLUSIONS ===");
        System.out.println("1. Double produces rounding errors because it uses binary floating-point");
        System.out.println("2. These errors get multiplied with larger quantities");
        System.out.println("3. For financial calculations, ALWAYS use BigDecimal");
        System.out.println("4. Always create BigDecimal from String, not double literals");
    }
}
