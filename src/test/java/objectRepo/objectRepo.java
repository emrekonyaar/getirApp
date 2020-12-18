package objectRepo;

import org.openqa.selenium.By;

public class objectRepo {

    public static By userNameInput = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
    public static By passwordInput = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
    public static By loginButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button");
    public static By productListAddButton = By.cssSelector("[resource-id='com.getir.casestudy.dev:id/btnAdd']");
    public static By backButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    public static By basketButton = By.xpath("//android.widget.ImageView[@resource-id='com.getir.casestudy.dev:id/ga_toolbar_getir10GABasketButton']");
    public static By basketVerify = By.id("com.getir.casestudy.dev:id/cardChildView");
    public static By removeButton = By.xpath("//android.widget.ImageView[@resource-id='com.getir.casestudy.dev:id/btnRemove']");
    public static By productCount = By.xpath("//android.widget.TextView[@resource-id='com.getir.casestudy.dev:id/tvCount']");
    public static By productAdd = By.xpath("//android.widget.ImageView[@resource-id='com.getir.casestudy.dev:id/btnAdd']");
    public static By cardView = By.xpath("// android.widget.FrameLayout[@resource-id='com.getir.casestudy.dev:id/cardView']");
}
