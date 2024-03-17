# (12) Restful API Introduction
## API
- API = Application Programming Interface.  
- API memungkinkan komunikasi dan pertukaran data antara 2 atau lebih software atau sistem yang terpisah
 
## REST API
- REST = Repsentational State Transfer
- HTTP Method

## HTTP METHOD
- Resource: URL
- GET: Membaca data
- PUT: Membuat/ mengganti data (perlu input body)
- POST: Membuat data baru (perlu input body)
- DELETE: Menghapus data yang ada

__note:__   
format body biasanya JSON


## HTTP Response Code
1. 200 OK
2. 201 Created
3. 400 Bad Request
4. 404 Not Found
5. 401 Unauthorized
6. 405 Method Not Allowed
7. 500 Internal Server Error

## API Testing
- Memverifikasi apakah kita mendapat respon dari API
- Memverifikasi apakah hasil input/request sudah sesuai atau belu,
- Memverifikasi apakah data yang kita input/update sudah benar-benar berubah atau bertambah
- Memverifikasi waktu response yang diberikan

Macam-macam API Testing:
- Functionality
- Load Test
- Security