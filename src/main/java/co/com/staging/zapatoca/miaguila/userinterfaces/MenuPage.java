package co.com.staging.zapatoca.miaguila.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuPage {
    public static final Target MENU_BUTTON =
            Target.the("Button to activate menu").locatedBy("//*[@class='fill-current text-medium-warning']");
    public static final Target MENU_OPTION =
            Target.the("Menu option").locatedBy("(//div[contains (@class,'menu-categories')])[2]//a[normalize-space(text())='{0}'] ");


    private MenuPage() {
    }
}
