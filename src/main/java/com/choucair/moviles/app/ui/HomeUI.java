package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target BTN_LISTAR = Target.the("Boton listar productos").located(MobileBy.AccessibilityId("test-Alternar"));
}
