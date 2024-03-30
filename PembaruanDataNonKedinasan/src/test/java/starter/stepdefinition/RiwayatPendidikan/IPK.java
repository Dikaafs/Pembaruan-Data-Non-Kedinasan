package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class IPK {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;

    @And("user menginput IPK menggunakan huruf")
    public void inputIPK(){
        riwayatPendidikanPage.inputIPK("empat");
    }
    @Then("IPK tidak akan terisi jika diinput menggunakan huruf")
    public void IPKtidakterisi(){

    }
}
