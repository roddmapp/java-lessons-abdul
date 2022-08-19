package ReverseEchoServerUsingSocketMultiTread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ReverseEchoMultiThreads extends Thread {
    Socket stk;

    public ReverseEchoMultiThreads(Socket st) {
        stk = st;
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());

            String msg;
            StringBuilder sb;

            do {
                //for reading
                msg = br.readLine();
                //for reversing
                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();
                //for writing
                ps.println(msg);
            } while (!msg.equals("dne"));
            stk.close();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(2000);
        int count = 1;
        Socket stk;
        ReverseEchoMultiThreads re;

        //creating an infinite loop for the server to run. Most servers run infinitely
        do {
            stk = ss.accept();
            System.out.println("Client Connected "+count++);
            re = new ReverseEchoMultiThreads(stk);
            //start thread to communicate with the client
            re.start();
        } while (true);


    }
}

    //Client class
    class Client {
        public static void main(String[] args) throws Exception {

            Socket stk = new Socket("localhost", 2000);

            //reading from keyboard
            BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));

            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());

            String msg;
            StringBuilder sb;

            do {
                //for reading from keyboard
                msg = keyb.readLine();
                //for sending to server
                ps.println(msg);
                //read reversed message from server
                msg = br.readLine();
                //print message on the screen
                System.out.println("From Server: " + msg);
            } while (!msg.equals("end"));
            stk.close();
        }
    }
