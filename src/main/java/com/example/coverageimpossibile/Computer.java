package com.example.coverageimpossibile;

public class Computer {
    private String OS;

    public Computer(){
        if(System.getProperties().contains("Windows")){
            this.OS = "Windows";
        } else{
            this.OS = "MacOS";
        }
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
}
