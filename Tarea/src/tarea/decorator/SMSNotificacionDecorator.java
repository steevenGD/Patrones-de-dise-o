
package tarea.decorator;


public class SMSNotificacionDecorator implements Notificacion{
     @Override
    public boolean notificar() {
        //LOGICA DE NOTIFICACION
        return true;
    }
    
}
