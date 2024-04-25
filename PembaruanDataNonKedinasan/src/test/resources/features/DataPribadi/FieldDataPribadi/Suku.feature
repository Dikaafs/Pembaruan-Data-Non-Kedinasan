Feature: Suku
  sebagai user saya ingin menginput suku
  sehingga saya dapat menyimpan Suku pada data pribadi

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

  @Suku
  Scenario: sebagai user saya dapat mengisi field Suku
    And user menginput suku
    And user click simpan sebagai draft
    Then status progress berubah menjadi draft

  @Sukuinvalid
  Scenario: sebagai user saya tidak dapat mengisi field suku menggunakan angka
    And user menginput suku menggunakan angka
    And user click simpan sebagai draft
    Then status progress berubah menjadi draft

