package com.iflyer.domain;

import com.iflyer.common.Constants;
import com.iflyer.common.base.BaseModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;



@Document(collection = "user")
public class User{
    public String id;
    public String name;

    public User() {

    }
    @PersistenceConstructor
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
