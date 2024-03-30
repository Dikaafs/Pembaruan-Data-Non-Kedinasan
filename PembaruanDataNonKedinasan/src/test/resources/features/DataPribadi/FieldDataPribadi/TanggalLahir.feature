Feature: Tanggal Lahir
  sebagai user saya ingin memilih tanggal lahir
  agar tanggal lahir saya dapat tersimpan sebagai data pribadi saya

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

  @TglLahir
  Scenario: sebagai user saya dapat memilih tanggal lahir
    And user click field tanggal lahir
    And user memilih bulan lahir
    And user memilih tahun lahir
    And user memilih tanggal lahir
    And user click simpan sebagai draft
    Then status progress berubah menjadi draft

  @TglLahirInvalid
  Scenario: sebagai user saya tidak dapat memilih tanggal lahir dimasa depan
    And user click field tanggal lahir
    And user memilih tahun lahir dimasa depan
    Then pesan peringatan muncul bahwa tanggal lahir tidak dapat menggunakan tanggal dimasa depan




