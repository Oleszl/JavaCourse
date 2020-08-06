package com.company;

public class Coin {

    public void CoinToss(){
        int randomValue = (int) (Math.random()*2);

        if (randomValue == 0) {
            System.out.println("Решка" );
        }
        else
            System.out.println("Орел");

    }
}
