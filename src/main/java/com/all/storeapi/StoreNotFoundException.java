package com.all.storeapi;

public class StoreNotFoundException extends RuntimeException {
    public StoreNotFoundException(Integer id) {
        super("Not found store " + id);
    }
}
