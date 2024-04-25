Feature: Pas foto
  sebagai user saya ingin mengunggah pas foto
  sehingga foto saya dapat disimpan pada data pribadi

  Background:
    Given user berada di halaman login
    When user memasukan NIK
    And user memasukan password
    And user click sign button
    And user diarahkan ke dashboard page
    And user skip welcome pop up
    And user click My Profile
    And user diarahkan ke data karyawan
    And user click perbarui data
    And user click ubah data

  @PasFoto
  Scenario: sebagai user saya dapat mengunggah pas foto
    And user mengunggah pas foto
    And user click simpan sebagai draft
    Then status progress berubah menjadi draft

  @PasFotoNegative
  Scenario: sebagai user saya tidak dapat mengunggah pas foto lebih 5mb
    And user mengunggah pas foto melebihi batas maximal yang ditentukan
    Then pop up peringatan ditampilkan bahwa file tidak boleh melebihi max size