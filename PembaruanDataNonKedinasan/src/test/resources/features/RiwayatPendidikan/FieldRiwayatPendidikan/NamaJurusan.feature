Feature: Nama Jurusan
  Sebagai user saya ingin menginput nama jurusan
  sehingga saya dapat menyimpan nama jurusan pada riwayat pendidikan

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

  @namajurusan
  Scenario: sebagai user saya tidak dapat mengisi nama jurusan dengan angka
    And user click Riwayat Pendidikan
    And user menginput nama jurusan dengan angka
    Then angka otomatis tidak terinput

  @namajurusan2
  Scenario: sebagai user saya tidak dapat mengisi nama jurusan dengan karakter spesial
    And user menginput nama jurusan dengan karakter spesial
    Then karakter spesial otomatis tidak terinput

