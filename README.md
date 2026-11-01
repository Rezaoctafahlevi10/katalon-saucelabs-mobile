# Swag Labs Mobile Automation Testing

## 1. Deskripsi Project

Swag Labs adalah aplikasi e-commerce berbasis Android yang dirancang untuk melakukan simulasi transaksi pembelian produk secara digital. Aplikasi ini menyediakan berbagai macam pilihan produk berkualitas, dilengkapi dengan fitur interaktif untuk mendukung kemudahan pengguna dalam berbelanja.

Project ini merupakan repositori Automation Testing berbasis Katalon Studio & Appium yang bertujuan untuk menguji keandalan fungsionalitas utama pada aplikasi Swag Labs Android.

Fitur Utama Aplikasi:

Katalog Produk Beragam: Menyediakan berbagai macam pilihan produk (seperti pakaian, aksesoris, dan perlengkapan) yang ditampilkan lengkap dengan gambar, deskripsi, serta harga.

Manajemen Keranjang Belanja (Shopping Cart): Memungkinkan pengguna untuk menambahkan (Add to Cart) maupun menghapus (Remove) produk dari keranjang belanja secara dinamis sesuai kebutuhan sebelum melanjutkan ke proses transaksi.

Filter & Pengurutan Produk (Product Filtering & Sorting): Memudahkan pengguna untuk menyaring dan mengurutkan daftar produk berdasarkan kriteria tertentu, seperti pengurutan harga dari yang terendah ke tertinggi (Price: Low to High) atau sebaliknya.

## 2. Prasyarat & Perangkat (Prerequisites)
Sebelum menjalankan pengujian otomatis ini, pastikan sistem Anda telah terpasang software dan lingkungan (environment) berikut:
Katalon Studio (v8.x atau versi terbaru)
Appium Server (v1.x / v2.x)
Android Studio (Lengkap dengan Android SDK & Build Tools)
Node.js & Java Development Kit (JDK 8 / 11)
Android Emulator / Perangkat Fisik (Dengan mode USB Debugging aktif)

## 3. Cara Menjalankan Project (Setup & Execution)

### 3.1. Persiapan Awal Environment

Pastikan variabel lingkungan (Environment Variables) untuk ANDROID_HOME dan JAVA_HOME sudah terkonfigurasi di OS Anda.

<img width="303" height="65" alt="image" src="https://github.com/user-attachments/assets/877f12f7-8b00-46fb-9fee-afad8eba7336" /> <br>
<img width="399" height="463" alt="image" src="https://github.com/user-attachments/assets/3073bf53-bf64-4a09-b235-2b02cf1aae13" /> <br>
<img width="575" height="645" alt="image" src="https://github.com/user-attachments/assets/8da8e382-6c14-4e60-a93d-5ad25a385e79" /> <br>
<img width="595" height="657" alt="image" src="https://github.com/user-attachments/assets/4b7dfa96-50d6-4eed-8317-2433b79284a2" /> <br>
<img width="561" height="265" alt="image" src="https://github.com/user-attachments/assets/c0227378-d37a-47c1-adc8-d75563453d1c" /> <br>
<img width="402" height="89" alt="image" src="https://github.com/user-attachments/assets/c4b59e29-7863-4905-931e-fa3f77bc7a63" /> <br>

Jalankan Android Emulator melalui Device Manager Android Studio atau hubungkan perangkat Android fisik.

### 3.2. Membuka Project di Katalon Studio

a. Clone repositori ini ke komputer lokal Anda: 
git clone https://github.com/Rezaoctafahlevi10/katalon-saucelabs-mobile/ <br>
b. Buka aplikasi Katalon Studio <br>
Pilih menu File > Open Project, lalu arahkan ke direktori folder hasil clone. <br>
c. Setelah berhasil buka project hasil clone, Buka Powershell menggunakan Run Administator kemudian masukan perintah "Appium" perintah tersebut untuk <br>
menjalankan server dari appium agar koneksi ke Katalon   <br>
<img width="387" height="328" alt="image" src="https://github.com/user-attachments/assets/e6ebf77a-2c9a-4ad1-bfc8-e021219aa50d" /> <br>
<img width="1275" height="667" alt="image" src="https://github.com/user-attachments/assets/1f6772e7-f147-4703-953d-45bac790a2dd" />


### 3.3. Eksekusi Test Suite
Buka folder Test Suites pada panel Test Explorer di sebelah kiri.
Pilih Test Suite yang ingin dijalankan (misalnya TS_Product_Management).
Pada toolbar bagian atas, klik tombol dropdown panah samping ikon Run, lalu pilih Android.
Pilih perangkat/emulator yang sedang aktif, kemudian klik OK.

4. Test Suite & Skenario Pengujian

Berikut adalah rincian skenario pengujian fungsional (Automation Test Cases) yang tercakup di dalam proyek ini: <br>
| Test Case ID | Test Case Deskripsi | Test Skenario Deskripsi | Expected Result |
| :--- | :--- | :--- | :--- |
| **TC_001_Succes_Login_Valid** | Pengecekan succes login | Pengetesan succes login | Berhasil login dan diarahkan ke halaman Product |
| **TC_002_Invalid_Username_and_Password** | Pengecekan Gagal login | Pengetesan Gagal login | Menampilkan pesan "Username and password do not match any user in this service" |
| **TC_003_Username_required_invalid** | Pengecekan filed username wajib diisi | Pengetesan field username | Menampilkan pesan "Username is required" |
| **TC_001_Succes_Logout** | Pengecekan succes login | Pengetesan succes login | Success logout dan diarahkan ke halaman login |
| **TC_001_Add_Cart_Product** | Pengecekan product succes disimpan dalam keranjang | Pengetesan penambahan product dalam keranjang | Product berhasil ditambahkan kedalam keranjang |
| **TC_002_Remove_Product** | Pengecekan product succes di hapus dalam keranajng | Pengetesan succes login | Product berhasil dihapus dari keranjang |
| **TC_003_Detail_Product** | Pengecekan succes login | Pengetesan succes login | Berhasil menampilkan halaman detail product |
| **TC_001_Field_Url_Required** | Pengecekan menu WebView field Url Site | Pengetesan menu WebView field Url Site | Menampilkan pesan "Please provide a correct https url" |
| **TC_001_Succes_Filter_Product_Low_Price** | Pengecekan filter product dari harga termurah | Pengetesan filter product by harga termurah | Berhasil mengurutkan product dari harga termurah |

5. Test Coverage
Functional Automation Coverage: 100% mencakup alur dasar manajemen produk (Product Catalog, Filtering, Login, Logout dan Webview).
Execution Status: PASSED pada eksekusi pengujian di Emulator Android (Pixel 6 / API Level 30+).
Locator Strategy: Menggunakan kombinasi Custom XPath, Resource-ID, dan Accessibility ID untuk menjamin stabilitas eksekusi elemen di Appium.
