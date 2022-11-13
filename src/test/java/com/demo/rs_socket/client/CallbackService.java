package com.demo.rs_socket.client;

import com.demo.rs_socket.dto.ResponseDto;
import com.demo.rs_socket.util.ObjectUtil;
import io.rsocket.Payload;
import io.rsocket.RSocket;
import reactor.core.publisher.Mono;

public class CallbackService implements RSocket {

    @Override
    public Mono<Void> fireAndForget(Payload payload) {
        System.out.println("Client received : " + ObjectUtil.toObject(payload, ResponseDto.class));
        return Mono.empty();
    }
}
