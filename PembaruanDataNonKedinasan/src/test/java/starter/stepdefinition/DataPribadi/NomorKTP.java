package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

public class NomorKTP {

    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user menginput nomor ktp valid")
    public void inputNomorKTP(){
        dataPribadiPage.InputNoKTP();
    }
    @Then("nomor KTP valid dapat terinput")
    public void NoKTPvalidDapatTerinput(){

    }

    //Negative case 1
    @And("user menginput nomor ktp dengan huruf")
    public void inputNomorKTPhuruf(){
        dataPribadiPage.InputNoKTPInvalid();
    }


    //Negative Case 2
    @And("user menginput nomor ktp lebih dari 16")
    public void noKTPmoreThan16(){
        dataPribadiPage.InputNoKTPMoreThan16("31720281274339829222");
    }
    @Then("KTP tidak dapat diinput melebihi 16 angka")
    public void TidakDapatMelebihi16Angka(){

    }

    //Negative Case 2
    @And("user tidak mengisi field nomor KTP")
    public void fieldKTPKosong(){
        dataPribadiPage.InputNoKTP();
    }
    @Then("pesan peringatan muncul bahwa nomor KTP tidak boleh kosong")
    public void pesanPeringatanFieldKTPtidakBolehKosong(){
        Assertions.assertTrue(dataPribadiPage.ValidateWarningMessageKTP());
    }
}
