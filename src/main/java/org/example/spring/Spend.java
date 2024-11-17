package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Spend {

    private DB db;

//    @Autowired
    Spend(DB db) {
        this.db = db;
    }
//    @Autowired
//    public void setDB(DB db) {
//        this.db = db;
//    }
    public DB getDB() {
        return db;
    }

    public boolean buy_icecream() {
        Wallet w = new Wallet("Icecream", 1000);
        db.save(w);
        return true;
    }

}

