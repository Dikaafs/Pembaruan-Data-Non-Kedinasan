Feature: Institusi
  sebagai user saya ingin menginput nama institusi
  sehingga saya dapat menyimpan nama institusi pada riwayat pendidikan

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

  @Institusi
  Scenario: sebagai user saya tidak dapat mengisi institusi dengan karakter spesial
    And user click Riwayat Pendidikan
    And user menginput institusi dengan karakter spesial
    Then karakter spesial otomatis tidak ikut tertulis