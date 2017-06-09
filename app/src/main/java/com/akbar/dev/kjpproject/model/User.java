package com.akbar.dev.kjpproject.model;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by akbar on 06/06/17.
 */

@IgnoreExtraProperties
public class User {
    public String name;
    public String email;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
