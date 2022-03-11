import java.io.*;
import java.net.*;

public class Cliente {

    public static void main(String[] args){

        String ip= "127.0.0.1";
        Socket conexion= null;
        int PUERTO= 5555;

          try{
              conexion =new Socket(ip,PUERTO);

              DataOutputStream flujoDatosSalida = new DataOutputStream(conexion.getOutputStream()); //Creamos objeto para enviar 
              flujoDatosSalida.writeUTF("Gracias por aceptarme"); //Mandamos el mensajeal servidor

            }catch(Exception e){

                System.out.println("No se pudo crear la conexion");
                e.printStackTrace();

            }
        }
    }





