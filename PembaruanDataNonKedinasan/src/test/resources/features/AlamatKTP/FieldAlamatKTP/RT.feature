Feature: RT
  sebagai user saya ingin melakukan pembaruan data pada RT
  sehingga RT sudah diperbarui dapat disimpan pada data karyawan

  Background:
    Given user berada di halaman login
    When user memasukan NIK
    And user memasukan password
    And user click sign button
    And user diarahkan ke dashboard page
    And user skip welcome pop up
    And user click My Profile
    And user click data karyawan
    And user click perbarui data

  @RT
  Scenario: sebagai user saya tidak dapat mengisi field RT menggunakan huruf
    And user click Alamat KTP
    And user click ubah data
    And user menginput RT
    Then field tidak akan terisi karena tidak dapat diinput dengan huruf

