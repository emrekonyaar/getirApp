package Steps;

import Method.GetirMethod;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.net.MalformedURLException;


public class Steps {

    GetirMethod getirMethod = new GetirMethod();

    @Given("^Navigate to the MobileApp$")
    public void navigeToTheMobileApp() throws MalformedURLException {
        getirMethod.initializeTest();
    }

    @Then("^Username \"([^\"]*)\" password \"([^\"]*)\" Login$")
    public void usernamePasswordLogin(String username, String password) throws Throwable {
        getirMethod.login(username,password);

    }

    @Then("^\"([^\"]*)\" category selected$")
    public void categorySelected(String category) throws Throwable {
        getirMethod.categorySelect(category);
    }

    @Then("^\"([^\"]*)\" 'inci üründen \"([^\"]*)\" tane sepete ekleyelim$")
    public void inciÜründenTaneSepeteEkleyelim(int product, int productCount) throws Throwable {
        getirMethod.sepeteUrunEkle(product,productCount);
    }

    @Then("^\"([^\"]*)\"\\. product \"([^\"]*)\" Addition Verifed$")
    public void productAdditionVerifed(int product, String urunSayisi) throws Throwable {
        getirMethod.urunSayisiDoğrulama(product,urunSayisi);
    }

    @Then("^Back To Button$")
    public void backToButton() throws InterruptedException {
        getirMethod.backToButton();
    }

    @Then("^Go To Basket$")
    public void goToBasket() throws InterruptedException {
        getirMethod.goToBasket();
    }

    @Then("^Remove Products$")
    public void removeProducts() throws InterruptedException {
        getirMethod.removeProducts();
    }

    @Then("^Basket Confirmed Empty$")
    public void basketConfirmedEmpty() {
        getirMethod.basketConfirmedEmty();
    }

    @Then("^Basket Null Product$")
    public void basketNullProduct() throws InterruptedException {
        getirMethod.sepetBos();
    }

    @Then("^increase all products by$")
    public void increaseAllProductsBy() throws Throwable {
        getirMethod.increaseProduct();
    }
}
