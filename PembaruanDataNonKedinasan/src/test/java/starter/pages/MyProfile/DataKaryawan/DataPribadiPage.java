package starter.pages.MyProfile.DataKaryawan;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
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
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[1]/div/div/input");
    }
    private By WarningMessageKTP(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[2]/div/div/div/div[1]/div/small");
    }
    private By btnUploadKTP(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[2]/div/div/div/div/span");
    }
    private By uploadKTP(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[2]/div/div/div/input");
    }
    private By NamaLengkap(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[4]/div/div/input");
    }
    private By FieldJenisKelamin(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[7]/div/div/div/div/div[1]/div[2]/input");
    }
    private By FieldTanggalLahir(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[5]/div/div/input");
    }
    private By ClickBulanLahir(){
        return By.xpath("/html/body/div[2]/div[1]/div/div/select");
    }
    private By BulanLahir(){
        return By.xpath("/html/body/div[2]/div[1]/div/div/select/option[4]");
    }
    private By ClickTahunLahir(){
        return By.xpath("/html/body/div[2]/div[1]/div/div/div/input");
    }
    private By TahunLahir(){
        return By.xpath("/html/body/div[2]/div[1]/div/div/div/input");
    }
    private By TanggalLahir(){
        return By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/span[15]");
    }
    private By FieldGolonganDarah(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[10]/div/div/div/div/div[1]");
    }
    private By GolonganDarah(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[10]/div/div/div/div/div[1]/div[2]/input");
    }
    private By NomorBPJS(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[14]/div/div/input");
    }
    private By FieldAgama(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[9]/div/div/div/div/div[2]/div");
    }
    private By AgamaPilihan(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[9]/div/div/div/div/div[1]/div[2]/input");
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
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[13]/div/div/div/input");
    }
    private By AkteLahir(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[3]/div/div/div/input");
    }
    private By KartuBPJS(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[15]/div/div/div/input");
    }
    private By PasFoto(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[11]/div/div/div/input");
    }
    private By PopUpAllert(){
        return By.xpath("/html/body/div[1]/div[2]/div/div/div[1]");
    }
    private By simpanDraft(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[3]/div/div/div/div[16]/button");
    }
    private By Submit(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[1]/div/div/div[3]/div[1]/button");
    }
    private By PembaruanBerhasil(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[1]/div/div/span[1]/div/span");
    }
    private By ProgressStatus(){
        return By.xpath("/html/body/div[1]/div[1]/div[2]/div[4]/div/section/div/div[2]/div[2]/div[4]/div[2]/div/ul/li[1]/div/div[1]/span");
    }
    @Step
    public void ClickDataKaryawan(){
        waitForCondition();
        $(clickDataKaryawan()).isDisplayed();
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
    public void InputNoKTP(){
        $(FieldNoKTP()).clear();
        WebElement noktpvalid = $(FieldNoKTP());
        noktpvalid.sendKeys("327310000000000001");
    }
    @Step
    public void InputNoKTPInvalid(){
        WebElement NumericField = $(FieldNoKTP());
        NumericField.sendKeys("3172021431113312e");
    }
    @Step
    public void InputNoKTPMoreThan16(String ktpMoreThan16){
        $(FieldNoKTP()).clear();
        $(FieldNoKTP()).type(ktpMoreThan16);
    }
    @Step
    public boolean ValidateWarningMessageKTP(){
        return $(WarningMessageKTP()).isDisplayed();
    }
    @Step
    public void Uploadktp(){
        WebElement uploadElement = $(uploadKTP());
        uploadElement.sendKeys("C:/Users/yudika/BU WULAN KTP.pdf");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void Upload5mb(){
        WebElement uploadElement = $(uploadKTP());
        uploadElement.sendKeys("C:/Users/yudika/ForTest.png");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
    public void jenisKelamin(String jk){
        $(FieldJenisKelamin()).typeAndEnter(jk);
    }
    @Step
    public void InvalidJenisKelamin(String jk){
        $(FieldJenisKelamin()).type(jk);
    }
    @Step
    public void ClickFieldTglLahir(){
        $(FieldTanggalLahir()).click();
    }
    @Step
    public void ClickBulan(){
        $(ClickBulanLahir()).click();
    }
    @Step
    public void MemilihBulanLahir(){
        $(BulanLahir()).click();
    }
    @Step
    public void ClickTahun(){
        $(ClickTahunLahir()).click();
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
    public void memilihGolonganDarah(String GolDar){
        $(GolonganDarah()).typeAndEnter(GolDar);
    }
    @Step
    public void InputNoBPJS(String bpjs){
        $(NomorBPJS()).type(bpjs);
    }
    @Step
    public void UploadKartuBPJS(){
        WebElement uploadElement = $(KartuBPJS());
        uploadElement.sendKeys("C:/Users/yudika/bpjs sampel.jpeg");
    }
    @Step
    public void ClickFieldAgama(){
        $(FieldAgama()).click();
    }
    @Step
    public void ClickAgamaPilihan(String Agama){
        $(AgamaPilihan()).typeAndEnter(Agama);
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
        $(NomorNPWP()).clear();
        $(NomorNPWP()).type(npwp);
    }
    @Step
    public void uploadNpwp(){
        WebElement uploadElement = $(UploadNPWP());
        uploadElement.sendKeys("C:/Users/yudika/npwpcontoh.jpeg");
    }
    @Step
    public void uploadPasFoto(){
        WebElement uploadElement = $(PasFoto());
        uploadElement.sendKeys("C:/Users/yudika/pasfoto sample.jpeg");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void UploadAkteLahir(){
        WebElement uploadElement = $(AkteLahir());
        uploadElement.sendKeys("C:/Users/yudika/aktalahirbaru.jpg");
    }
    public void UploadAktaLahir5mb(){
        WebElement uploadElement = $(AkteLahir());
        uploadElement.sendKeys("C:/Users/yudika/ForTest.png");
    }
    public boolean AllertMaxSize(){
       return $(PopUpAllert()).isDisplayed();
    }
    @Step
    public void clickSimpanSebagaiDraft(){
        $(simpanDraft()).click();
        $(PembaruanBerhasil()).isDisplayed();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Step
    public void clickSubmit(){
        $(Submit()).click();
    }
    @Step
    public boolean ValidatePembaruanBerhasil(){
        return $(PembaruanBerhasil()).isDisplayed();
    }
    @Step
    public boolean ValidateProsesPembaruan(){
       return $(ProgressStatus()).isDisplayed();
    }
    // Negative case
    @Step
    public void inputBPJShuruf(String bpjs){
        $(NomorBPJS()).type(bpjs);
    }
    @Step
    public void menginputAgamaTidakTersedia(String AgamaInv){
        $(AgamaPilihan()).type(AgamaInv);
    }
    @Step
    public void GolonganDarahLainnya(String OtherGD){
        $(GolonganDarah()).type(OtherGD);
    }
    @Step
    public void JenisKelaminTidakTersedia(String JK){
        $(FieldJenisKelamin()).type(JK);
    }
}
