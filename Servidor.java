import java.io.*;
import java.net.*;

public class Servidor extends Thread {

    Socket servicio = null;
    DataInputStream flujoDatosEntrada= null;
    DataOutputStream flujoDatosSalida = null;

    public Servidor(Socket servicio,DataInputStream x, DataOutputStream y){

        this.servicio=servicio;
        flujoDatosEntrada =x;
        flujoDatosSalida =y;
    }  

    public void run(){

        System.out.println("Se acepto una nueva conexion");

        try{

            String mensaje = flujoDatosEntrada.readUTF();

            System.out.println(mensaje);
        }catch(Exception e){
            
        }
    }
}

