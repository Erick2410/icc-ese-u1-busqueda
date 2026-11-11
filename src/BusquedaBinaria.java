import Models.Persona;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BusquedaBinaria{

    private List<Persona> personas;

    public BusquedaBinaria(List<Persona> personas){
        this.personas = new ArrayList<>(personas);
    }

    public int findByName(String name){
        // ordenado -> por nombre
        personas.sort(Comparator.comparing(Persona::getName)
        );

        //Busqueda Binario
        //Definimos limites
        int lo = 0;
        int hi = personas.size()-1;
        //Definimos bucle
        while (lo <= hi) {
            //Calculamos mid
            int mid = (lo + hi) / 2;

            //Preguntar si el mid es lo buscado
            if(personas.get(mid).getName().equals(name)){
                return mid;
            }

            //Actualizar limites
             // Veridicar si es mayor o menor y escoger un lado
            if(personas.get(mid).getName().compareTo(name) < 0){
                //Actualizo el limite 
                lo = mid + 1;
            } else {
                //Actualizo el limite
                hi = mid - 1;
            }
        }
        return -1;
    } 

    public int findByAge(int edad){
        // ordenado -> por nombre
        personas.sort(Comparator.comparing(Persona::getEdad)
        );

        //Busqueda Binario
        //Definimos limites
        int lo = 0;
        int hi = personas.size()-1;
        //Definimos bucle
        while (lo <= hi) {
            //Calculamos mid
            int mid = (lo + hi) / 2;

            //Preguntar si el mid es lo buscado
            if(personas.get(mid).getEdad() == edad)
                return mid;
            

            //Actualizar limites
             // Veridicar si es mayor o menor y escoger un lado
            if(personas.get(mid).getEdad() <(edad))
                //Actualizo el limite 
                lo = mid + 1;
            else
                //Actualizo el limite
                hi = mid - 1;
            
            
        }
        return -1;
    }

    public int findByPerson(Persona p){
        personas.sort(null);
        int lo = 0;
        int hi = personas.size()-1;
        //Definimos bucle
        while (lo <= hi) {
            //Calculamos mid
            int mid = (lo + hi) / 2;

            //Preguntar si el mid es lo buscado
            if(personas.get(mid).compareTo(p) == 0)
                return mid;
            

            //Actualizar limites
             // Veridicar si es mayor o menor y escoger un lado
            if(personas.get(mid).compareTo(p) < 0)
                //Actualizo el limite 
                lo = mid + 1;
            else
                //Actualizo el limite
                hi = mid - 1;
            
            
        }
        return -1;

    }


}