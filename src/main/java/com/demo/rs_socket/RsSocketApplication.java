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
		SpringApplication.run(RsSocketApplication.class, args);

		RSocketServer socketServer = RSocketServer.create(new SocketAcceptorImpl());
		CloseableChannel closeableChannel = socketServer.bindNow(TcpServerTransport.create(6565));

		// keep listening
		closeableChannel.onClose().block();

	}

}
