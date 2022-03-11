import java.io.*;
import java.net.*;

public class Servidor extends Thread{
    Socket servicio= null;
    DataInputStream flujoDatosEntrada= null;
    DataInputStream flujoDatosSalida= null;
    
    
    public Servidor(Socket servicio, DataInputStream x, DataOutputStream y){//Constructor

        this.servicio= servicio;
        flujoDatosEntrada= x;
        flujoDatosSalida= y;   
    }

    public void run(){ //Esto es un método que es lo que correrá cada hilo de nuestro servidor

        System.out.println("Se aceptó una nueva conexión");

        try{

            String mensaje= flujoDatosEntrada.readUTF(); //Recibimos un mensaje
            
            System.out.println(mensaje); //Imprimimos el mensaje recibido
        }catch(Exception e){

        }

    }

    
}
    
