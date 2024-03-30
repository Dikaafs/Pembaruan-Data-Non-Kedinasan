Feature: keterangan
  sebagai user saya ingin memilih keterangan
  sehingga saya dapat menyimpan keterangan asal biaya saya pada riwayat pendidikan

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

  Scenario: sebagai user saya tidak dapat mengosongkan keterangan
	And user click Riwayat Pendidikan
    And user mengosongkan field keterangan
    Then pesan warning,muncul bahwa field tidak boleh dikosongkan




