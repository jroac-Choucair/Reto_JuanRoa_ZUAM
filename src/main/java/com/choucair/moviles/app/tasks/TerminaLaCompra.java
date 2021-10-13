package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.choucair.swaglabs.CargarInformacionYCheckout;
import com.choucair.moviles.app.interactions.choucair.swaglabs.IrAlCarritoYCheckout;
import com.choucair.moviles.app.interactions.choucair.swaglabs.IrAlResumenYTerminar;

import com.choucair.moviles.app.models.Usuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static com.choucair.moviles.app.ui.CompraUI.*;

public class TerminaLaCompra implements Task {

    Usuario usuario;

    public TerminaLaCompra(Usuario usuario) { this.usuario = usuario;}

    public static TerminaLaCompra exitosamente(Usuario datosUsuario){ return Tasks.instrumented(TerminaLaCompra.class,datosUsuario); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IrAlCarritoYCheckout.exitoso(),
                Enter.theValue(usuario.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(usuario.getApellido()).into(TXT_APELLIDO),
                Enter.theValue(usuario.getCodpostal()).into(TXT_CODIGO_POSTAL),
                CargarInformacionYCheckout.exitoso(),
                IrAlResumenYTerminar.compra()
        );
    }
}