package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

public class NomorKTP {

    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user menginput nomor ktp valid")
    public void inputNomorKTP(){
        dataPribadiPage.InputNoKTP("3172028127433982");
    }

    //Negative case 1
    @And("user menginput nomor ktp dengan huruf")
    public void inputNomorKTPhuruf(){
        dataPribadiPage.InputNoKTP("test only");
    }
    @Then("field tidak terisi jika diinput menggunakan huruf")
    public void fieldNomorKTPTidakTerisi(){

    }

    //Negative Case 2
    @And("user menginput nomor ktp lebih dari 16")
    public void noKTPmoreThan16(){
        dataPribadiPage.InputNoKTP("31720281274339829222");
    }
    @Then("nomor yang di input tidak akan bertambah lebih dari 16 angka")
    public void nomorTidakBertambah(){

    }

    //Negative Case 2
    @And("user tidak mengisi field nomor KTP")
    public void fieldKTPKosong(){
        dataPribadiPage.InputNoKTP(" ");
    }

    @Then("pesan peringatan muncul bahwa nomor KTP tidak boleh kosong")
    public void pesanPeringatanFieldKTPtidakBolehKosong(){
        dataPribadiPage.ValidateWarningMessageKTP();
    }
}
