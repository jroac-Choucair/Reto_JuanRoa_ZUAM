package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.moviles.app.ui.LoginUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class RealizarLogin implements Task{

    Usuario usuario;

    public RealizarLogin(Usuario usuario) {this.usuario = usuario;}

    public static RealizarLogin exitoso(Usuario credenciales){return Tasks.instrumented(RealizarLogin.class,credenciales);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_USUARIO, isPresent()).forNoMoreThan(5).seconds(),
                Enter.theValue(usuario.getUsuario()).into(TXT_USUARIO),
                Enter.theValue(usuario.getContrasena()).into(TXT_CONTRASENA),
                Click.on(BTN_LOGIN),
                TakeScreenshot.asEvidence()
        );
    }
}