package starter.pages.MyProfile.DataKaryawan;

import io.cucumber.java.bs.A;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.codehaus.groovy.transform.sc.transformers.RangeExpressionTransformer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataPribadiPage extends PageObject {

    private By clickDataKaryawan(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/div/div/div/div[3]/nav/div/div/ul/li[2]/a/div");
    }
    private By PerbaruiData(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[1]/div/div[3]/button");
    }
    private By UbahData(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[1]/div/div/div[3]/div[1]/button");
    }
    private By FieldNoKTP(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[4]/div/div/input");
    }
    private By WarningMessageKTP(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[1]/div/small");
    }
    private By uploadKTP(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[2]/div/div/div/div/span");
    }
    private By NamaLengkap(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[4]/div/div/input");
    }
    private By FieldJenisKelamin(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[7]/div/div/div/div/div[1]/div[2]");
    }
    private By JenisKelamin1(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[7]/div/div/div/div/div[1]/div[1]");
    }
    private By FieldTanggalLahir(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[5]/div/div/input");
    }
    private By BulanLahir(){
        return By.xpath("/html/body/div[4]/div[1]/div/div/select/option[3]");
    }
    private By TahunLahir(){
        return By.xpath("/html/body/div[4]/div[1]/div/div/div/input");
    }
    private By TanggalLahir(){
        return By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/span[25]");
    }
    private By FieldGolonganDarah(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[10]/div/div/div/div/div[2]/div/svg");
    }
    private By GolonganDarah(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[10]/div/div/div/div/div[1]/div[1]");
    }
    private By NomorBPJS(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[14]/div/div/input");
    }
    private By FieldAgama(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[9]/div/div/div/div/div[2]/div");
    }
    private By AgamaPilihan(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[9]/div/div/div/div/div[1]/div[1]");
    }
    private By InputKotaLahir(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[6]/div/div/input");
    }
    private By FieldSuku(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[8]/div/div/input");
    }
    private By NomorNPWP(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[12]/div/div/input");
    }
    private By UploadNPWP(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[13]/div/div/div/div/span");
    }
    private By AkteLahir(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[3]/div/div/div/div/span");
    }
    private By KartuBPJS(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[15]/div/div/div/div/span");
    }
    private By PasFoto(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[11]/div/div/div/div/span");
    }
    private By simpanDraft(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[16]/button");
    }
    private By PembaruanBerhasil(){
        return By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[2]");
    }
    private By ProgressStatus(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[4]/div[2]/div/ul/li[1]/div/div[2]");
    }
    @Step
    public void ClickDataKaryawan(){
        waitForCondition();
        $(clickDataKaryawan()).click();
    }
    @Step
    public void ClickPerbaruiData(){
        $(PerbaruiData()).click();
    }
    @Step
    public void ClickUbahData(){
        waitForCondition();
        $(UbahData()).click();
    }
    @Step
    public void InputNoKTP(String noktp){
        $(FieldNoKTP()).type(noktp);
    }
    @Step
    public boolean ValidateWarningMessageKTP(){
        return $(WarningMessageKTP()).isDisplayed();
    }
    @Step
    public void UploadKTP(){
        WebElement uploadElement = $(uploadKTP());
        uploadElement.sendKeys("C:/Users/yudika/(UPLOAD DI PATH INI");
        $(uploadKTP()).click();
    }
    @Step
    public void InputNamaLengkap(String nama){
        $(NamaLengkap()).type(nama);
    }
    @Step
    public void ClickFieldJenisKelamin(){
        $(FieldJenisKelamin()).click();
    }
    @Step
    public void jenisKelamin1(){
        $(JenisKelamin1()).click();
    }
    @Step
    public void ClickFieldTglLahir(){
        $(FieldTanggalLahir()).click();
    }
    @Step
    public void MemilihBulanLahir(){
        $(BulanLahir()).click();
    }
    @Step
    public void MemilihTahunLahir(String tahun){
        $(TahunLahir()).type(tahun);
    }
    @Step
    public void MemilihTanggalLahir(){
        $(TanggalLahir()).click();
    }
    @Step
    public void ClickFieldGolonganDarah(){
        $(FieldGolonganDarah()).click();
    }
    @Step
    public void memilihGolonganDarah(){
        $(GolonganDarah()).click();
    }
    @Step
    public void InputNoBPJS(String bpjs){
        $(NomorBPJS()).type(bpjs);
    }
    @Step
    public void UploadKartuBPJS(){
        WebElement uploadElement = $(KartuBPJS());
        uploadElement.sendKeys("C:/Users/yudika/(UPLOAD DI PATH INI");
        $(KartuBPJS()).click();
    }
    @Step
    public void ClickFieldAgama(){
        $(FieldAgama()).click();
    }
    @Step
    public void ClickAgamaPilihan(){
        $(AgamaPilihan()).click();
    }
    @Step
    public void inputkotalahir(String kota){
        waitForCondition();
        $(InputKotaLahir()).type(kota);
    }
    @Step
    public void inputSuku(String suku){
        $(FieldSuku()).type(suku);
    }
    @Step
    public void InputNoNPWP(String npwp){
        $(NomorNPWP()).type(npwp);
    }
    @Step
    public void uploadNpwp(){
        WebElement uploadElement = $(UploadNPWP());
        uploadElement.sendKeys("C:/Users/yudika/(UPLOAD DI PATH INI");
        $(UploadNPWP()).click();
    }
    @Step
    public void uploadPasFoto(){
        WebElement uploadElement = $(PasFoto());
        uploadElement.sendKeys("C:/Users/yudika/(UPLOAD DI PATH INI");
        $(PasFoto()).click();
    }
    public void UploadAkteLahir(){
        WebElement uploadElement = $(AkteLahir());
        uploadElement.sendKeys("C:/Users/yudika/(UPLOAD DI PATH INI");
        $(AkteLahir()).click();
    }
    @Step
    public void clickSimpanSebagaiDraft(){
        waitForCondition();
        $(simpanDraft()).click();
    }
    @Step
    public boolean ValidatePembaruanBerhasil(){
        return $(PembaruanBerhasil()).waitUntilVisible().isDisplayed();
    }
    @Step
    public boolean ValidateProsesPembaruan(){
        waitForRenderedElementsToBePresent(ProgressStatus());
        return $(ProgressStatus()).isDisplayed();
    }
    // Negative case
    @Step
    public void inputBPJShuruf(String bpjs){
        $(NomorBPJS()).type(bpjs);
    }
    @Step
    public void menginputAgamaTidakTersedia(String Agama){
        $(FieldAgama()).type(Agama);
    }
    @Step
    public void GolonganDarahTidakTersedia(String Goldar){
        $(GolonganDarah()).type(Goldar);
    }
    @Step
    public void JenisKelaminTidakTersedia(String JK){
        $(FieldJenisKelamin()).type(JK);
    }
}
