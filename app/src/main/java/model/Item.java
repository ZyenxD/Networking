package model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ney Casilla on 8/5/2017.
 * clase de items
 */

public class Item {
    @SerializedName("label")
    public String label;
    @SerializedName("description")
    public String description;
    @SerializedName("priority")
    public int priority;

    @Override
    public String toString() {
        return "Item{" +
                "label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}
