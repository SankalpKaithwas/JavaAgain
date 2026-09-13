package coding.exercise.polymorphism40;

public class Holden extends Car{
    
    public Holden(int cylinders, String name){
        super(cylinders, name);
    }
    
     public String startEngine (){
        return "Holden -> startEngine()" + getClass().getSimpleName();
    }
    
     public String accelerate  (){
        return "Holden -> accelerate()" + getClass().getSimpleName();
    }
    public String brake   (){
        return "Holden -> brake()" + getClass().getSimpleName();
    }
}
