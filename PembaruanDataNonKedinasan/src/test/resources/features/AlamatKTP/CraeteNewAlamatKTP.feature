Feature: Create New Alamat KTP
  sebagai user saya ingin menginput alamat KTP
  sehingga alamat ktp saya dapat tersimpan pada data karyawan

  Background:
    Given user berada di halaman login
    When user memasukan NIK
    And user memasukan password
    And user click sign button
    And user diarahkan ke dashboard page
    And user skip welcome pop up
    And user click My Profile
    And user click data karyawan
    And user click perbarui data

  @CreateNewAlamatKTP
  Scenario: sebgai user saya dapat menyimpan alamat KTP sebagai draft dengan inputan yang valid
    And user click Alamat KTP
    And user click ubah data
    And user menginput nama jalan
    And user menginput RT
    And user menginput RW
    And user menginput kelurahan
    And user menginput kecamatan
    And user menginput kota
    And user menginput provinsi
    And use rmenginput kode pos
    And user click simpan sebagai draft
    Then alamat KTP berhasil disimpan sebagai draft untuk bisa dilakukan submit dan proses pembaharuan bisa dilihat







