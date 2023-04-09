package com.demo.rs_socket;

import com.demo.rs_socket.service.SocketAcceptorImpl;
import io.rsocket.core.RSocketServer;
import io.rsocket.transport.netty.server.CloseableChannel;
import io.rsocket.transport.netty.server.TcpServerTransport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RsSocketApplication {

	public static void main(String[] args) {
		System.out.println("=========================================RsSocketApplication====================================");
		SpringApplication.run(RsSocketApplication.class, args);
	}

}
