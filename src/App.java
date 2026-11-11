import Models.Persona;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Persona> personas = List.of(
            new Persona("Juan", 24, "M"),
            new Persona("Maria", 30, "F"),
            new Persona("Pedro", 20, "M"),
            new Persona("Ana", 28, "F")
        );

        //Busque una persona con nombre "Maria"
        //Retorne la persona
        // 2. busque una persona con nombre "Diego"
        //retorne la persona
        //3. busque una persona con nombre "Ana"
        //imprima la posicion de la persona si la encontro
        
    BusquedaBinaria busquedaBinaria = new BusquedaBinaria(personas);
    int resultado = busquedaBinaria.findByName("Ana");
    if (resultado >= 0){
        System.out.println("Se encontro en la pos = " + resultado);
    }else{
        System.out.println("No se encontro");
    }

    int res = busquedaBinaria.findByName("Pedro");
    //Operador Ternario
    // cond ? accion true : accion false
    System.out.println(res >= 0 ? "Se encontro en la pos =" + res : "No se encontro");

    int res2 = busquedaBinaria.findByAge(25);
    System.out.println(res2 >= 0 ? "Se encontro alguien de edad: " + res2 + "posicion" + res : "No se encontro");

    Persona pBuscar = new Persona("Maria", 30, "F");
    int res3 = busquedaBinaria.findByPerson(pBuscar);
    System.out.println(res >= 0 ? "Se encontro en la pos =" + res3 : "No se encontro");

    }
}
