package com.thehecklers.rsocketclient;

import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;

@Component
public class RSComponent {
    private final RSocketRequester requester;

    public RSComponent(RSocketRequester.Builder builder) {
        this.requester = builder.connectTcp("localhost", 9999).block();
    }

    @PostConstruct
    void doThis() {
        Mono<Pong> stringMono = requester.route("pingpong")
                .data(new Ping("Pinging RSocket server..."))
                .retrieveMono(Pong.class);
        stringMono.subscribe(r -> System.out.println("   >>> Returning pong: " + r.getMessage()));
    }
}
