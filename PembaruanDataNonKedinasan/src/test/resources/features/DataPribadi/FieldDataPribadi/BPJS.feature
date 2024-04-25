Feature: BPJS
  sebagai user saya ingin menginput nomor BPJS
  sehingga nomor BPJS saya dapat tersimpan pada data pribadi

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

  @BPJS
  Scenario: sebagai user saya berhasil menginput nomor bpjs
    And user menginput nomor bpjs
    And user click simpan sebagai draft
    Then status progress berubah menjadi draft

  @BPJSinvalid
  Scenario: sebagai user saya tidak berhasil menginput nomor bpjs jika terdapat huruf dan karakter spesial
    And user menginput nomor bpjs dengan huruf dan karakter spesial
    Then field tidak terisi jika diinput menggunakan huruf


