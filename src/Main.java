import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final double zahl1;
        final double zahl2;
        final double ergebniss;
        final String operator;

        Scanner scaneroperator = new Scanner(System.in)

        //Benutzer führen
        System.out.println("-----------------------------");
        System.out.println("######## Calculator #########");
        System.out.println("-----------------------------");
        System.out.println();

        System.out.println("Erste Zahl: ");
        zahl1 = scaneroperator.nextDouble();

        System.out.println("Zweite Zahl: ");
        zahl2 = scaneroperator.nextDouble();

        System.out.println("Operator: ");
        operator = scaneroperator.next();

        //@todo -> 1. Wo wird das Ergebniss gespeichert?
        //@todo -> 2. IF ist so nicht richtig. Java If googeln
        //@todo -> 3. Gibt es eine bessere Methode als 4 If Abfragen nacheinander?

        if (operator = +){
            zahl1 + zahl2;
        }else{
            if(operator = -){
                zahl1 - zahl2;
            }else{
                if(operator = *){
                    zahl1 * zahl2;
                }else{
                    if(operator = /){
                        zahl1 / zahl2;
                    }
                }
            }
        }


    }
}
