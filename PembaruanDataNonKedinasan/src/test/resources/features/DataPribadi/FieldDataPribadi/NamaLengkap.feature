Feature: Nama Lengkap
  sebagai user saya ingin memasukan nama lengkap
  sehingga nama lengkap saya dapat tersimpan pada data pribadi

  Background:
  Background:
    Given user berada di halaman login
    When user memasukan NIK
    And user memasukan password
    And user click sign button
    Then user diarahkan ke dashboard page
    And user skip welcome pop up
    And user click My Profile
    And user diarahkan ke data karyawan
    And user click perbarui data
    And user click ubah data

  @NamaLengkap
  Scenario: sebagai user saya dapat menginput Nama lengkap dengan valid input
    And user menginput nama lengkap
    And user click simpan sebagai draft
    Then status progress berubah menjadi draft
  @NamalengkapAngka
  Scenario: sebagai user saya tidak dapat menginput Nama lengkap dengan angka
    And user menginput nama lengkap dengan angka
    And user click simpan sebagai draft
    Then pesan peringatan muncul bahwa nama lengkap tidak dapat diisi dengan angka

  @NamalengkapSimbol
  Scenario: sebagai user saya tidak dapat menginput Nama lengkap dengan simbol
    And user menginput nama lengkap dengan simbol
    And user click simpan sebagai draft
    Then pesan peringatan muncul bahwa nama lengkap tidak dapat diisi dengan simbol









