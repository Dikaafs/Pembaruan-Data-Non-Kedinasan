Feature: Upload BPJS
  sebagai user saya ingin mengupload kartu BPJS
  sehingga kartu BPJS saya dapat tersimpan pada data pribadi

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

  @uploadbpjs
  Scenario: sebagai user saya berhasil mengunggah kartu bpjs
    And user mengunggah kartu bpjs
    And user click simpan sebagai draft
    Then status progress berubah menjadi draft

  @uploadbpjsInvalid
  Scenario: sebagai user saya tidak berhasil mengunggah kartu bpjs dengan size lebih dari 5mb
    And user mengunggah kartu bpjs dengan size lebih dari batas maximal
    Then pop up peringatan ditampilkan bahwa file tidak boleh melebihi max size