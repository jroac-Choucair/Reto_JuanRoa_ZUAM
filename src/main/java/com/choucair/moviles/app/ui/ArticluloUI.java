package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class ArticluloUI {

    public static Target LBL_NOMBRE_PRODUCTO = Target.the("Titulo nombre articulo").locatedBy("//android.widget.TextView[@text='{0}']");
    public static Target BTN_AGREGAR_AL_CARRITO = Target.the("Boton agregar al carrito").located(MobileBy.AccessibilityId("test-A\u00d1ADIR A CARRITO"));
}
