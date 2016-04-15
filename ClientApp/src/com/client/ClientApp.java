package com.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientApp {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("localhost", 8080);

			// input

			// output
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			String message = (String) ois.readObject();
			System.out.println(message);

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
