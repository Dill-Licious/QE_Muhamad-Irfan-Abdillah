# (11) Iterable & Map Data Structure 

## Iterable:

- **Iterator**: interface yang digunakan untuk mengiterasi elemen-elemen dalam suatu koleksi. Iterator memungkinkan untuk melakukan iterasi (perulangan) melalui elemen-elemen dalam suatu struktur data tanpa harus mengetahui implementasi internal dari struktur data tersebut.

- **Collection**: interface yang merepresentasikan grup objek. Collection juga merupakan struktur data yang digunakan untuk menyimpan, mengatur, dan memanipulasi kumpulan objek. Collection dapat berupa list, set, atau queue, dan menyediakan berbagai operasi umum seperti menambah, menghapus, dan mencari elemen.

- **Iterable**: Superinterface dari semua kelas yang mendukung iterasi. Artinya, setiap kelas yang mengimplementasikan interface Iterable dapat diiterasi menggunakan iterator.

## Map Data Structure:

- **Map**: Struktur data yang digunakan untuk memetakan key menuju value. Ini merupakan kumpulan pasangan kunci-nilai yang unik di mana setiap kunci memiliki nilai yang terkait dengannya. Map menyediakan metode untuk menambah, menghapus, dan mengambil nilai berdasarkan kunci.

- **HashMap**: Implementasi dari interface Map yang menggunakan struktur hash table untuk menyimpan pasangan kunci-nilai. 

- **SortedMap**:  subinterface dari Map yang menyimpan pasangan kunci-nilai dalam urutan tertentu. Implementasi SortedMap seperti TreeMap menyimpan kunci dalam urutan terurut, yang bisa berdasarkan urutan alami atau urutan yang ditentukan oleh pengguna.

- **LinkedHashMap**: Implementasi dari interface Map yang menggunakan hash table untuk mengatur pasangan kunci-nilai, tetapi juga menjaga urutan penyisipan elemen. Ini memungkinkan kita untuk mengakses elemen dalam urutan penyisipan mereka.