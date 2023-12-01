/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.facthoryMethod;

/**
 *
 * @author USUARIO
 */
public class CreditCardCreator implements CreditCard{
    
    public CreditCard getCretidCard(CreditCard type){
        return type;
    }
    
    public CreditCard creatCard(CreditCard type){
        return type;
    }
    
    @Override
    public void setLimit(float crediLimit) {
        //code
    }

    @Override
    public void setCost(float annualCost) {
        //code
    }
    
    public static void main(String[] args){
        CreditCardCreator create = new CreditCardCreator();
        CreditCard c = create.creatCard(new BasicCreditCard());
        c.setLimit(2.2f);
        c.setCost(3.3f);
    }
}
