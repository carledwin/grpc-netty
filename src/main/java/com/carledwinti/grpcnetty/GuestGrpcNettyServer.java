package com.carledwinti.grpcnetty;

import com.carledwinti.grpcnetty.service.GuestService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class GuestGrpcNettyServer {

    private static final Logger LOGGER = LoggerFactory.getLogger(GuestGrpcNettyServer.class);

    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder
                .forPort(9090)
                .addService(new GuestService())
                .build();
        server.start();
        LOGGER.debug("Server was started at " + server.getPort() + " port");
        server.awaitTermination();
    }
}
