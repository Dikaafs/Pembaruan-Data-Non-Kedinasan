Feature: Kecamatan
  sebagai user saya ingin melakukan pembaruan data pada Kecamatan
  sehingga Kecamatan sudah diperbarui dapat disimpan pada data karyawan

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
  Scenario: sebagai user saya tidak dapat mengisi field Kecamatan jika terdapat angka
    And user click Alamat KTP
    And user click ubah data
    And user menginput Kecamatan menggunakan angka
    Then pesan peringatan ditampilkan bahwa field Kecamatan tidak dapat diisi menggunakan angka
