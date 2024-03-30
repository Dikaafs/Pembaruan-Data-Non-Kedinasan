Feature: Nama jenjang
  sebagai user saya ingin mengisi nama jenjang pada riwayat pendidikan
  sehingga nama jenjang pendidikan saya dapat tersimpan pada riwayat pendidikan

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

  @namaJenjang
  Scenario: sebagai user saya tidak dapat mengisi nama jenjang dengan karakter spesial
    And user click Riwayat Pendidikan
    And user menginput nama jenjang pendidikan dengan karakter spesial
    Then karakter spesial otomatis tidak ikut tertulis

