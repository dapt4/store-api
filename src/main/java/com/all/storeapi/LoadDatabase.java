package com.all.storeapi;

import com.all.storeapi.model.Store;
import com.all.storeapi.repository.StoreRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

//    @Bean
//    CommandLineRunner initDatabase(StoreRepository repository) {
//        System.out.println("init the server");
//        Store str = new Store();
//        str.setMarket("market");
//        str.setDescription("a market");
//        str.setBadge(1);
//        str.setDistance(1);
//        str.setProduct("product");
//        str.setRated((byte)1);
//        str.setProductsFind(1);
//        str.setProductsTotal(1);
//        str.setPrice(1);
//        str.setItemsCart(1);
//        return args -> {
//            log.info("Preloading " + repository.save(str));
//        };
//    }
}