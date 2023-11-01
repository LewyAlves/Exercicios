import java.util.Scanner;

public class ConversorDeTemperatura {

    public void temperaturasEConversoes(int n){
        var C = n;
        var K = C + 273.15;
        var Re = C * 0.8;
        var Ra = K * 1.8;
        var F = (C * 9/5) + 32;

        System.out.println(C + "C°");
        System.out.println("conversões:");
        System.out.println("Kelvin: "+ K);
        System.out.println("Réaumur: " + Re);
        System.out.println("Rankine: " + Ra);
        System.out.println("Fahrenheit: "+ F);
    }
}
