# Tugas Praktikum 25 - What is AI for QA

## Soal dan Jawaban
**1. Apakah proses testing secara manual perlu dilakukan meskipun tools yang memanfaatkan artificial intelligence sudah dikembangkan?** Jelaskan alasannya!  
**Jawab:** Menurut pendapat saya proses testing secara manual perlu dilakukan walaupun sudah memanfaatkan AI untuk proses testing. Alasannya:  
  - **AI tidak 100% benar** -> AI dapat menghasilkan output yang salah dalam beberapa kasus karena mungkin tidak dapat mengenali situasi yang kompleks.
  -  **Terdapat test case yang tidak terduga** -> AI tidak dapat memprediksi situasi yang belum pernah ditemui sebelumnya 
  -  **AI kurang paham konteks yang diuji** -> Ai hanya berfokus pada data yang diberikan dan kurang memahami konteks software yang diuji baik seperti proses bisnisnya, dsb.


**2. Perbedaan test case manual vs generate AI**   
- Link test case manual: [Manual](https://docs.google.com/spreadsheets/d/1Wrg46YpUSD4zXTDbJjAThvzGVAMf2S7LzdylT6vAl2g/edit?usp=sharing)
- Link test case by GPT: [Generate by GPT](https://docs.google.com/spreadsheets/d/1P7tKC-WvQURC11zML5oCwlICa6lAJ_S72wX_Q47xnlA/edit?usp=sharing)


**3. Perbedaan antara test case yang dibuat AI vs Manual**  

**Manual:**
- Lebih real case dalam pembuatan test case karena memahami betul isi dari websitenya
- Dapat membuat test data dengan data asli sehingga lebih sesuai ketika digunakan oleh user
- Lebih to the point
- Test case yang dibuat terkadang kurang kreatif
- Dapat memberikan komentar terhadap sistem berdasarkan hasil pengujian

**Generate by GPT:**  
- Test code yang dibuat terlalu panjang
- Test data yang digenerate kurang sesuai dengan isi asli dari website
- Tidak mengetahui actual result dari hasil pengujian 
- Tidak dapat memberikan komentar terhadap sistem berdasarkan hasil pengujian
- Test case yang dibuat sedikit lebih kreatif