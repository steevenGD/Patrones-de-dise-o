/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.decorator;

/**
 *
 * @author mcruz
 */
public class WireNotificacionDecorator extends BaseNotificacion{
     @Override
    public boolean notificar(){
        super.notificar();  //LOGICA EXTRA PARA NOTIFICAR EN WIRE
        return true;
    }
   
    
}
