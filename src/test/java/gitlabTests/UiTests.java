package gitlabTests;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Keys;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Tag("UI")
public class UiTests {

    @BeforeAll
    public static void setUp(){
        Configuration.headless = false;
    }

    @BeforeEach
    public void openPage(){
        Selenide.open("https://courier-demo.esphere.ru/");
    }
//
//    private void assertAnswer(String value){
//        $x("//input[@name='q']").sendKeys(value + "=" + Keys.ENTER);
//        String answer = $x("//span[@id='cwos']").getText();
//        Assertions.assertEquals("4", answer);
//    }

    @Test
    public void auth(){
        $("#IDToken1").setValue("CHEBIN");
        $("#IDToken2").setValue("12345678");
        $(byText("Войти")).click();
        $x("//*[@id=\"toolbar-content\"]/div[1]/section/h3").shouldHave(text("Без маршрута"));
    }

//    @Test
//    public void calcPlusTest() {
//        assertAnswer("2+2");
//    }
//
//    @Test
//    public void calcPlusTest2() {
//        assertAnswer("1+3");
//    }
//
//
//    @Test
//    public void calcMinusTest() {
//        assertAnswer("6-2");
//    }
//
//    @Test
//    public void calcMultipyTest() {
//       assertAnswer("2*2");
//    }

//    @Test
//    public void calcDevideTest() {
//        assertAnswer("8/2");
//    }
}
