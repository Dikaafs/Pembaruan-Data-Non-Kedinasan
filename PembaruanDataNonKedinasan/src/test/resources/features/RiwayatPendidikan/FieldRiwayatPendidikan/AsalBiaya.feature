Feature: asal biaya
  sebagai user saya ingin memilih asal biaya
  sehingga saya dapat menyimpan asal biaya pendidikan saya pada riwayat pendidikan

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

  @asalbiaya
  Scenario: sebagai user saya tidak dapat memilih asal biaya pendidikan yang tidak terdaftar
    And user click Riwayat Pendidikan
    And user memilih asal biaya yang tidak terdaftar
    Then pesan ditampilkan bahwa pilihan tidak tersedia