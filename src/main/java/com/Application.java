package com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


import java.net.URISyntaxException;

@SpringBootApplication
@EnableScheduling


public class Application {







    public static void main(String[] args) throws URISyntaxException, InterruptedException {

     //      WebSocketClient client1=RunStart(wsseveraddress);
//        //WebSocketClient client1=RunStart("ws://172.18.2.92:8082/deviceWs");
//        clientsn1= client1;

        SpringApplication.run(Application.class,args);
    }
}
