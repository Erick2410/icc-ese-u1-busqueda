import java.util.List;

import Models.Persona;

public class BusquedaLineal {

    private List<Persona> personas;

    public BusquedaLineal(List<Persona> personas){
        this.personas = personas;

    }
    // busque una persona
    // retorne la persona
    // retorne null si no la encontro
    public Persona findByName(String name){
        for (int i = 0; i < personas.size(); i++){
            if (personas.get(i).getName().equals(name)){
                return personas.get(i);
            }
        }
        return null;
    }

    // busque una persona
    // retorne la persona
    // retorne -1 si no la encontro
    public int findPostByName(String name){
        for (Persona persona : personas){
            if (persona.getName().equals(name)){
                return personas.indexOf(persona);
            }
            for (int i= 0; i< personas.size();i++){
                if (personas.get(i).getName().equals(name)){
                    return i;
                }
            }
        }
        return -1;
    }

}
