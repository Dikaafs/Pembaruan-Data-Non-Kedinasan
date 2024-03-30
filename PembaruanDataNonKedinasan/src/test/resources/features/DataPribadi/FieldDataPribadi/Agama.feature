Feature: Agama
  sebagai user saya ingin memilih agama saya
  sehingga saya dapat menyimpan agama saya pada data pribadi

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

  @Agama
  Scenario: sebagai user saya dapat memilih agama berdasarkan kategori yang tersedia
    And user click field agama
    And user memilih agama

  @Agamainvalid
  Scenario: sebagai user saya tidak dapat memilih agama yang tidak tersedia
    And user menginput agama yang tidak tersedia
    Then pesan ditampilkan bahwa pilihan tidak tersedia