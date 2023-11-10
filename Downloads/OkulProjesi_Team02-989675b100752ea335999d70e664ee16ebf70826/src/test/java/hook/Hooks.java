package hook;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.time.Duration;


public class Hooks {

    /*
    Hooks class'i ile scenariolardan önce veya sonra çalışmasını istediğimiz kodları (örneğin scenariolardan önce
database bağlantısı gibi yada scenariolardan sonra fail olan scenarioların resmini rapora ekleme gibi) @Before
ve @After (io.cucumber) methodları ile oluşturabiliriz. Eğer Hooks class'ını farklı bir package altında oluşturmak
istersek Runner class'ındaki glue parametresine bu package'ı eklememiz gerekir. glue parametresinde stepDefinitions
package'ı yeraldığı için fazladan package oluşturmamak adına biz stepDefinitions package'ı altına Hooks class'ını
oluşturduk. Eğer sadece istediğimiz bir scenariodan önce çalışmasını istediğimiz bir kod olursa @Before notasyonuna
parametre olarak scenario'ya verdiğimiz tag'ı yazarız. Dolayısıyla sadece tag'ı belirttiğimiz @Before methodu
scenariodan önce devreye girer.
 */

    @Before("@UI")
    public void before_ui(){
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Driver.getDriver().manage().window().maximize();
    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()){
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/png","scenario_"+scenario.getName());
            Driver.closeDriver();
        }
        Driver.closeDriver();
    }

}