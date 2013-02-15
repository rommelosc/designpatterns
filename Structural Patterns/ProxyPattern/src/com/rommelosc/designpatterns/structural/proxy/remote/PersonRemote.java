package com.rommelosc.designpatterns.structural.proxy.remote;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class PersonRemote extends Person implements Runnable{

	private Thread thread;
	private ServerSocket socket;
	private PrintWriter out;
	private Socket communicationSocket;
	
	public PersonRemote() {
		try {
			socket = new ServerSocket(7777);
			communicationSocket = socket.accept();
			
			out = new PrintWriter(communicationSocket.getOutputStream(), true);
			thread = new Thread(this);
			thread.start();
			
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error: "+e.getMessage());
		}
	}
	
	@Override
	public void run() {
		
		String inputText;
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(communicationSocket.getInputStream()));
			
			while( (inputText = in.readLine()) != null ){
				if( inputText.equals("greeting")){
					greeting();
				}
				else if( inputText.equals("sayState")){
					sayState();
				}
				else if( inputText.equals("sayGoodbye") ){
					sayGoodbye();
				}
			}
			
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
	}

	@Override
	public void greeting() {
		System.out.println("Hello...");		
	}

	@Override
	public void sayState() {
		System.out.println("I'm happy");
	}

	@Override
	public void sayGoodbye() {
		System.out.println("Bye, bye...");
	}
	
	public static void main(String[] args) {
		PersonRemote remote = new PersonRemote();
	}
	
}
