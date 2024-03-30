Feature: Ijazah
  sebagai user saya ingin mengupload ijazah
  sehingga ijazah saya dapat tersimpan pada riwayat pendidikan

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

    @ijazah
  Scenario: sebagai user saya tidak dapat mengunggah ijazah dengan size lebih dari 5mb
    And user click Riwayat Pendidikan
    And user mengunggah file ijazah melebihi size batas maximum
    Then pesan error muncul bahwa ukuran tidak boleh melebihi 5mb