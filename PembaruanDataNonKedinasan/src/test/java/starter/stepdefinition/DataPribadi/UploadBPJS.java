package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

public class UploadBPJS {
    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user mengunggah kartu bpjs")
    public void uploadKartuBPJS(){
        dataPribadiPage.UploadKartuBPJS();
    }

    //Negative Case
    @And("user mengunggah kartu bpjs dengan size lebih dari batas maximal")
    public void KartuBpjsMelebihi5mb(){
        dataPribadiPage.Upload5mb();
    }
}
