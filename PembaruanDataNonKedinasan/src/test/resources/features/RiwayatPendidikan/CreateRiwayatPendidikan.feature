Feature: Riwayat Pendidikan
  sebagai user saya ingin menginput riwayat pendidikan saya
  sehingga riwayat pendidikan saya dapat tersimpan pada data pribadi

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

  @CreateRiwayatPendidikan
  Scenario: sebagai user saya bisa mengisi data pendidikan
    And user click Riwayat Pendidikan
    And user menginput nama jenjang
    And user menginput institusi
    And user menginput nama jurusan
    And user menginput IPK
    And user menginput Gelar
    And user menginput ijazah
    And user menginput Negara
    And user menginput kota institusi
    And user click field tanggal mulai
    And user memilih tanggal mulai
    And user memilih bulan mulai
    And user memilih tahun mulai
    And user click field tanggal lulus
    And user memilih tahun lulus
    And user memilih bulan lulus
    And user memilih tanggal lulus
    And user memilih asal biaya pendidikan
    And user menginput keterangan
    And user click simpan sebagai draft
    Then status progress berubah menjadi draft