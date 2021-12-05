import java.util.Scanner;

public class PodatekDochodowy {
    public static void main(String[] args) {

        System.out.println("Progam obliczy podatek dochodowy od osób fizycznych.");
        System.out.println("");
        System.out.print("Podaj swój dochód: ");

        Scanner a = new Scanner(System.in);
        Double dochod = a.nextDouble();

        if(dochod <= 85528.00){
            double podatek1 = (dochod*0.18)-556.02;
            System.out.println("Twój podatek wynosi " + podatek1);
        }
        else if (dochod >= 85528.01){
                double podatek2 =14839.02 + ((dochod - 85528.00) * 0.32);
            System.out.print("Twój podatek wynosi: ");
            System.out.printf("%.2f%n",podatek2);
        }
    }
}
