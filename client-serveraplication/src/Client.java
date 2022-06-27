import java.net.Socket;
public class Client {
    public static void main(String[] args){
       try
       {
          System.out.println("client started");
          Socket soc = new Socket("localhost",9999);
          System.out.println("hello");
        }
       catch(Exception e)
      {
          e.printStackTrace();
       } 
     }
   }