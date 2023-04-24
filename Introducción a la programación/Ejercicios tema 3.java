public class PrimeraParte {

    public static void main(String[] args) {
        int resultado;
        resultado=suma(5, 10, 15);
        System.out.println("el resultado de Esta operación es " + resultado);

        SegundaParte.Coche miCoche = new SegundaParte.Coche(2);
        miCoche.incrementarPuertas();
        System.out.println("El coche tiene " + miCoche.getNumPuertas() + " puertas.");
    }
    public static int suma(int i, int j, int k){
        return (i + j + k);

    }
    public static class Coche {
        private int numPuertas;

        public Coche(int numPuertas) {
            this.numPuertas = numPuertas;
        }

        public void incrementarPuertas() {
            this.numPuertas++;
        }

        public int getNumPuertas() {
            return this.numPuertas;
        }
    }
}