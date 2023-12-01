
package tarea.decorator;


public class WhatsAppNotificacionDecorator extends BaseNotificacion {
    
    @Override
    public boolean notificar() {
        super.notificar();//LOGICA EXTRA PARA NOTIFICAR EN WHATSAPP
        return true;
    }

}

    

