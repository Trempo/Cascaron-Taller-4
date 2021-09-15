package co.edu.uniandes.infracom.taller4.barrier;

import co.edu.uniandes.infracom.taller4.testhandler.Semaforo;

public class BarrierThread extends Thread {
    private String id;
    private Barrier ref;
    private Semaforo[] sems;

    // Constructor
    public BarrierThread(String pId, Barrier pRef) {
        this.id = pId;
        this.ref = pRef;
        this.sems = this.ref.getSemaphoresRef();
    }

    // Devolver el ID asignado
    String getThreadId() {
        return id;
    }

    @Override
    public void run() {
        switch (id){
            case "A":
                ref.A(this);
            case "B":
                ref.B(this);
            case "C":
                ref.C(this);
            case"D":
                ref.D(this);
        }
    }
}
