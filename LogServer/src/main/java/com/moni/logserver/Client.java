package com.moni.logserver;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by moni on 27.01.15.
 */
public class Client {

    private String hostname;

    private int port;

    Socket socketClient;

    public Client(String hostname, int port){
        this.hostname = hostname;
        this.port = port;
    }


    public void connect() {
        System.out.println("Attempting to connect to " + hostname + ":" + port);
        try {
            socketClient = new Socket(hostname, port);
            System.out.println("Connection Established");
        } catch (IOException e) {
            System.err.println("Cannot establish connection. Server may not be up." + e.getMessage());
        }
    }

    public void sendMessage() {
        System.out.println("Send message to the server: ");
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();
        BufferedWriter writer;
        String logEntry = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S")
                .format(new Date()) +
                "[" + Server.CLIENT_ID_TEMPLATE + "]: " + msg;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(socketClient.getOutputStream()));
            writer.write(logEntry);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String arg[]) throws IOException {
        Client client = new Client(Server.DEFAULT_HOSTNAME, Server.DEFAULT_PORT);
        client.connect();
        client.sendMessage();
    }
}
