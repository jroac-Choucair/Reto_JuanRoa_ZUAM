package com.choucair.moviles.app.interactions.choucair.swaglabs;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.choucair.moviles.app.ui.ArticluloUI.BTN_AGREGAR_AL_CARRITO;
import static com.choucair.moviles.app.ui.ArticluloUI.LBL_NOMBRE_PRODUCTO;

public class AgregarArticulo implements Interaction {

    String nombreArticulo;

    public AgregarArticulo(String nombreArticulo){
        this.nombreArticulo = nombreArticulo;
    }

    public static AgregarArticulo visible(String nombreArticulo){
        return Tasks.instrumented(AgregarArticulo.class, nombreArticulo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            Scroll.untilTargetPosition(LBL_NOMBRE_PRODUCTO.of(nombreArticulo)),
            Click.on(LBL_NOMBRE_PRODUCTO.of(nombreArticulo)),
            Scroll.untilVisibleTarget(BTN_AGREGAR_AL_CARRITO),
            Click.on(BTN_AGREGAR_AL_CARRITO)
        );
    }
}