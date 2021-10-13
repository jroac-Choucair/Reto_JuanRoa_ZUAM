package com.choucair.moviles.app.questions;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.moviles.app.ui.CompraUI.LBL_CONFIRMACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class QuestionCompraExitosa implements Question<String> {


    public QuestionCompraExitosa(){}

    public static QuestionCompraExitosa mensajeExitoso(){ return new QuestionCompraExitosa(); }


    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(LBL_CONFIRMACION, isPresent()).forNoMoreThan(15).seconds(),
                TakeScreenshot.asEvidence());
        return Text.of(LBL_CONFIRMACION).viewedBy(actor).asString();
    }
}
