package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class Negara {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;

    @And("user menginput Negara")
    public void InputNegaraValid(){
        riwayatPendidikanPage.InputNegara("Indonesia");
    }
    //Negative Case
    @And("user menginput negara dengan angka")
    public void inputNegaraInvalid(){
        riwayatPendidikanPage.InputNegara("Indonesia2");
    }
}
