package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

public class Agama {

    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user click field agama")
    public void clickFieldAgama(){
        dataPribadiPage.ClickFieldAgama();
    }
    @And("user memilih agama")
    public void userMemilihAgama(){
        dataPribadiPage.ClickAgamaPilihan("HINDU");
    }

    //Negative case
    @And("user menginput agama yang tidak tersedia")
    public void menginputAgamaTidakTersedia(){
        dataPribadiPage.menginputAgamaTidakTersedia("Jewish");
    }
    @Then("pesan ditampilkan bahwa pilihan tidak tersedia")
    public void PesanPilihanTidakTersedia(){

    }
}
