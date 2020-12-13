package mygui.controller;

import mygui.views.MainWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mygui.views.CustomerWindow;
import mygui.model.Customer;
import mygui.model.MainModel;
import mygui.views.JoinWindow;



public class MainController implements ActionListener {
    
    //linking my mvc//
    MainWindow mWindow;
    MainModel model;
    
    
    public MainController(){
        this.mWindow = new MainWindow(this);
        this.model = new MainModel();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //action commmand to listen to the "log in" button//
        if (e.getActionCommand().equals("Log In")) {
        String un = mWindow.getUserEMAIL();
        String pw = mWindow.getUserPassword();
        
        Customer user = new Customer(un, pw);
                
        boolean result = model.login(user);
                
        if(!result){
            mWindow.getLogInFailed();
        }        
        else{
            new CustomerWindow();
            this.mWindow.dispose();
        }
        
        }
        //action commmand to listen to the "join us now" button//
        else if (e.getActionCommand().equals("Join Us Now")) {
            new JoinWindow();
                this.mWindow.dispose();
        }
     
      
        
    }
        
    

    
}

