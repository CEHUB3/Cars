import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        boolean running
        while
        System.out.print("Välkommen! \nAnge bilmärke: ");
        String brand = input.nextLine();

        System.out.print("Ange model: ");
        String model = input.nextLine();

        System.out.print("Ange färg: ");
        String color = input.nextLine();

        System.out.print("Ange årsmodell: ");
        int modelYear = input.nextInt();
        input.nextLine();

        Cars car1 = new Cars("Volvo","V90" , "Vit", 2022);
        Cars car2 = new Cars("Volvo", "XC60", "Svart", 2020);
        Cars carUser = new Cars(brand, model, color, modelYear);





    }
}