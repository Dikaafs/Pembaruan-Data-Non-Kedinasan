Feature: Akte Lahir
  sebagai user saya ingin menguggah akte lahir
  sehingga akte lahir saya dapat dimasukan kedalam data pribadi

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

  @Aktelahir
  Scenario: sebagai user saya dapat mengunggah akta lahir
    And user mengunggah akte lahir
    And user click simpan sebagai draft
    Then status progress berubah menjadi draft
  @AktelahirInvalid
  Scenario: sebagai user saya tidak dapat mengunggah akta lahir dengan size lebih dari 5mb
    And user mengunggah akte lahir dengan size lebih dari 5mb
    Then pop up peringatan ditampilkan bahwa file tidak boleh melebihi max size





