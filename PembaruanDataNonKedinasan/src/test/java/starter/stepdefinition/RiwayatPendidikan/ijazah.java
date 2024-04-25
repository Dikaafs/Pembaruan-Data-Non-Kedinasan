package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class ijazah {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;


    @And("user menginput ijazah")
    public void uploadIjazah(){
        riwayatPendidikanPage.UploadIjazah();
    }
    //Negative Case
    @And("user mengunggah file ijazah melebihi size batas maximum")
    public void uploadIjazahMorethan5MB(){
        riwayatPendidikanPage.UploadIjazah();
    }
    @Then("pesan error muncul bahwa ukuran tidak boleh melebihi 5mb")
    public void pesanErrorIjazah(){

    }
}
