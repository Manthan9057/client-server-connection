import java.net.ServerSocket;
import java .net.Socket;
public class Server {
  public static void main(String[] args) {
       try
       {
          System.out.println("waiting for client");
          ServerSocket ss = new ServerSocket(9999);
          Socket soc = ss.accept();
          System.out.println("hello");
        }
       catch(Exception e)
      {
          e.printStackTrace();
       } 
  
     }
   }