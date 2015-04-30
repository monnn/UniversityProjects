package com.moni.logserver;

import java.io.*;
import java.net.Socket;

/**
 * Created by moni on 27.01.15.
 */
public class ClientHandler implements Runnable {

    private Socket client;

    static Writer fileWriter;

    static {
        try {
            fileWriter = new FileWriter(Server.LOG_DIR + "root.log", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String clientId;

    public ClientHandler(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {
        this.clientId = Thread.currentThread().getName();
        System.out.println(
                "Thread started with name:" + clientId);
        readClientResponse();
    }

    private void readClientResponse() {
        String msg = null;
        try {
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
            msg = input.readLine();
        } catch (IOException e) {
            System.out.println("Error reading client response!!!");
        }
        if (msg != null) {
            logMessage(msg);
        }
    }

    private void logMessage(String msg) {

        try {
            synchronized (fileWriter) {

                if (msg != null) {
                    String[] logParts = msg.split(": ");
                    String clientIdPart = logParts[0];
                    clientIdPart = clientIdPart.replace(Server.CLIENT_ID_TEMPLATE, this.clientId);
                    String messagePart = logParts[logParts.length - 1].trim();
                    String[] messageLines = messagePart.split("\\n");
                    for (String line : messageLines) {
                        fileWriter.write(clientIdPart + ": " + line + "\n");
                    }
                }
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Cannot write client message into log file!!!");
        }
    }
}
