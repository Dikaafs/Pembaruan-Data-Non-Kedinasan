package starter.stepdefinition.DataPribadi;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import starter.pages.MyProfile.DataKaryawan.DataPribadiPage;

public class UploadKTP {
    @Steps
    DataPribadiPage dataPribadiPage;

    @And("user mengunggah KTP")
    public void uploadKTP(){
        dataPribadiPage.UploadKTP();
    }
    //Negative Case
    @And("user mengunggah KTP dengan size lebih dari 5mb")
    public void KTPmelebihi5mb(){
        dataPribadiPage.UploadKTP();
    }
}
