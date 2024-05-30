public class Gato extends Mascota{

    public Gato(String nombre,
                int edad,
                String tipo) {
        super(nombre, edad, tipo);
    }

    @Override
    public void hacerSonido(){
        System.out.printf("gato hace Miau miau!!\n");
    }
    public void trepar(){
        System.out.printf("%s esta trepando\n",getNombre());
    }
}
