package network;

import com.google.gson.annotations.SerializedName;

import java.text.Normalizer;

import model.Form;

/**
 * Created by Ney Casilla on 8/5/2017.
 *
 */

public class FormResponse {
    @SerializedName("message")
    public String message;
    @SerializedName("form")
    public Form form;

    @Override
    public String toString() {
        return "FormResponse{" +
                "message='" + message + '\'' +
                ", form=" + form +
                '}';
    }
}
