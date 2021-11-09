package sistemaHospitalar;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SistemaGerenciamentoHospitalar {


    public static void main(String[] args) {
        System.out.println(" JDBC Start ");
        
        System.out.println("Programis running on gui...");
        HomePage hp = new HomePage();
        hp.setVisible(true);
    }

}
