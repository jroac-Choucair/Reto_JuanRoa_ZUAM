package com.choucair.moviles.app.interactions.choucair.swaglabs;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Scroll {

    private Scroll() {
        throw new IllegalStateException("Interactua con la clase");
    }

    public static Performable untilTargetPosition(Target target) {
        return instrumented(UntilTargetPosition.class, target);
    }

    public static Performable untilVisibleTarget(Target target) {
        return instrumented(ScrollVisible.class, target);
    }
}
