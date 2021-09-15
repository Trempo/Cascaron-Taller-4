package co.edu.uniandes.infracom.taller4.barrier;
import co.edu.uniandes.infracom.taller4.testhandler.Semaforo;
import co.edu.uniandes.infracom.taller4.testhandler.TestHandler;

public class Barrier extends TestHandler<BarrierMethods> implements BarrierInterface<BarrierMethods> {
    private Semaforo[] semaforos = new Semaforo[3];
    public Barrier() {

        //Semaforo de A
        semaforos[0] = new Semaforo(0);

        //Semaforo de C
        semaforos[1] = new Semaforo(0);

        //Semaforo de D
        semaforos[2] = new Semaforo(0);

    }

    @Override
    public void A(BarrierThread thread) {
        this.semaforos[0].p();
        this.addEvents(BarrierMethods.A);
        System.out.println(String.format(
                "Thread ID: %s " + "Ejecutando el metodo A",
                thread.getThreadId()
        ));
        this.semaforos[0].v();
    }

    @Override
    public void B(BarrierThread thread) {
        this.addEvents(BarrierMethods.B);
        System.out.println(String.format(
                "Thread ID: %s " + "Ejecutando el metodo B",
                thread.getThreadId()
        ));

        this.semaforos[2].v();
    }

    @Override
    public void C(BarrierThread thread) {
        this.semaforos[1].p();
        this.addEvents(BarrierMethods.C);
        System.out.println(String.format(
                "Thread ID: %s " + "Ejecutando el metodo C",
                thread.getThreadId()
        ));
        this.semaforos[1].v();
    }

    @Override
    public void D(BarrierThread thread) {
        this.semaforos[2].p();
        this.addEvents(BarrierMethods.D);
        System.out.println(String.format(
                "Thread ID: %s " + "Ejecutando el metodo D",
                thread.getThreadId()
        ));
        this.semaforos[2].v();
        this.semaforos[1].v();
        this.semaforos[0].v();
    }

    @Override
    public Semaforo[] getSemaphoresRef() {
        return semaforos;
    }

    public static void main(String[] args) {
        Barrier barrera = new Barrier();
        BarrierThread A = new BarrierThread("A", barrera);
        BarrierThread B = new BarrierThread("B", barrera);
        BarrierThread C = new BarrierThread("C", barrera);
        BarrierThread D = new BarrierThread("D", barrera);

        A.run();
        B.run();
        C.run();
        D.run();

    }
}
