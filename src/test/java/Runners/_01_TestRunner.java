package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"}, //buraya feature files ın path i gelir
        glue = {"StepDefinitions"}  //Step definitions ın klasör adı yazılıyor
)

public class _01_TestRunner extends AbstractTestNGCucumberTests {
    // bu class tiplerine Runner class lar denir
}


// features pathlerinin alınması : ilgili feature dosyasının üzerinde
// sağ tuş -> copypath/refenrence seçildikten sonra çıkan seçeneklerden
// "content root" seçeneği ile uygun path alınmış olur.
