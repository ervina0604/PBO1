# 💡 Konsep Pemrograman Berorientasi Objek - Pertemuan Ketiga

**Topik Utama:** Konsep OOP - *Extends*, *Set*, dan *Get*

---

## 📑 Daftar Isi
- [📚 Extends](#extends)
- [🛠 Set](#set)
- [🔍 Get](#get)
- [📌 Kesimpulan](#kesimpulan)

---

## 📚 Extends
**Extends** adalah keyword yang digunakan dalam konsep **inheritance (pewarisan)** di Java. Dengan menggunakan `extends`, sebuah class dapat **mewarisi** properti dan method dari class lain yang disebut **parent class**.

### 📝 Ciri-Ciri `Extends`:
- **Subclass** dapat mewarisi method dan properti dari parent class.
- Subclass dapat menambahkan atau **mengoverride** method yang ada.
- Mendefinisikan hubungan **"is-a"** (misalnya, Anjing **is-a** Hewan).

#### 📌 Kapan Digunakan:
Ketika ingin membuat class baru yang mewarisi atribut dan perilaku dari class yang lebih umum (parent class), memungkinkan **reusability** code.

---

## 🛠 Set
**Set** adalah method **mutator** yang digunakan untuk **mengubah** nilai dari atribut suatu objek. Biasanya, method ini disebut dengan **setter**.

### 🔍 Ciri-Ciri `Set` Method:
- Nama method dimulai dengan kata `set`.
- Menerima parameter yang akan menjadi nilai baru untuk atribut.
- Tidak mengembalikan nilai (void).

#### 📌 Kapan Digunakan:
Digunakan untuk **mengubah nilai** properti objek setelah objek tersebut dibuat, menjaga prinsip **encapsulation**.

---

## 🔍 Get
**Get** adalah method **accessor** yang digunakan untuk **mengambil** nilai dari atribut suatu objek. Method ini dikenal sebagai **getter**.

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
