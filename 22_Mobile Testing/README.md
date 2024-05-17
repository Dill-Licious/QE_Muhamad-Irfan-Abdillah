# (22) Mobile Testing 
Mobile testing adalah pengujian aplikasi di perangkat mobile untuk memastikan kinerja dan fungsionalitasnya sesuai dengan standar dan kebutuhan pengguna.

## Appium Framework
- Framework untuk run mobile automation test
- Support banyak bahasa pemrograman: Java, Python, Javascript, Ruby, etc.
- Support: Android, iOS, Windows app

### Appium Components
- **Appium Server** digunakan sebagai jembatan untuk mengendalikan perangkat pengujian. Terdapat dua versi yang dapat digunakan, yaitu Appium Desktop atau menginstal perintah Appium menggunakan npm.

- **Appium Client** adalah library yang ditulis dalam beberapa bahasa pemrograman untuk membuat skrip pengujian sehingga kita dapat mengirim perintah ke server Appium.

**Running Appium Server:**
```
appium
```

## Project Structure:
1. **Main package:**  
-  base: menyimpan fungsi dasar dalam proses testing seperti klik, mengetik dan mencari komponen
- drivers: untuk melakukan inisialisasi driver
- pages: untuk menyimpan halaman aplikasi yang digunakan untuk testing
- properties: untuk menyimpan fungsi tambahan untuk membaca data konfigurasi
- resources: untuk menyimpan file konfigurasi

2. **Test package:**
- hooks: untuk menyimpan fungsi lifecycle saat proses testing
- steps: untuk menyimpan step definition yang dijabarkan dari sintaks BDD
- resources: untuk menyimpan konfigurasi Cucumber dan sintaks BDD

**Running The Test:**
```
npm test
```

### Cucumber Hooks
- Hooks adalah sebuah kode yang dijalankan pada siklus / lide cycle dari cucumber
- Digunakan untuk proses setup dan teardown setelah testing selesai
- Contoh: @Before untuk menjalankan kode sebelum skenario test dijalankan. Kemudian @After untuk menjalankan kode setelah skenario test dijalankan