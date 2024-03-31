# (13) RestFul API Testing

## Apa itu API Testing?
- API Test berbeda dengan GUI
- Mengirim request dan mendapatkan responsenya
- Memverifikasi response yang benar dan error handling

## Kind of API Testing
1. Functionality -> Mengecek dapat berjalan dengan benar, misal: login
2. Load Test -> pengujian performa
3. Security -> Pengujian keamanan

## API Testing tools
- Postman
- JMeter
- Frisby.js
- REST-assured

### API Test tidak sama dengan Unit Test
- API Test dilakukan oleh tester
- End to End
- Tidak bisa mengakses source code
- Hanya menguji fungsi API saja
- Semua functional issue
- Scopenya lebih luas
- Dilakukan setelah build

## API Testing Process
1. Specification Review -> berisi: daftar endpoint, http method, format request-response 
2. Specification Development -> buat testcase (sampel, ekspetasi, dsb)
3. Framework Development -> pemilihan tools
4. Test Case Development -> pembuatan code program API Testing
5. Execution & Report -> menjalankan testing dan melaporkan hasilnya

### Test Cases untuk API Testing
- Mendapatkan response yang sesuai dengan inputan
- Apakah memberikan balikan atau tidak
- Apakah mengganggu fitur yang lain atau tidak
- Update struktur data
- Memodifikasi data yang ada

### Best Practices of API Testing
- Kelompokan test case ke dalam beberapa kategori
- Beri judul yang sesuai pada setiap test
- Harus berhati-hati ketika melakukan test yang berhubungan dengan menghapus sesuatu
- Ketika membuat test case harus dipikirkan juga segala kombinasi input pada API