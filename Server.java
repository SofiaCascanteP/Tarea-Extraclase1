import java.io.*;
import java.net.*;

public class Server {

    static final int PUERTO= 5555;

    public void multiCuenta(){

        Socket servicio= null;

        try{

            try (ServerSocket servidor = new ServerSocket(PUERTO)) {
                System.out.println("Esperando peticiones por el puerto " + PUERTO);

                while(true){

                    servicio = servidor.accept();
                    DataInputStream flujoDatosEntrada =new DataInputStream(servicio.getInputStream());
                    OutputStream escribir = servicio.getOutputStream();
                    DataOutputStream flujoDatosSalida = new DataOutputStream(escribir);

                    Servidor cc = new Servidor(servicio,flujoDatosEntrada,flujoDatosSalida);
                    cc.start();
                }
            }


        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){

        Server os= new Server();
        os.multiCuenta();
    }
    
}
