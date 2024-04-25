Feature: Upload NPWP
  sebagai user saya ingin mengunggah NPWP
  sehingga saya dapat menyimpan kartu npwp pada data pribadi

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

  @uploadnpwp
  Scenario: sebagai user saya berhasil mengunggah kartu npwp
    And user mengunggah kartu NPWP
    And user click simpan sebagai draft
    Then status progress berubah menjadi draft

  @uploadnpwpInvalid
  Scenario: sebagai user saya tidak berhasil mengunggah kartu npwp dengan size lebih dari 5mb
    And user mengunggah kartu NPWP dengan size melebihi batas maximal yang sudah ditentukan
    Then pop up peringatan ditampilkan bahwa file tidak boleh melebihi max size