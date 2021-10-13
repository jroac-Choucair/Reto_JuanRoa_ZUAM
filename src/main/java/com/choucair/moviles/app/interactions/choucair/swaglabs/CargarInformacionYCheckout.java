package com.choucair.moviles.app.interactions.choucair.swaglabs;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.choucair.moviles.app.ui.CompraUI.*;
import static com.choucair.moviles.app.ui.CompraUI.BTN_CONTINUAR;

public class CargarInformacionYCheckout implements Interaction {

    public static CargarInformacionYCheckout exitoso(){return Tasks.instrumented(CargarInformacionYCheckout.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                TakeScreenshot.asEvidence(),
                Click.on(BTN_CONTINUAR)
        );
    }
}