package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

public class BPJS {

    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user menginput nomor bpjs")
    public void InputNomorBPJS(){
        dataPribadiPage.InputNoBPJS("124435531");
    }

    //Negative case
    @And("user menginput nomor bpjs dengan huruf dan karakter spesial")
    public void InputNomorBPJSinvalid(){
        dataPribadiPage.inputBPJShuruf("244912ssar");
    }
}
