# (04) Testing Documentation

## Test Scenario 
Sebuah komponen atau dokumen pada sebuah proses testing untuk menggambarkan fitur-fitur apa saja yang harus kita testing. Test scenario dapat dikatakan seperti high-level test case

Test scenario -> apa saja yang akan kita testing

Fokusnya adalah: __What__ (Apa yang harus ditesting, fitur apa saja)

Contoh Test Scenario (studi kasus: login):  
- Check login functionality
- Check the forgot email functionality
- Check the create new account functionality

## Test Case 
- Test case merupakan perincian dari test scenario
- Fokusnya adalah: __How__ (bagaimana cara kita melakukan testing berdasarkan skenario yang sudah kita buat)
- Test case terdapat case positif (valid) dan case negatif (non-valid)
- Terdapat set:
	1. Pre-conditions
	2. Steps
	3. Expected result (ekspetasi kita)
	4. Status
Actual result (hasil yang sebenarnya)

- Contoh Test Case  
Test Scenario: Check the Login Functionality

    - Test Case 1: Enter valid email and valid password
    - Test Case 2: Enter valid email and invalid password
    - Test Case 3: Enter invalid email and valid password
    - Test Case 4: Enter invalid email and invalid password