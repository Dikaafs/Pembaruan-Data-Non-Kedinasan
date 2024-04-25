package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.Dashboard.DashboardPage;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

public class NamaLenkgap {

    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user menginput nama lengkap")
    public void inputNamaLengkap(){
        dataPribadiPage.InputNamaLengkap("WULANDARI");
    }

    //Negative case 1
    @And("user menginput nama lengkap dengan angka")
    public void InputInvalidNamaLengkap(){
        dataPribadiPage.InputNamaLengkap("WULANDARI2");
    }
    @Then("pesan peringatan muncul bahwa nama lengkap tidak dapat diisi dengan angka")
    public void pesanPeringatanTanpaAngka(){

    }
    //Negative Case 2
    @And("user menginput nama lengkap dengan simbol")
    public void inputNamaLengkapSimbol(){
        dataPribadiPage.InputNamaLengkap("WULNDARI;");
    }
    @Then("pesan peringatan muncul bahwa nama lengkap tidak dapat diisi dengan simbol")
    public void pesanPeringatanTanpaSimbol(){

    }
}
