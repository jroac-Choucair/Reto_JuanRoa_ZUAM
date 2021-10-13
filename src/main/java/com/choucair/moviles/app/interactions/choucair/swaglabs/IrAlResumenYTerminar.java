package com.choucair.moviles.app.interactions.choucair.swaglabs;

import com.choucair.moviles.app.interactions.choucair.Espera;
import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.choucair.moviles.app.ui.CompraUI.BTN_TERMINAR;

public class IrAlResumenYTerminar implements Interaction{

    public static IrAlResumenYTerminar compra(){return Tasks.instrumented(IrAlResumenYTerminar.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Espera.explicita(3000),
                Scroll.untilVisibleTarget(BTN_TERMINAR),
                Click.on(BTN_TERMINAR),
                TakeScreenshot.asEvidence()
        );

    }
}