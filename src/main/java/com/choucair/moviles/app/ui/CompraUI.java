package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class CompraUI {

    public static final Target BTN_CARRO_COMPRAS = Target.the("Boton carrito de compras").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Carrito\"]/android.view.ViewGroup"));
    public static final Target BTN_CHECKOUT = Target.the("Boton checkout").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]/android.widget.TextView"));
    public static final Target TXT_NOMBRE = Target.the("Campo nombre").located(MobileBy.xpath("//android.widget.EditText[@content-desc=\"test-Nombre\"]"));
    public static final Target TXT_APELLIDO = Target.the("Campo apellido").located(MobileBy.xpath("//android.widget.EditText[@content-desc=\"test-Apellido\"]"));
    public static final Target TXT_CODIGO_POSTAL = Target.the("Campo codigo postal").located(MobileBy.xpath("//android.widget.EditText[@content-desc=\"test-Código postal\"]\n"));
    public static final Target BTN_CONTINUAR = Target.the("Boton continuar").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUAR\"]\n"));
    public static final Target BTN_TERMINAR = Target.the("Boton terminar").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-TERMINAR\"]"));
    public static final Target LBL_CONFIRMACION = Target.the("Mensaje de verificación").located(MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETADO!\"]/android.view.ViewGroup/android.widget.TextView[1]"));
}
