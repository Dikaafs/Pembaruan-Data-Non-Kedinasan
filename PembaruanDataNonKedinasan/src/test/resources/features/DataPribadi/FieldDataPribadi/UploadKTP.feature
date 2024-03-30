Feature: Upload KTP
  sebagai user saya ingin mengupload lampiran KTP
  sehingga KTP saya dapat terupload pada field KTP

  Background:
    Given user berada di halaman login
    When user memasukan NIK
    And user memasukan password
    And user click sign button
    Then user diarahkan ke dashboard page
    And user skip welcome pop up
    And user click My Profile
    And user click data karyawan
    And user click perbarui data
    And user click ubah data

  @UploadKTP
  Scenario: sebagai user saya dapat mengunggah KTP
    And user mengunggah KTP
    And user click simpan sebagai draft
    Then status progress berubah menjadi draft

  @UploadKTPnegative
  Scenario: sebagai user saya tidak dapat mengunggah KTP dengan size lebih dari 5mb
    And user mengunggah KTP dengan size lebih dari 5mb
    And user click simpan sebagai draft
    Then pop up peringatan ditampilkan bahwa file tidak boleh melebihi max size





