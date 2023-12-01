
package tarea.decorator;

public class EmailNotificacionDecorator implements Notificacion  {
    @Override
    public boolean notificar() {
        //LOGICA DE NOTIFICACION
        return true;
    }
    
}
