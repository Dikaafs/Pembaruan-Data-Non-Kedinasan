package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

public class Suku {
    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user menginput suku")
    public void inputSuku(){
        dataPribadiPage.inputSuku("SUNDA");
    }

    //Negative Case
    @And("user menginput suku menggunakan angka")
    public void inputSukuDenganAngka(){
        dataPribadiPage.inputSuku("JAWA21");
    }
}
