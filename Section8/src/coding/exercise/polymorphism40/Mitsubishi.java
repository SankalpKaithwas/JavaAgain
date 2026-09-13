package coding.exercise.polymorphism40;

public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name){
        super(cylinders, name);
    }
    
     public String startEngine (){
        return "Mitsubishi -> startEngine()" + getClass().getSimpleName();
    }
    
     public String accelerate  (){
        return "Mitsubishi -> accelerate()" + getClass().getSimpleName();
    }
    public String brake   (){
        return"Mitsubishi -> brake()" + getClass().getSimpleName();
    }
    
    
    
}
