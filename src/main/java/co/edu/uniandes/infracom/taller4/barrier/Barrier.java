package co.edu.uniandes.infracom.taller4.barrier;
import co.edu.uniandes.infracom.taller4.testhandler.Semaforo;
import co.edu.uniandes.infracom.taller4.testhandler.TestHandler;

public class Barrier extends TestHandler<BarrierMethods> implements BarrierInterface<BarrierMethods> {
    public Barrier() {
        super();
    }

    @Override
    public void A(BarrierThread thread) {
        //TODO Completar el metodo A
    }

    @Override
    public void B(BarrierThread thread) {
        //TODO Completar el metodo B
    }

    @Override
    public void C(BarrierThread thread) {
        //TODO Completar el metodo C
    }

    @Override
    public Semaforo[] getSemaphoresRef() {
        //TODO Instanciar y retornar el arreglo de semaforos
        return null;
    }

    public static void main(String[] args) {
        //TODO Completar el main y lanzar el programa
    }
}
