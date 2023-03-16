package org.example;

import org.example.business.concretes.CustomerManager;
import org.example.data.entity.Customer;
import org.example.data.entity.Game;
import org.example.data.entity.SpecialOffer;
import org.example.data.repo.CustomerRepo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Verification verification = new Verification();
        SpecialOffer specialOffer = new SpecialOffer(1, "Bahar İndirimleri", 25);

        List<Game> games = new ArrayList<>();//sistemdeki oyunlar
        Game game1 = new Game(1, "Minecraft", 200.0, specialOffer);
        Game game2 = new Game(2, "WoW", 500.0, null);
        games.add(game1);
        games.add(game2);
        CustomerManager customerManager = new CustomerManager(verification);
        Customer customer = new Customer(1, "ozcan@gmail.com", "123456", "11111111111", "Özcan", "Elmacı",
                new Date(1999, 1, 1), new ArrayList<>());

        customerManager.add(customer);

        /*Customer customer1 = new Customer(2, "ozcan@gmail.com", "123456", "11111111111", "Özcan", "Elmacı",
                new Date(1999, 1, 1), new ArrayList<>());*/

        customerManager.buyGame(customer, game1);
        customerManager.buyGame(customer, game2);

        System.out.println(customer);


    }
}