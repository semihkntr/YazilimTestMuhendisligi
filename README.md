# 🧪 Yazılım Test Mühendisliği Proje Ödevi

Bu proje, **Yazılım Test Mühendisliği** dersi kapsamında hazırlanmış bir **API Otomasyon Test** çalışmasıdır.

## 📌 Proje Hakkında
**Rest Assured** kütüphanesi kullanılarak, örnek bir REST API servisi (JSONPlaceholder) üzerinde regresyon testleri gerçekleştirilmiştir. Proje, manuel test süreçlerini otomatize etmeyi ve yazılım kalitesini sürekli kılmayı hedefler.

## 🚀 Kullanılan Teknolojiler
* **Dil:** Java (JDK 21)
* **Build Tool:** Maven
* **Test Framework:** JUnit 4
* **API Testing:** Rest Assured
* **IDE:** IntelliJ IDEA

## ✅ Test Senaryoları
Proje içerisinde aşağıdaki senaryolar kodlanmış ve doğrulanmıştır:

### 1. GET Request (Veri Çekme)
* Hedef URL: `https://jsonplaceholder.typicode.com/todos/1`
* **Kontroller:**
    * Status Code: `200` (OK)
    * Response Time: `< 5 saniye`
    * Data Integrity: `id` değerinin doğruluğu.

### 2. POST Request (Veri Gönderme)
* Hedef URL: `https://jsonplaceholder.typicode.com/posts`
* **Kontroller:**
    * Status Code: `201` (Created)
    * Request Body: Gönderilen başlık ve içerik kontrolü.
    * ID Generation: Yeni bir ID atandığının doğrulanması.




