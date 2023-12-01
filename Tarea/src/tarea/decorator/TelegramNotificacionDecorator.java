package tarea.decorator;


public class TelegramNotificacionDecorator extends BaseNotificacion {

    @Override
    public boolean notificar(){
        super.notificar();  //LOGICA EXTRA PARA NOTIFICAR EN TELEGRAM
        return true;
    }
   
}