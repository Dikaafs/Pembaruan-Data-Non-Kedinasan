Feature: Provinsi
  sebagai user saya ingin melakukan pembaruan data pada Provinsi
  sehingga Provinsi sudah diperbarui dapat disimpan pada data karyawan

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
  Scenario: sebagai user saya tidak dapat mengisi field Provinsi jika terdapat angka
    And user click Alamat KTP
    And user click ubah data
    And user menginput Provinsi dengan angka
    Then pesan peringatan ditampilkan bahwa field Provinsi tidak dapat diisi menggunakan angka