import java.util.Scanner;

public class SistemaMascotas {


    public void agregarMascota(Mascota m){

    }

    public void mostrarMascotas(){

    }

    public void realizarAccionesMascotas(){

    }

    public static void main(String[] args) {

        //Creando Menu

        Scanner sc = new Scanner(System.in);
        int op;


        System.out.print("Ingrese la opcion a consultar\n" +
                "1.-Agregar una mascota\n"+
                "2.-Mostrar las mascotas\n"+
                "3.-Que las mascotas realizen sus acciones\n");
        op=sc.nextInt();
        if(op==1){}

        //Caso perro

        Perro perrito= new Perro("Pepe",11,"quiltro");

        perrito.correr();
        perrito.hacerSonido();

        Gato gatito= new Gato("Ciro",3,"scotish");

        gatito.trepar();
        gatito.hacerSonido();

        Ave avecita= new Ave("Condorito",55,"Condor");

        avecita.volar();
        avecita.hacerSonido();
    }
}
