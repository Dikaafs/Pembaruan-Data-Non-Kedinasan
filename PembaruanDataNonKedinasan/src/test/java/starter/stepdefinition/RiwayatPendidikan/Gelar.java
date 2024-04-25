package starter.stepdefinition.RiwayatPendidikan;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.RiwayatPendidikanPage;

public class Gelar {
    @Steps
    RiwayatPendidikanPage riwayatPendidikanPage;

    @And("user menginput Gelar")
    public void InputGelarValid(){
        riwayatPendidikanPage.menginputGelar("S.KOM");
    }
    //Negative Case
    @And("user menginput gelar")
    public void inputGelar(){
        riwayatPendidikanPage.menginputGelar("S.KOM2");
    }
}
