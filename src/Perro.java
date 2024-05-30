public class Perro extends Mascota{

    public Perro(String nombre, int edad, String tipo) {
        super(nombre, edad, tipo);
    }



    @Override
    public void hacerSonido(){
        System.out.printf(getNombre()+" hace Wof wof\n");
    }

    public void correr(){
        System.out.println("Perro esta corriendo\n");
    }

}
