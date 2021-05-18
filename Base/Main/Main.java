package Main;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        world r= new world();

        r.showGUI();
        r.run();

    }
}
