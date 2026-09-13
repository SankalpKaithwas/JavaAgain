package coding.exercise.polymorphism40;

public class Car {
    
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;
    
    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name= name;
    }
    
    public String startEngine (){
        return "Car -> startEngine()" + getClass().getSimpleName();
    }
    
     public String accelerate  (){
        return "Car -> accelerate()" + getClass().getSimpleName();
    }
    public String brake   (){
        return "Car -> brake()" + getClass().getSimpleName();
    }
    
    public int getCylinder(){
        return cylinders;
    }
    
    public String getName(){
        return name;
    }
    
    
}
