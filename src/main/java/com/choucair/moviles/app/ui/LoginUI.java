package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUI {

    public static final Target TXT_USUARIO = Target.the("Campo de texto usuario").located(MobileBy.AccessibilityId("test-Usuario"));
    public static final Target TXT_CONTRASENA = Target.the("Campo de texto contraseña").located(MobileBy.AccessibilityId("test-Contraseña"));
    public static final Target BTN_LOGIN = Target.the("Boton de login").located(MobileBy.AccessibilityId("test-LOGIN"));
}
