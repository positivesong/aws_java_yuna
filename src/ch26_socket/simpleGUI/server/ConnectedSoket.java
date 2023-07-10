package ch26_socket.simpleGUI.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConnectedSoket extends Thread {
	
	private final Socket socket;
	
	@Override
	public void run() {
		
		while(true) {
			try {
				BufferedReader bufferedReader = 
						new BufferedReader(new InputStreamReader(socket.getInputStream()));
				System.out.println(bufferedReader.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
