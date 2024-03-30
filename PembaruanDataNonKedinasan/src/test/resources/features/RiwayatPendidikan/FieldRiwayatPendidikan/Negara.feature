Feature: Negara
  sebagai user saya ingin menginput negara
  sehingga negara dapat tersimpan pada riwayat pendidikan

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

  @negara
  Scenario: sebagai user saya tidak dapat mengisi negara dengan angka
    And user click Riwayat Pendidikan
    And user menginput negara dengan angka
    Then angka otomatis tidak terinput