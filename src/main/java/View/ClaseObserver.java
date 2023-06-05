package View;

import Controller.Controller;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class ClaseObserver implements Observer {
    View miVista = new View();
    @Override
    public void update(Observable o, Object arg) {
    }
}