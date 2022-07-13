package co.com.staging.zapatoca.miaguila.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarPage {

    public static final Target TXT_NAME =
            Target.the("Name text box").locatedBy("//label[contains (text(),'Nombre')]/following-sibling::div//input");
    public static final Target TXT_FIRST_SURNAME =
            Target.the("First Surname text box").locatedBy("//label[contains (text(),'Primer Apellido')]/following-sibling::div//input");
    public static final Target TXT_SECOND_SURNAME =
            Target.the("Second Surname text box").locatedBy("//label[contains (text(),'Segundo Apellido')]/following-sibling::div//input");
    public static final Target LST_DOCUMENT_TYPE =
            Target.the("List of document types").locatedBy("//label[contains (text(),'Tipo de documento')]/following-sibling::div//select");
    public static final Target TXT_DOCUMENT_NUMBER =
            Target.the("Document number text box").locatedBy("//input[@type='number']");
    public static final Target TXT_EMAIL =
            Target.the("Email text box").locatedBy("//input[@type='email']");
    public static final Target TXT_PHONE =
            Target.the("Phone text box").locatedBy("//input[@type='phone']");
    public static final Target TXT_PASSWORD =
            Target.the("Password text box").locatedBy("//label[contains (text(),'Contraseña')]/following-sibling::div//input");
    public static final Target TXT_CONFIRM_PASSWORD =
            Target.the("Phone text box").locatedBy("//label[contains (text(),'Confirmar contraseña')]/following-sibling::div//input");
    public static final Target CHECK_ACCEPT_CONDITIONS =
            Target.the("Accept conditions checkbox").located(By.className("checkbox-input"));
    public static final Target CHECK_CAPTCHA =
            Target.the("Captcha checkbox").located(By.id("recaptcha-anchor"));
    public static final Target BTN_CREATE_ACCOUNT =
            Target.the("Create account button").locatedBy("//span[contains (text(),'Crear Cuenta')]");

    private RegistrarPage() {
    }
}
