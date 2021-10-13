package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.interactions.choucair.swaglabs.AgregarArticulo;
import com.choucair.moviles.app.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.choucair.moviles.app.ui.HomeUI.BTN_LISTAR;

public class PrepararCompra implements Task {

    Usuario usuario;

    public PrepararCompra(Usuario usuario) {this.usuario = usuario;}

    public static PrepararCompra deFormaExitosa(Usuario usuario){ return Tasks.instrumented(PrepararCompra.class, usuario);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_LISTAR),
                AgregarArticulo.visible(usuario.getProducto()),
                TakeScreenshot.asEvidence()
        );
    }
}