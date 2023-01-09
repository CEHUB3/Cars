import java.sql.SQLOutput;

public class Cars {

    private String brand;
    private String model;
    private String color;
    private int modelYear;
    static int instanceCounter = 0;

    public Cars(String brand, String model, String color, int modelYear){

        System.out.println("Bara Volvo kan skapas");
        instanceCounter = instanceCounter + 1;

    }
    public Cars(){

        this("BMW", "X5", "Blå", 2019);
        System.out.println("Bara BMW här");

    }

    public String getBrand(){
        return brand;
    }
    public String getModel (){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getModelYear(){
        return modelYear;
    }





}
