Feature: Nomor KTP
  sebagai user saya ingin menginput nomor KTP saya
  sehingga field nomor KTP saya terisi

  Background:
    Given user berada di halaman login
    When user memasukan NIK
    And user memasukan password
    And user click sign button
    And user diarahkan ke dashboard page
    And user skip welcome pop up
    And user click My Profile
    And user diarahkan ke data karyawan
    And user click perbarui data
    And user click ubah data

  @NoKTPvalid
    Scenario: sebagai user saya dapat mengisi nomor ktp dengan valid
    And user menginput nomor ktp valid
    Then nomor KTP valid dapat terinput

  @NoKTPinvalid
  Scenario: sebagai user saya tidak dapat mengisi nomor KTP dengan huruf
    And user menginput nomor ktp dengan huruf
    Then pesan peringatan muncul bahwa nomor KTP tidak boleh kosong

  @NoKTPmoreThan16
  Scenario: sebagai user saya tidak dapat mengisi nomor KTP lebih dari 16 angka
    And user menginput nomor ktp lebih dari 16
    Then KTP tidak dapat diinput melebihi 16 angka

  @NoKTPkosong
  Scenario: sebagai user saya tidak bisa mengosongkan field nomor KTP
    And user tidak mengisi field nomor KTP
    Then pesan peringatan muncul bahwa nomor KTP tidak boleh kosong








