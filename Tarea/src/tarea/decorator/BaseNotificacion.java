package tarea.decorator;

public abstract class BaseNotificacion implements Notificacion {

    private Notificacion n;

    public BaseNotificacion(Notificacion n) {
        this.n = n;
    }

    public BaseNotificacion() {
    }

    @Override
    public boolean notificar() {//LOGICA PARA NOTIFICAR 
        return true;
    }

}
