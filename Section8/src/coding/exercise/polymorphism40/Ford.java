package coding.exercise.polymorphism40;

public class Ford extends Car{
    public Ford(int cylinders, String name){
        super(cylinders, name);
    }
    
     public String startEngine (){
       return "Ford -> startEngine()" + getClass().getSimpleName();
    }
    
     public String accelerate  (){
        return "Ford -> accelerate()" + getClass().getSimpleName();
    }
    public String brake   (){
        return "Ford -> brake()" + getClass().getSimpleName();
    }
}
