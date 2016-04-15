package com.server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {

	public static void main(String[] args) {

		try {
			ServerSocket ss = new ServerSocket(8080);
			while (true) {

				System.out.println("waiting for request..");
				Socket socket = ss.accept();
				System.out.println("request accepted...");

				ClientWork clientWork = new ClientWork(socket);
				Thread thread = new Thread(clientWork);
				thread.start();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

class ClientWork implements Runnable {

	Socket socket;

	public ClientWork(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {

		try {
			Thread.sleep(5 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject("Hello Client!!");
			os.flush();
			System.out.println("response sent...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
