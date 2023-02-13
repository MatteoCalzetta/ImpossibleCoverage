package com.example.coverageimpossibile;

public class ImpossibleCoverage {
    public static void main(String[] args){}

    public Boolean isOSMacOS(){
        Computer computer = new Computer();
        if(computer.getOS().equals("Windows")){
            return false;
        }
        return true;
    }

}
