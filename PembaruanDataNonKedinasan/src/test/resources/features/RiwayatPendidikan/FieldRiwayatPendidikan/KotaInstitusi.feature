Feature: kota institusi
  sebagai user saya ingin menginput kota institusi
  sehingga kota institusi saya dapat tersimpan pada Riwayat Pendidikan

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

    @kotainstitusi
  Scenario: sebagai user saya tidak dapat mengisi kota institusi dengan angka
    And user click Riwayat Pendidikan
    And user menginput kota institusi dengan angka
    Then angka otomatis tidak terinput

