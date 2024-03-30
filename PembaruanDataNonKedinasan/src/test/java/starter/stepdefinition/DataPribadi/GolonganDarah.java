package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;

import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

public class GolonganDarah {

    @Steps
    DataPribadiPage dataPribadiPage;


    @And("user click field golongan darah")
    public void clickFieldGolonganDarah(){
        dataPribadiPage.ClickFieldGolonganDarah();
    }
    @And("user memilih golongan darah yang tersedia")
    public void memilihGolonganDarah(){
        dataPribadiPage.memilihGolonganDarah();
    }
    //Negative Case1
    @And("user memilih golongan darah yang tidak tersedia secara manual")
    public void inputGolonganDarahManual(){
        dataPribadiPage.GolonganDarahTidakTersedia("P");
    }
}
