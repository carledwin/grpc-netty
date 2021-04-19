package com.carledwinti.grpcnetty.service;

import com.carledwinti.grpcnetty.Guest;
import com.carledwinti.grpcnetty.guestGrpc;
import io.grpc.stub.StreamObserver;
import org.apache.commons.lang3.StringUtils;

public class GuestService extends guestGrpc.guestImplBase {

    @Override
    public void register(Guest.RegisterRequest request, StreamObserver<Guest.RegisterResponse> responseObserver) {
        //super.register(request, responseObserver);
        String name = request.getName();
        String surname = request.getSurname();

        Guest.RegisterResponse.Builder registerResponse = Guest.RegisterResponse.newBuilder();

        if(StringUtils.isBlank(name) || StringUtils.isBlank(surname)){
            registerResponse
                    .setCode(400)
                    .setMessage("Name or Surname is null");
        }else{
            registerResponse
                    .setCode(201)
                    .setFullname(name.concat(" ").concat(surname))
                    .setMessage("Guest successfully created");
        }

        responseObserver.onNext(registerResponse.build());
        responseObserver.onCompleted();
    }

    @Override
    public void greeting(Guest.Empty request, StreamObserver<Guest.DefaultResponse> responseObserver) {
        //super.greeting(request, responseObserver);
        Guest.DefaultResponse.Builder defaultResponse = Guest.DefaultResponse.newBuilder();
        defaultResponse
                .setCode(200)
                .setInformation("Welcome to Guest GRPC Netty API!");

        responseObserver.onNext(defaultResponse.build());
        responseObserver.onCompleted();
    }
}
