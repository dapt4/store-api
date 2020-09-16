package com.all.storeapi.repository;

import com.all.storeapi.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Integer> {
    //done
}
