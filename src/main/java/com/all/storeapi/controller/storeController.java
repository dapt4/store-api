package com.all.storeapi.controller;

import com.all.storeapi.StoreNotFoundException;
import com.all.storeapi.model.Store;
import com.all.storeapi.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RestController
public class storeController {

    @Autowired
    private StoreRepository repo;

    //index
    @GetMapping("/")
    private String index(){
        return "<h1>Wellcome to StoreApi<h1><h2>We are glad to serve you</h2> <p>waithing for your request</p>";
    }

    //return All
    @GetMapping("/stores")
    private List<Store> returAll(){
        return repo.findAll();
    }

    //Return one store
    @GetMapping("/stores/{id}")
    private Store returnOne(@PathVariable("id") Integer id){
        return repo.findById(id)
                .orElseThrow(()-> new StoreNotFoundException(id));
    }

    //create one store
    @PostMapping("/stores")
    private Store newStore(@RequestBody Store newStore){
        return repo.save(newStore);
    }

    //Update a store
    @PutMapping("/stores/{id}")
    private String updateStore(@PathVariable("id") Integer id, @RequestBody Store store){
        Optional<Store> dbStore = repo.findById(id);
        if (dbStore.isPresent()){
            Store editing = dbStore.get();
            editing.setMarket(store.getMarket());
            editing.setDescription(store.getDescription());
            editing.setDistance(store.getDistance());
            editing.setProduct(store.getProduct());
            editing.setRated(store.getRated());
            editing.setProductsFind(store.getProductsFind());
            editing.setProductsTotal(store.getProductsTotal());
            editing.setPrice(store.getPrice());
            editing.setItemsCart(store.getItemsCart());
            editing.setImage(store.getImage());
            repo.save(editing);
            return "saved";
        }else {
            return "the id is not valid";
        }
    }

    //delete a store
    @DeleteMapping("/stores/{id}")
    private String deleteStore(@PathVariable("id") Integer id){
        repo.deleteById(id);
        return "the store " + id + " was deleted";
    }

    //delete all
    @DeleteMapping("/stores/all/{pass}")
    private String deleteAllStore(@PathVariable("pass") String pass){
        if (pass.equals("19570744dapt4all$")){
            repo.deleteAll();
            return "All stores was deleted";
        }
        return "you dont have the password";
    }

}
