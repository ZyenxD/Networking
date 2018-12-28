package model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ney Casilla on 8/5/2017.
 */

public class Form {
    @SerializedName("name")
    public String name;

    @Override
    public String toString() {
        return "Form{" +
                "name='" + name + '\'' +
                '}';
    }
}
