package mygui.model;

/**
 *
 * @author KaiqueSilva
 */

//Class created for registered customers //
public class Customer {
    
    private String un;
    private String pw;
    
    public Customer(String un, String pw){
        this.un = un;
        this.pw = pw;
    }

    public String getUn() {
        return un;
    }

    public String getPw() {
        return pw;
    }
    
}
