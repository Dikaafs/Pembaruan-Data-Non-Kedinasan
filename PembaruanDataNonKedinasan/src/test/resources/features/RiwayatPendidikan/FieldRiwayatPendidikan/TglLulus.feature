Feature: tanggal lulus
  sebagai user saya ingin memilih tanggal lulus
  sehingga saya dapat menyimpan tanggal lulus pendidikan saya pada riwayat pendidikan

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

  @tglselesai
  Scenario: sebagai user saya tidak dapat memilih tanggal lulus dimasa depan
    And user click Riwayat Pendidikan
    And user click field tanggal lulus
    And user memilih tahun lulus dimasa depan
    And user memilih bulan lulus dimasa depan
    And user memilih tanggal lulus dimasa depan
    Then pesan peringatan muncul bahwa tanggal mulai pendidikan tidak bisa menggunakan format masa depan
