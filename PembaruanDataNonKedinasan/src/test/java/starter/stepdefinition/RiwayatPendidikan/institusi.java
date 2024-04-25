package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class institusi {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;

    @And("user menginput institusi")
    public void InputInstitusi(){
        riwayatPendidikanPage.inputInstitusi("Universitas Padjajaran");
    }

    //Negative Case
    @And("user menginput institusi dengan karakter spesial")
    public void inputInstitusi(){
        riwayatPendidikanPage.inputInstitusi("Institut Teknologi Bandung.");
    }
}
