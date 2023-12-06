package org.ensaj.client;

import org.ensaj.client.Model.Client;
import org.ensaj.client.Repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

//    @Bean
//    CommandLineRunner initialiserBaseH2(ClientRepository clientRepository){
//        return args -> {
//            clientRepository.save(new Client(Long.parseLong("1"), "Chafik Baidada", Float.parseFloat("36")));
//            clientRepository.save(new Client(Long.parseLong("2"), "Mohamed Fahim", Float.parseFloat("29")));
//            clientRepository.save(new Client(Long.parseLong("3"), "Tarik Boudaa", Float.parseFloat("37")));
//        };
//    }

}


