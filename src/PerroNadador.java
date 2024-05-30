public class PerroNadador extends Perro implements Nadador{

    public PerroNadador(String nombre, int edad, String tipo) {
        super(nombre, edad, tipo);
    }

    @Override
    public void nadar(){
        System.out.println("Perro esta nadando");
    }
}
