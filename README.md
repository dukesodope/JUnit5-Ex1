Trần Trung Đức - BIT220204 - 22SE1.1

Bài tập 1 của môn "Kiểm thử phần mềm" sử dụng JUnit5 của một máy tính cầm tay cơ bản.

Đề bài: Kiểm thử đơn vị với Java.

**MathUtils**

MathUtils là một lớp Java cung cấp các phương thức toán học cơ bản cho phép thực hiện các phép toán cộng, trừ, nhân và chia với kiểm tra overflow và underflow. Lớp này đảm bảo rằng các phép toán không dẫn đến lỗi do vượt quá giới hạn của kiểu dữ liệu int.

**Tính năng**
-  Cộng (add): Thực hiện phép cộng hai số nguyên và kiểm tra overflow.
-  Trừ (subtract): Thực hiện phép trừ hai số nguyên và kiểm tra underflow.
-  Nhân (multiply): Thực hiện phép nhân hai số nguyên và kiểm tra overflow.
-  Chia (divide): Thực hiện phép chia hai số nguyên, kiểm tra chia cho 0 và kiểm tra overflow trong trường hợp đặc biệt.

**Kiểm tra lỗi**

Các phương thức sẽ ném ra IllegalArgumentException trong các trường hợp sau:
 Cộng (add):
  Nếu phép cộng gây ra overflow.
 Trừ (subtract):
  Nếu phép trừ gây ra underflow.
 Nhân (multiply):
  Nếu phép nhân gây ra overflow.
 Chia (divide):
  Nếu chia cho 0.
  Nếu phép chia Integer.MIN_VALUE cho -1 gây ra overflow.

  ![image](https://github.com/user-attachments/assets/aafc9aeb-5343-4c10-ac83-bdc1f08545bf)

**MathUtilsTest**

MathUtilsTest là một lớp kiểm thử JUnit cho lớp MathUtils, nhằm đảm bảo rằng các phương thức toán học như cộng, trừ, nhân và chia hoạt động đúng cách và xử lý các trường hợp đặc biệt như overflow và underflow.

Cách sử dụng

Lớp kiểm thử này sẽ tự động chạy các kiểm thử khi bạn thực thi các bài kiểm thử trong IDE hoặc từ dòng lệnh.

**Các phương thức kiểm thử**
-  testAdd: Kiểm tra phép cộng với các trường hợp bình thường, biên và dữ liệu ngẫu nhiên.
-  testSubtract: Kiểm tra phép trừ với các trường hợp bình thường và biên.
-  testMultiply: Kiểm tra phép nhân với các trường hợp bình thường và biên.
-  testMultiplyOverflow: Kiểm tra overflow trong phép nhân.
-  testDivide: Kiểm tra phép chia với các trường hợp bình thường, kiểm tra chia cho 0 và kiểm tra overflow.
-  testDivideOverflow: Kiểm tra overflow khi chia Integer.MIN_VALUE cho -1.
-  testEdgeCases: Kiểm tra các trường hợp biên để đảm bảo rằng các phương thức ném ra ngoại lệ khi vượt quá giới hạn của kiểu int.

  ![image](https://github.com/user-attachments/assets/b1d84789-0ba0-4735-8392-49e4c0803876)

**Kết quả**

![Screenshot_1](https://github.com/user-attachments/assets/06cb26b0-6561-475d-a0a5-b5714b2962e2)

