package com.example.firebasetest2;

import java.util.HashMap;
import java.util.Map;

public class FirebasePost {
    public String id;
    public String name;
    public Long age;
    public String gender;
    public Map<String, Boolean> stars = new HashMap<>();

    public FirebasePost(){
        // Default constructor required for calls to DataSnapshot.getValue(FirebasePost.class)
    }

    public FirebasePost(String id, String name, Long age, String gender, Map<String, Boolean> stars) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.stars = stars;
    }

//    public void setStars(String key, Boolean value) {
//        this.stars.put(key, value);
//    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("id", id);
        result.put("name", name);
        result.put("age", age);
        result.put("gender", gender);
        result.put("stars", stars);
        return result;
    }
}
