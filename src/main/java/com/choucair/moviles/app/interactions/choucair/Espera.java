package com.choucair.moviles.app.interactions.choucair;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

public class Espera implements Interaction {

    private int time;

    public Espera(int time) {
        this.time = time;
    }

    public static Espera explicita(int time) {
        return Tasks.instrumented(Espera.class, time);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
