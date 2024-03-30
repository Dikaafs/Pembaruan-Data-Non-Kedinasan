Feature: IPK
  sebagai user saya ingin menginput IPK
  sehingga saya dapat menyimpan IPK pada riwayat pendidikan


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

  @IPK
  Scenario: sebagai user saya tidak dapat mengisi IPK dengan huruf
    And user click Riwayat Pendidikan
    And user menginput IPK menggunakan huruf
    Then IPK tidak akan terisi jika diinput menggunakan huruf



