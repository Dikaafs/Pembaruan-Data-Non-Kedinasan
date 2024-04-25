Feature: Jenis Kelamin
  sebagai user saya ingin memilih jenis kelamin
  sehingga jenis kelamin saya dapat tersimpan pada data pribadi

  Background:
    Given user berada di halaman login
    When user memasukan NIK
    And user memasukan password
    And user click sign button
    Then user diarahkan ke dashboard page
    And user skip welcome pop up
    And user click My Profile
    And user diarahkan ke data karyawan
    And user click perbarui data
    And user click ubah data

  @JenisKelamin
  Scenario: sebagai user saya dapat memilih jenis kelamin yang tersedia
    And user click field jenis kelamin
    And user memilih jenis kelamin
    And user click simpan sebagai draft
    Then status progress berubah menjadi draft

  @JenisKelaminInvalid
  Scenario: sebagai user saya tidak dapat memilih jenis kelamin yang tidak tersedia
    And user click field jenis kelamin
    And user memilih jenis kelamin yang tidak tersedia
    Then pesan ditampilkan bahwa pilihan tidak tersedia







