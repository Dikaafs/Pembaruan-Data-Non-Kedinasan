Feature: tanggal mulai
  sebagai user saya ingin memilih tanggal mulai
  sehingga saya dapat menyimpan tanggal mulai pendidikan saya pada riwayat pendidikan

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

  @tglmulai
  Scenario: sebagai user saya tidak dapat memilih tanggal mulai dimasa depan
    And user click Riwayat Pendidikan
    And user click field tanggal mulai
    And user memilih tanggal masa depan
    Then pesan peringatan muncul bahwa tanggal mulai pendidikan tidak bisa menggunakan format masa depan