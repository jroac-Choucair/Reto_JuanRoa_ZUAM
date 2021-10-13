package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.choucair.swaglabs.CargarInformacionYCheckout;
import com.choucair.moviles.app.interactions.choucair.swaglabs.IrAlCarritoYCheckout;
import com.choucair.moviles.app.interactions.choucair.swaglabs.IrAlResumenYTerminar;

import com.choucair.moviles.app.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class TerminaLaCompra implements Task {

    Usuario usuario;

    public TerminaLaCompra(Usuario usuario) { this.usuario = usuario;}

    public static TerminaLaCompra exitosamente(Usuario datosUsuario){ return Tasks.instrumented(TerminaLaCompra.class,datosUsuario); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IrAlCarritoYCheckout.exitoso(),
                CargarInformacionYCheckout.exitoso(),
                IrAlResumenYTerminar.compra()
        );
    }
}