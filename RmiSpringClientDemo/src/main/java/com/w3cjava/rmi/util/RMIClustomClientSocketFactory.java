package com.w3cjava.rmi.util;

import java.io.IOException;
import java.net.Socket;
import java.rmi.server.RMIClientSocketFactory;

public class RMIClustomClientSocketFactory implements RMIClientSocketFactory {
	
	private int timeout;
	
	/**
	 * 设置超时时间
	 * @param timeout
	 */
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}


	@Override
	public Socket createSocket(String host, int port) throws IOException {
		Socket socket = new Socket(host,port);
		socket.setSoTimeout(timeout);
		return socket;
	}

}
