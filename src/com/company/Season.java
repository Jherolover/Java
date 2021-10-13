package com.company;

import java.security.PublicKey;

public enum Season {
    SPRING("1"),
    SUMMER("1"),
    AUTUAM("3"),
    WINTER("4");
    private String code;

    Season(String code){
       this.code= code;
   }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
