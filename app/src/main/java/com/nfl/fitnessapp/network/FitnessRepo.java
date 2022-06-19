package com.nfl.fitnessapp.network;

public class FitnessRepo {

    private static FitnessRepo instance = null;

    public static FitnessRepo getInstance(){
        if (instance == null){
            instance = new FitnessRepo();
        }
        return instance;
    }

}
