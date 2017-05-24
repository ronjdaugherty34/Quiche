package com.gocaptain.ronalddaugherty.quiche.model;
import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by ronalddaugherty on 5/23/17.
 */
@IgnoreExtraProperties
public class User {

    public String name;
    public String email;

    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
