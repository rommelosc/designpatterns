package com.rommelosc.designpatterns.structural.proxy.remote;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class PersonProxy extends Person implements Runnable{

	private Thread thread;
	private Socket socket;
	private InputStream in;
	private PrintWriter out;
	int character;
	
	public PersonProxy() {
		try {
			socket = new Socket("127.0.0.1", 7777);
			System.out.println("Connecting...");
			
			in = socket.getInputStream();
			out = new PrintWriter(socket.getOutputStream(), true);
			
			thread = new Thread(this);
			thread.start();
			
		} catch (IOException ioe) {
			System.out.println("Connection error: "+ioe.getMessage());
		}
		
		if( socket != null && socket.isConnected() ){
			System.out.println("Connected!");
		}
	}
	
	@Override
	public void run() {
		try {
			while( (character = in.read()) != -1 ){
				System.out.println((char)character);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

	@Override
	public void greeting() {
		out.println("greeting");
		
	}

	@Override
	public void sayState() {
		out.println("sayState");
	}

	@Override
	public void sayGoodbye() {
		out.println("sayGoodbye");
	}
	
}
