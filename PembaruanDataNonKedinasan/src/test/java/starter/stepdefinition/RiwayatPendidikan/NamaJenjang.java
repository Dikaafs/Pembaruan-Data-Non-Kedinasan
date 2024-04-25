package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class NamaJenjang {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;


    @And("user menginput nama jenjang")
    public void inputNamaJenjangValid(){
        riwayatPendidikanPage.InputNamaJenjang("S1");
    }

    //Negative Case
    @And("user menginput nama jenjang pendidikan dengan karakter spesial")
    public void inputNamaJenjangInvalid(){
        riwayatPendidikanPage.InputNamaJenjang("S1_");
    }
}
