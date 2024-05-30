public class Ave extends Mascota{

    public Ave(String nombre,
                int edad,
                String tipo) {
        super(nombre, edad, tipo);
    }

    @Override
    public void hacerSonido(){
        System.out.printf("ave hace Pio pio!!\n");
    }
    public void volar(){
        System.out.printf("%s volando\n",getNombre());
    }
}
