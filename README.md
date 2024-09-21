# 💡 Konsep Pemrograman Berorientasi Objek - Pertemuan Pertama

**Topik Utama:** Konsep OOP - *Extends*, *Set*, dan *Get*

---

## 📑 Daftar Isi
- [📚 Extends](https://github.com/ervina0604/PBO1/blob/main/Pisces.java)
- [🛠 Set](https://github.com/ervina0604/PBO1/blob/main/Pisces.java)
- [🔍 Get](https://github.com/ervina0604/PBO1/blob/main/Pisces.java)

---

## 📚 Extends
**Extends** adalah keyword yang digunakan dalam konsep **inheritance (pewarisan)** di Java. Dengan menggunakan `extends`, sebuah class dapat **mewarisi** properti dan method dari class lain yang disebut **parent class**.Salah satu penerapannya : Kelas Pisces merupakan subclass dari kelas Hewan, yang berarti ia mewarisi atribut dan metode dari kelas induknya.

### 📝 Ciri-Ciri `Extends`:
- **Subclass** dapat mewarisi method dan properti dari parent class.
- Subclass dapat menambahkan atau **mengoverride** method yang ada.
  
#### 📌 Kapan Digunakan:
Ketika ingin membuat class baru yang mewarisi atribut dan perilaku dari class yang lebih umum (parent class), memungkinkan **reusability** code.

---

## 🛠 Set
**Set** adalah method **mutator** yang digunakan untuk **mengubah** nilai dari atribut suatu objek. Biasanya, method ini disebut dengan **setter**.Salah satu penerapannya: Melalui setter, informasi seperti jumlah kaki, cara bergerak, dan adaptasi ikan diatur.

### 🔍 Ciri-Ciri `Set` Method:
- Nama method dimulai dengan kata `set`.
- Menerima parameter yang akan menjadi nilai baru untuk atribut.
- Tidak mengembalikan nilai (void).

#### 📌 Kapan Digunakan:
Digunakan untuk **mengubah nilai** properti objek setelah objek tersebut dibuat, menjaga prinsip **encapsulation**.

---

## 🔍 Get
**Get** adalah method **accessor** yang digunakan untuk **mengambil** nilai dari atribut suatu objek. Method ini dikenal sebagai **getter**.Salah satu penerapannya:Menggunakan getter, informasi yang telah diatur ditampilkan, memberikan detail tentang ikan tersebut.

### 🔑 Ciri-Ciri `Get` Method:
- Nama method dimulai dengan kata `get`.
- Tidak menerima parameter.
- Mengembalikan nilai dari atribut.

#### 📌 Kapan Digunakan:
Digunakan untuk **mengakses nilai** dari properti objek tanpa mengubahnya, melindungi integritas data.

---

## 📌 Kesimpulan
- `Extends` digunakan untuk **mewarisi** atribut dan method dari parent class.
- `Set` method digunakan untuk **mengubah nilai** atribut objek secara tidak langsung, menjaga **encapsulation**.
- `Get` method digunakan untuk **mengambil nilai** atribut objek tanpa memodifikasinya, memastikan keamanan data.

---

### 🚀 Siap Berkreasi dengan OOP di Java? Terus Praktikkan dan Kuasai Konsepnya!
