# (10) Object Oriented Programming

## Apa itu OOP?
OOP adalah pemrograman berorientasi objek atau merupakan paradigma pemrograman berdasarkan konsep "objek", yang dapat berisi data, dalam bentuk field atau dikenal juga sebagai atribut; serta kode, dalam bentuk fungsi/prosedur atau dikenal juga sebagai method.

## Komponen dalam OOP
- Object
- Class
- Method
- Atrribute
- Polymorphism
- Abstraction
- Encapsulation
- Inheritance

## Komponen OOP dalam Java
- Object
- Class
- Method
- Attribute
- Inheritance

## Class
Class dalam OOP berfungsi sebagai blueprint untuk menciptakan objek dan membuat pemrograman menjadi lebih terstruktur dan efisien

## Object
Object adalah instance dari class. 
Cara menulis object di Java:
```
Motor objectMotor = new Motor();
```

- Motor = Inisialisasi nama object
- objectMotor = Deklarasi nama object
- New Motor(); = instantiation object

Jika class secara umum mepresentasikan (template) sebuah object, sebuah instance adalah representasi nyata dari class itu sendiri. Contoh : Dari class Fruit kita dapat membuat object Mangga, Pisang, Apel, dan lain-lain.

Object memiliki __variabel__ dan access __modifier__

## Access Modifier
1. Public -> Class, Package, Subclass, global
2. Default -> Class, Package
3. Private -> Class
4. Protected -> Class, Package, Subclass


## Inheritance
Inheritance merupakan proses pewarisan data dan method dari suatu class yang telah ada kepada suatu class baru. Class yang mewariskan disebut dengan superclass / parent class / base class, sedangkan class yang mewarisi (class yang baru) disebut dengan subclass / child class / derived class.