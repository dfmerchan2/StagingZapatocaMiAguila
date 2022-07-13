package co.com.staging.zapatoca.miaguila.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static Target LBL_HELLO =
            Target.the("Message Hello").locatedBy("(//div[@data-role='my_account_button'])[2]//span[1]");
    public static Target LST_PRODUCTS =
            Target.the("Products list").locatedBy("//div[contains (@class,'product-wrapper') and not (contains(.,'AGOTADO '))]//div[contains (@class,'name text-sm')]");
    public static Target BTN_PRODUCTS =
            Target.the("Products button").locatedBy("//div[contains (@class,'product-wrapper') and contains (.,'{0}')]//span[contains(.,'Agregar')]");
    public static Target BTN_CLOSE_ALERT =
            Target.the("Close alert button").locatedBy("//*[@class='close-icon']");
    public static Target BTN_SELECT_ADDRESS =
            Target.the("Select address button").locatedBy("//div[@class='location-description bottom-line']");
    public static Target BTN_CLOSE_SHOPPING_CART =
            Target.the("Close shopping cart button").locatedBy("//button[@class='outline-none']");
    public static Target LBL_QUANTITY_OF_PRODUCTS =
            Target.the("Close shopping cart button").locatedBy("(//button[@aria-label=\"cart\"])[2]//span");

    private HomePage() {
    }
}
