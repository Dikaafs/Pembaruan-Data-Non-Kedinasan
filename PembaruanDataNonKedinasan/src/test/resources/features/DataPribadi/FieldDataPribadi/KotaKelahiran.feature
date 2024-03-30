Feature: Kota kelahiran
  sebagai user saya ingin menginput kota kelahiran
  sehinggal kota kelahiran saya dapat tersimpan pada data pribadi

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
  @KotaLahir
  Scenario: sebagai user saya dapat menginput kota kelahiran
    And user menginput kota kelahiran
    And user click simpan sebagai draft
    And pembaruan kota kelahiran berhasil disimpan
    Then status progress berubah menjadi draft

  @KotaLahirInvalid
  Scenario: sebagai user saya tidak dapat menginput kota kelahiran dengan angka
    And user click My Profile
    And user click data karyawan
    And user click perbarui data
    And user menginput kota kelahiran dengan angka
    And user click simpan sebagai draft
    Then pesan peringatan muncul bahwa kota kelahiran tidak dapat diisi menggunakan angka


