Feature: NPWP
  sebagai user saya ingin menginput nomor NPWP
  sehingga saya dapat menyimpan nomor NPWP pada data pribadi


  Background:
    Given user berada di halaman login
    When user memasukan NIK
    And user memasukan password
    And user click sign button
    And user diarahkan ke dashboard page
    And user skip welcome pop up
    And user click My Profile
    And user diarahkan ke data karyawan
    And user click perbarui data
    And user click ubah data

  @npwp
  Scenario: sebagai user saya berhasil menginput nomor npwp
    And user menginput nomor NPWP
    And user click simpan sebagai draft
    Then status progress berubah menjadi draft

  @npwpinvalid
  Scenario: sebagai user saya tidak berhasil menginput nomor npwp jika terdapat huruf
    And user menginput nomor npwp yang berisikan huruf
    Then field tidak terisi jika diinput menggunakan huruf
