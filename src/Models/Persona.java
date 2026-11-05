package Models;

public class Persona {
    private String name;
    private int edad;
    private String genero;


    public Persona(String name, int edad, String genero){
        this.name = name;
        this.edad = edad;
        this.genero = genero;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public int getEdad(){
        return edad;
    }

    public void setEdad(int Edad){
        this.edad = edad;
    }
    

    @Override 
    public String toString(){
        return " Name:" + name + " Age: " + edad + "Gender" + genero;
    }

}
