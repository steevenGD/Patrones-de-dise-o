/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.facthoryMethod_2;

import java.security.DrbgParameters;
import java.security.DrbgParameters.Capability;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class WebChannel implements VirtualChannel {

    @Override
    public List<Capability> getCapabilities() {
        return new LinkedList();
    }
    
}
