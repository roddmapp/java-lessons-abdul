package ReverseEchoServerUsingSocket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

//Class for server
public class ReverseEcho {
    public static void main(String[] args) throws Exception{

        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;

        do {
            //for reading
            msg=br.readLine();
            //for reversing
            sb = new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();
            //for writing
            ps.println(msg);
        }while (!msg.equals("dne"));
    }
}

//Client class
class Client {
    public static void main(String[] args) throws Exception{

        Socket stk = new Socket("localhost", 2000);

        //reading from keyboard
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg;
        StringBuilder sb;

        do {
            //for reading from keyboard
            msg= keyb.readLine();
            //for sending to server
            ps.println(msg);
            //read reversed message from server
            msg=br.readLine();
            //print message on the screen
            System.out.println("From Server: "+msg);
        }while (!msg.equals("end"));
        stk.close();
    }
}
