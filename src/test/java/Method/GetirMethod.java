package Method;

import io.appium.java_client.MobileElement;
import org.apache.tools.ant.taskdefs.Get;
import org.openqa.selenium.By;
import objectRepo.*;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.util.List;


public class GetirMethod extends AbstractTest{



    public void initializeTest() throws MalformedURLException {
    initializeTest2();
    }

    public void login(String username, String password) throws InterruptedException {
        untilElementAppear(objectRepo.userNameInput);
        sendKeys(objectRepo.userNameInput,username);
        untilElementAppear(objectRepo.passwordInput);
        sendKeys(objectRepo.passwordInput,password);
        click(objectRepo.loginButton);
    }


    public void categorySelect(String category) throws InterruptedException {
        untilElementAppear(By.cssSelector("[text='"+category+"']"));
        click(By.cssSelector("[text='"+category+"']"));
    }

    public void sepeteUrunEkle(int urun1, int urun2) throws InterruptedException {
        untilElementAppear(objectRepo.productAdd);
        List<MobileElement> elementList = findElements(objectRepo.productAdd);
        for (int i=0; i<urun2; i++) {
            elementList.get(urun1-1).click();
        }
    }

    public void urunSayisiDoğrulama(int product,String urunSayisi) {
        untilElementAppear(objectRepo.productCount);
        List<MobileElement> elementList = findElements(objectRepo.productCount);
        String urunSayisi2 = elementList.get(product-1).getText();
        Assert.assertEquals(urunSayisi,urunSayisi2);
    }

    public void backToButton() throws InterruptedException {
        click(objectRepo.backButton);
    }

    public void goToBasket() throws InterruptedException {
        untilElementAppear(objectRepo.basketButton);
        click(objectRepo.basketButton);
    }

    public void removeProducts() throws InterruptedException {
        while(isElementExist(objectRepo.removeButton,3)){
            click(objectRepo.removeButton);
        }
    }

    public void basketConfirmedEmty() {
        boolean durum = false;
        if(!isElementExist(objectRepo.basketVerify,4)){
            durum=true;
            Assert.assertTrue(durum);
        }else {
            Assert.assertTrue(durum);
        }
    }

    public void sepetBos() throws InterruptedException {
       goToBasket();
       if(isElementExist(objectRepo.removeButton,3)){
           removeProducts();
       }
        basketConfirmedEmty();
       backToButton();
    }

    public void increaseProduct() {
        List<MobileElement> elementList = findElements(objectRepo.removeButton);
        for (int i=0; i<elementList.size();i++){
            elementList.get(i).click();
        }
    }
}
