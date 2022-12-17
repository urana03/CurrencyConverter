import java.util.*;
public class CurrencyConverter {
   
    static float currencyINR;
   static final float usd = 82.435f;
   static final float euro = 86.921f;
   static final float cad = 60.466f;
   static final float aud = 55.859f;
   static final float gbp = 101.032f;
   static float converted; 

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount in INR: ");
        currencyINR = scan.nextFloat();
        System.out.print(
        "Enter 1.To convert into USD\n2.To convert into EURO\n3.To convert into CAD\n4.To convert into AUD\n5.To covert into GBP:");
        int check = scan.nextInt();
        switch(check){
            case 1:
            converted = currencyINR/usd;
            System.out.println("Converted currency into USD: "+converted);
            break;
            case 2:
            converted = currencyINR/euro;
            System.out.println("Converted currency into EURO: "+converted);
            break;
            case 3:
            converted = currencyINR/cad;
            System.out.println("Converted currency into CAD: "+converted);
            break;
            case 4:
            converted = currencyINR/aud;
            System.out.println("Converted currency into AUD: "+converted);
            break;
            case 5:
            converted = currencyINR/gbp;
            System.out.println("Converted currency into GBP: "+converted);
            break;
        }
        scan.close();
    }
}
