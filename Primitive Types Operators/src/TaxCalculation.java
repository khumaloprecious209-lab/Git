import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaxCalculation {
    public static void main(String[] args) {
        System.out.println("=== TAX CALCULATION WITH DOUBLE (INCORRECT) ===\n");

        // Using double
        double productNetPriceDouble = 9.99;
        double vatRateDouble = 0.23;  // 23% VAT

        // Calculate gross price (net + VAT)
        double grossPriceDouble = productNetPriceDouble * (1 + vatRateDouble);
        System.out.println("Net price (double): €" + productNetPriceDouble);
        System.out.println("Gross price (double): €" + grossPriceDouble);

        // Multiply by 10,000 units
        int quantity = 10000;
        double totalGrossDouble = grossPriceDouble * quantity;
        double totalNetDouble = productNetPriceDouble * quantity;

        System.out.println("\nFor 10,000 units (using double):");
        System.out.println("Total gross value: €" + totalGrossDouble);
        System.out.println("Total net value: €" + totalNetDouble);

        System.out.println("\n=== TAX CALCULATION WITH BIGDECIMAL (CORRECT) ===\n");

        // Using BigDecimal for precise financial calculations
        BigDecimal productNetPriceBD = new BigDecimal("9.99");
        BigDecimal vatRateBD = new BigDecimal("0.23");

        // Calculate gross price: net * (1 + vatRate)
        BigDecimal grossPriceBD = productNetPriceBD.multiply(
                BigDecimal.ONE.add(vatRateBD)
        ).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Net price (BigDecimal): €" + productNetPriceBD);
        System.out.println("Gross price (BigDecimal): €" + grossPriceBD);

        // Calculate for 10,000 units
        BigDecimal quantityBD = new BigDecimal(quantity);
        BigDecimal totalGrossBD = grossPriceBD.multiply(quantityBD);
        BigDecimal totalNetBD = productNetPriceBD.multiply(quantityBD);

        System.out.println("\nFor 10,000 units (using BigDecimal):");
        System.out.println("Total gross value: €" + totalGrossBD);
        System.out.println("Total net value: €" + totalNetBD);

        System.out.println("\n=== COMPARISON ===");
        System.out.println("Double total gross: €" + totalGrossDouble);
        System.out.println("BigDecimal total gross: €" + totalGrossBD);
        System.out.println("Difference: €" +
                new BigDecimal(totalGrossDouble).subtract(totalGrossBD).abs());

        System.out.println("\n=== CONCLUSIONS ===");
        System.out.println("1. Double introduces rounding errors in financial calculations");
        System.out.println("2. 9.99 cannot be represented exactly in binary floating-point");
        System.out.println("3. BigDecimal should ALWAYS be used for monetary values");
        System.out.println("4. The difference becomes larger with more calculations/quantities");
        System.out.println("5. In real financial systems, these errors would cause accounting discrepancies");
    }
}