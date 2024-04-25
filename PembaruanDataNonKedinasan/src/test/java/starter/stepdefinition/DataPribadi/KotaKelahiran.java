package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.Dashboard.DashboardPage;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;


public class KotaKelahiran {

    @Steps
    DataPribadiPage dataPribadiPage;
    @Steps
    DashboardPage dashboardPage;


    @And("user berada di dashboard page")
    public void beradaDiDashboardPage(){
        dashboardPage.validateOnTheDashboardPage();
    }
    @And("user skip welcome pop up")
    public void userSkipPopUp(){
        dashboardPage.clickPopUp();
    }
    @And("user click My Profile")
    public void userClickMyProfile(){
        dashboardPage.clickMyProfile();
    }
    @And("user diarahkan ke data karyawan")
    public void userClickDataKaryawan(){
        dataPribadiPage.ClickDataKaryawan();
    }
    @And("user click perbarui data")
    public void userClickPerbaruiData(){
        dataPribadiPage.ClickPerbaruiData();
    }
    @And("user click ubah data")
     public void ClickUbahData(){
        dataPribadiPage.ClickUbahData();
    }
    @And("user menginput kota kelahiran")
    public void inputKotaLahir(){
        dataPribadiPage.inputkotalahir("BANDUNG");
    }
    @And("user click simpan sebagai draft")
    public void ClickSimpanSebagaiDraft(){
        dataPribadiPage.clickSimpanSebagaiDraft();
    }
    @And("pembaruan kota kelahiran berhasil disimpan")
    public void pembaruanKotaBerhasil(){
        Assertions.assertTrue(dataPribadiPage.ValidatePembaruanBerhasil());
    }
    @Then("status progress berubah menjadi draft")
    public void statusProgressBerubahMenjadiDraft(){
        Assertions.assertTrue(dataPribadiPage.ValidateProsesPembaruan());
    }

    //Negative Case
    @And("user menginput kota kelahiran dengan angka")
    public void InputKotaLahirAngka(){
        dataPribadiPage.inputkotalahir("Bandung3");
    }
}
