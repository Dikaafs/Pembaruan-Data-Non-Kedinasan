Feature: Golongan Darah
  sebagai user saya ingin memilih golongan darah
  sehingga saya dapat menyimpan golongan darah saya pada data pribadi

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

  @Golongandarah
  Scenario: sebagai user saya dapat memilih golongan darah yang tersedia
    And user click field golongan darah
    And user memilih golongan darah yang tersedia
    And user click simpan sebagai draft
    Then status progress berubah menjadi draft

  @Golongandarahinvalid
  Scenario: sebagai user saya tidak dapat memilih golongan darah yang tidak tersedia
    And user memilih golongan darah yang tidak tersedia secara manual
    Then pesan ditampilkan bahwa pilihan tidak tersedia