Trần Trung Đức - BIT220204 - 22SE1.1

Bài tập 1 của môn "Kiểm thử phần mềm" sử dụng JUnit5 của một máy tính cầm tay cơ bản.

Đề bài: Kiểm thử đơn vị với Java.

## Các phép toán số học:
- Cộng
- Trừ
- Nhân
- Chia (với xử lý lỗi khi chia cho 0)
## Yêu cầu trước khi sử dụng:
- Java Development Kit (JDK) 8 hoặc mới hơn.
- Công cụ build Maven.
- JUnit 5 để kiểm thử.
## Kiểm thử đơn vị với JUnit 5:
- Các trường hợp kiểm thử đầy đủ cho tất cả các phép toán, bao gồm các tình huống biên và ngoại lệ.
## Cài đặt 
Clone repository:
```bash
git clone https://github.com/dukesodope/JUnit5-Ex1.git
cd JUnit5-Ex1
```
Xây dựng dự án bằng Maven:
```bash
mvn clean install
```
## Lớp MathUtils
Lớp MathUtils cung cấp các phương thức sau:
```bash
int add(int a, int b)
int subtract(int a, int b)
int multiply(int a, int b)
int divide(int a, int b)
```
## Lớp kiểm thử
Để chạy các bài kiểm thử JUnit, sử dụng lệnh sau:
```bash
mvn test
```
Các bài kiểm thử bao gồm các tình huống:
- Các phép toán cơ bản
- Xử lý ngoại lệ (ví dụ, chia cho 0)
- Các tình huống biên và đầu vào đặc biệt
## Cấu trúc dự án
    ├── src
    │   ├── main
    │   │   └── java
    │   │       └── MathUtils.java
    │   └── test
    │       └── java
    │           └── MathUtilsTest.java
    ├── pom.xml
    └── README.md
## Kết quả
![Screenshot_1](https://github.com/user-attachments/assets/06cb26b0-6561-475d-a0a5-b5714b2962e2)

