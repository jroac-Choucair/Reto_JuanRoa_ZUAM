package com.choucair.moviles.app.interactions.choucair.swaglabs;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.choucair.moviles.app.ui.CompraUI.BTN_CARRO_COMPRAS;
import static com.choucair.moviles.app.ui.CompraUI.BTN_CHECKOUT;

public class IrAlCarritoYCheckout implements Interaction {

    public static IrAlCarritoYCheckout exitoso(){return Tasks.instrumented(IrAlCarritoYCheckout.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Click.on(BTN_CARRO_COMPRAS),
        Click.on(BTN_CHECKOUT)
        );
    }
}