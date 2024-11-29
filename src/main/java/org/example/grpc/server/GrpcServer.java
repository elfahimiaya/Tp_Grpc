package org.example.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import org.example.grpc.services.BankGrpcService;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Création et configuration du serveur gRPC
        Server server = ServerBuilder.forPort(5555)
                .addService(new BankGrpcService())
                .build();

        // Démarrage du serveur
        server.start();

        // Attendre que le serveur soit arrêté
        server.awaitTermination();
    }
}
