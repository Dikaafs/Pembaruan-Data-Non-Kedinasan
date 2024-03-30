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
    And user click data karyawan
    And user click perbarui data

  @NoKTPinvalid
  Scenario: sebagai user saya tidak dapat mengisi nomor KTP dengan huruf
    And user menginput nomor ktp dengan huruf
    Then field tidak terisi jika diinput menggunakan huruf

  @NoKTPmoreThan16
  Scenario: sebagai user saya tidak dapat mengisi nomor KTP lebih dari 16 angka
    And user menginput nomor ktp lebih dari 16
    And user click simpan sebagai draft
    Then nomor yang di input tidak akan bertambah lebih dari 16 angka

  @NoKTPkosong
  Scenario: sebagai user saya tidak bisa mengosongkan field nomor KTP
    And user tidak mengisi field nomor KTP
    Then pesan peringatan muncul bahwa nomor KTP tidak boleh kosong








