package com.thehecklers.rsocketclient;

import io.rsocket.RSocket;
import io.rsocket.core.RSocketConnector;
import io.rsocket.frame.decoder.PayloadDecoder;
import io.rsocket.transport.netty.client.TcpClientTransport;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.MimeTypeUtils;

import java.net.InetSocketAddress;

//@Configuration
public class RSConfig {
//    @Bean
/*    RSocket rSocket() {
        // Only necessary/useful if you need to override something per below
        return RSocketConnector.create()
                .dataMimeType(MimeTypeUtils.APPLICATION_JSON_VALUE)
                .payloadDecoder(PayloadDecoder.ZERO_COPY)
                .connect(TcpClientTransport.create(new InetSocketAddress("127.0.0.1", 9999)))
                .block();
    }*/
}
