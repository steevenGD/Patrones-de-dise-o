/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.facthoryMethod_2;

import java.security.DrbgParameters;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author mcruz
 */
public class PhoneChannel implements VirtualChannel {
    @Override
    public List<DrbgParameters.Capability> getCapabilities() {
        return new LinkedList();
    }
    
    
    
}
