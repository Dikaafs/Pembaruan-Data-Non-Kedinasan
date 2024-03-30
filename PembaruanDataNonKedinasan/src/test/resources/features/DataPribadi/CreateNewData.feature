Feature: Create New Data Pribadi
  sebagai user saya ingin menginput data pribadi
  agar data pribadi saya terisi

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

  @CreateNewData
  Scenario: sebagai user saya bisa mengisi data pribadi baru pada akun saya
    And user menginput nomor ktp valid
    And user mengunggah KTP
    And user mengunggah akte lahir
    And user menginput nama lengkap
    And user memilih tanggal lahir
    And user menginput kota kelahiran
    And user memilih jenis kelamin
    And user menginput suku
    And user memilih agama
    And user memilih golongan darah yang tersedia
    And user mengunggah pas foto
    And user menginput nomor NPWP
    And user mengunggah kartu NPWP
    And user mengunggah kartu bpjs
    And user menginput nomor bpjs
    And user click simpan sebagai draft
    And status progress berubah menjadi draft
    And user click submit
    Then status progress berubah menjadi diproses






