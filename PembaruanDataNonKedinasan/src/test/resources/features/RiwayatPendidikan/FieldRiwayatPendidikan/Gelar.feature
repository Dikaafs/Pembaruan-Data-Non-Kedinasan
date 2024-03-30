Feature: Gelar
  sebagai user saya ingin menginput gelar
  sehingga gelar saya dapat tersimpan pada riwayat pendidikan

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

  @gelar1
  Scenario: sebagai user saya tidak dapat mengisi Gelar dengan angka
    And user click Riwayat Pendidikan
    And user menginput gelar
    Then angka otomatis tidak terinput
