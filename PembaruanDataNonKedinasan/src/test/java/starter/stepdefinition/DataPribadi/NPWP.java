package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

public class NPWP {
    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user menginput nomor NPWP")
    public void InputNomorNPWP(){
        dataPribadiPage.InputNoNPWP("43502210201");
    }

    //Negative Case
    @And("user menginput nomor npwp yang berisikan huruf")
    public void inputNPWPberisikanHuruf(){
        dataPribadiPage.InputNoNPWP("43502210201q");
    }
}
