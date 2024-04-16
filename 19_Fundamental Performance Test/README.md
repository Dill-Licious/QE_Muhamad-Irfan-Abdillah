# (19) Fundamental Performance Test

## Apa itu Performance Test?
Performance test merupakan teknik non-functional testing untuk menentukan parameter sistem dalam hal responsif dan stabilitas dibawah berbagai beban (load) kerja.

Performance testing mengukur:
- Stabilitas
- Ketahanan (reliability)
- Penggunaan sumber daya
- Availability pada environment-nya

Yang perhatikan dari Performance test:
- Throughput
- Response data

## Langkah Performance Test
1. Membuat test plan  
Kenali yang dibutuhkan end-point misal untuk login -> username dan password
2. Membuat script test
3. Melakukan performance test
4. Menganalisa hasil performance test


## Tipe Performance Test
1. **Load Test**  
Mengukur perilaku sistem pada saat kondisi normal dan puncak (paling sederhana)  
Untuk cek idealnya bisa pakai Tabel Tier

2. **Endurance Test**  
Mengukur kinerja sistem selama periode waktu yang panjang atau dalam kondisi beban kerja yang berat.
3. **Stress Test**  
Mengukur dan mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem (secara bertahap)
4. **Peak Test**
mengukur kinerja sistem saat mencapai kapasitas maksimum atau beban kerja tertinggi yang dapat ditangani (ekstrim langsung)

5. **Smoke Test**   
Dilakukan untuk verify script atau percobaan untuk mengecek minimal load (biasanya 1-2 virtual users)

6. **Spike Test**   
Mirip seperti stress test, tapi dalam waktu singkat saja. Misal pada saat flash sale 

7. **Soak Test**  
Mengetahui realibility ketika dalam tekanan di bawah puncak dalam jangka panjang (>= 1 jam)