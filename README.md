# Các bài tập cơ bản 


# B1 : LỚP PHÂN SỐ (src)

**Viết chương trình khai báo lớp Phân số gồm hai thuộc tính private là tử số và mẫu số. Sau đó thực hiện nhập vào một phân số và in ra phân số đó ở dạng tối giản.**

**Input Format**

Có hai số nguyên dương lần lượt là tử số và mẫu số.

Constraints

Các giá trị đều nguyên dương và không quá 18 chữ số.

Output Format

Ghi ra phân số tối giản;

**Sample Input 0**


```language
334 37
```
**Sample Output 0**

```language
334/37
```
**Sample Input 1**


```language
312 945
```
**Sample Output 1**

<pre>104/315</pre>

link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/Bai1/src/Main.java

**---------------------------------**

# Bài 2. LỚP SINH VIÊN (BAI3)


**Viết chương trình khai báo lớp Thí Sinh gồm các thông tin: Họ tên, Ngày sinh, Điểm môn 1, Điểm môn 2, Điểm môn 3 và Tổng điểm. Đọc thông tin 1 thí sinh từ bàn phím và in ra màn hình 3 thông tin: Họ tên, Ngày sinh, Tổng điểm.**

Input Format

Gồm 5 dòng lần lượt, mỗi dòng ghi 1 thông tin: Họ tên, Ngày sinh, Điểm môn 1, Điểm môn 2, Điểm môn 3.

Constraints

Các giá trị điểm là số thực (float). Họ tên không quá 50 chữ cái. Ngày sinh viết đúng chuẩn dd/mm/yyyy.

Output Format

Ghi ra Họ tên, Ngày sinh và Tổng điểm. Mỗi thông tin cách nhau một khoảng trống. Điểm được ghi ra với 1 số sau dấu phẩy.

Sample Input 0



```language
Hoang Dinh Nam
28/09/2000
6.1
6.9
6.4
```

Sample Output 0

<<pre>
	Hoang Dinh Nam 28/09/2000 19.4
</pre>

link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/Bai2/src/Main.java

**---------------------------------**


#Bài 4. LỚP NHÂN VIÊN(bai4)

**Một nhân viên làm việc trong công ty được lưu lại các thông tin sau:
Mã nhân viên: được gán giá trị là 00001
Họ tên: Xâu ký tự không quá 50 chữ cái.
Giới tính: Nam hoặc Nu
Ngày sinh: đúng theo chuẩn dd/mm/yyyy
Địa chỉ: Xâu ký tự không quá 100 chữ cái
Mã số thuế: Dãy số có đúng 10 chữ số
Ngày ký hợp đồng: đúng theo chuẩn dd/mm/yyyy
Viết chương trình nhập một nhân viên (không nhập mã) in ra màn hình thông tin của nhân viên đó.**

Input Format

Gồm 6 dòng lần lượt ghi các thông tin theo thứ tự đã ghi trong đề bài. Không có mã nhân viên.

Constraints

N/A

Output Format

Ghi ra đầy đủ thông tin nhân viên trên một dòng, các thông tin cách nhau đúng một khoảng trống.

Sample Input 0

```langue
Nguyen Thi Nhung
Nu
28/09/1999
Ha Nam
8850288467
13/07/2021
```
Sample Output 0

<<pre>
	0001 Nguyen Thi Nhung Nu 28/09/1999 Ha Nam 8850288467 13/07/2021
</pre>

link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/Bai3/src/Main.java

**---------------------------------**

#Bài 5. LỚP NHÂN VIÊN 2 (bai5)

**Một nhân viên làm việc trong công ty được lưu lại các thông tin sau: 1. Mã nhân viên: được gán giá trị là 00001. 2. Họ tên: Xâu ký tự không quá 50 chữ cái. 3. Giới tính: Nam hoặc Nu. 4. Ngày sinh, có thể chưa chuẩn nhưng đủ 3 phần và phân cách bởi dấu /. 5. Địa chỉ: Xâu ký tự không quá 100 chữ cái. 6. Mã số thuế: Dãy số có đúng 10 chữ số. 7. Ngày ký hợp đồng, có thể chưa chuẩn nhưng đủ 3 phần và phân cách bởi dấu /. Viết chương trình nhập một nhân viên (không nhập mã) in ra màn hình thông tin của nhân viên đó. Tên nhân viên được chuẩn hóa về dạng viết hoa chữ cái đầu của từng từ, ngày sinh về đúng dạng chuẩn dd/mm/yyyy**

Input Format

Gồm 6 dòng lần lượt ghi các thông tin theo thứ tự đã ghi trong đề bài.

Constraints

N/A

Output Format

Ghi ra đầy đủ thông tin nhân viên trên một dòng, các thông tin cách nhau đúng một khoảng trống.

Sample Input 0

```languea
Hoang Dinh NAM
Nam
9/9/1998
Bac Ninh
8743766435
10/2/2021
```


<pre>
	00001 Hoang Dinh Nam Nam 09/09/1998 Bac Ninh 8743766435 10/02/2021
</pre>

link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/Bai4/src/Main.java

**-------------------------------------**


#Bài 9. THU NHẬP CỦA GIÁO VIÊN (bai9)

**Trường phổ thông XYZ tính lương giáo viên theo quy tắc sau: Mỗi giáo viên có mã ngạch gồm 4 ký tự trong đó. 2 ký tự đầu là chức vụ (HT: Giáo viên kiêm nhiệm Hiệu trưởng, HP: Giáo viên kiêm nhiệm Hiệu phó, GV: Giáo viên thường). 2 ký tự số cuối cùng cho biết hệ số bậc lương (không quá 20). Lương cơ bản của mỗi giáo viên cũng có thể khác nhau. Phụ cấp quy định như sau. HT: 2.000.000. HP: 900.000. GV: 500.000. Thu nhập được tính bằng lương cơ bản nhân với hệ số bậc lương cộng thêm phụ cấp. Hãy tính lương cho 1 giáo viên theo quy tắc trên.**

Input Format

Có 3 dòng lần lượt là mã ngạch, họ tên và lương cơ bản.

Constraints

Lương cơ bản là số nguyên không quá 10^7

Output Format

Chỉ có một dòng ghi lần lượt các thông tin: mã ngạch, họ tên, bậc lương, thu nhập.

Sample Input 0

```langue
HP05
Nguyen Van Ha
1748000
```

Sample Output 0

<pre>
	HP05 Nguyen Van Ha 5 9640000
</pre>

link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/ThhuNhapCuaGiaoVien/src/GiaoVien.java

**---------------------------------**


#Bài 11. TÍNH LƯƠNG NHÂN VIÊN(nhanvien)

**Thông tin về nhân viên bao gồm: Mã nhân viên (tự động tăng theo thứ tự nhập, tính từ NV01, nếu chỉ có 1 nhân viên thì mã là NV01) - Họ và tên - Lương cơ bản mỗi ngày công - Số ngày công - Chức vụ Tiền lương được tính bằng lương cơ bản nhân với số ngày công. Giả sử quy tắc tính tiền thưởng như sau:
Số ngày công từ 25 trở lên thì thưởng 20% tiền lương
Số ngày công từ 22 đến dưới 25 thì thưởng 10% tiền lương
Dưới 22 ngày công thì không có thưởng. Mỗi nhân viên có thể có thêm phụ cấp chức vụ:
GD: 250000
PGD: 200000
TP: 180000
NV: 150000 Hãy nhập thông tin 1 nhân viên và tính toán thu nhập theo quy tắc trên.**

Input Format

Gồm 4 dòng lần lượt ghi Họ tên, lương cơ bản, số ngày công và chức vụ; Số ngày công là số nguyên không âm không vượt quá 31;

Constraints

Lương cơ bản là số nguyên dương không quá 10^7;

Output Format

Ghi ra một dòng gồm: mã nhân viên, tên nhân viên, lương tháng, thưởng, phụ cấp và thu nhập. Mỗi thông tin cách nhau một khoảng trống.

Sample Input 0

```langgue
Nguyen Van Teo
26000
21
PGD
```


<pre>
NV01 Nguyen Van Teo 546000 0 200000 746000	
</pre>

link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/LuongNhanVien/src/NhanVien.java
**------------------------------------**

#Bài 12. TUYỂN SINH(bai12)


**Trường Đại học XYZ tuyển sinh theo hình thức xét điểm thi ba môn Toán – Lý – Hóa. Để đơn giản, khu vực tuyển sinh được quy định luôn bởi ba chữ cái đầu tiên trong mã thí sinh. Do rất thích các thí sinh đến từ Khu vực 3 nên trường XYZ tự quy định giá trị điểm ưu tiên Khu vực như trong bảng sau:
imageGiả sử biết trước điểm chuẩn là 24. Hãy xác định tình trạng tuyển sinh của thí sinh.**

Input Format

Chỉ bao gồm thông tin của một thí sinh trên 5 dòng lần lượt là: - Mã thí sinh - Họ tên - Điểm toán - Điểm lý - Điểm hóa

Constraints

Các giá trị điểm đều đảm bảo trong phạm vi [0,10] và có thể có 1 chữ số phần thập phân.

Output Format

Ghi ra các thông tin: - Mã thí sinh - Họ tên - Khu vực - Tổng điểm – có tính ưu tiên (có thể có 1 số phần thập phân), trong trường hợp điểm là số thực với phần thập phân bằng 0 thì không in ra phần thập phân. - Trạng thái: TRUNG TUYEN hoac TRUOT (sau khi đã tính cả điểm ưu tiên)

Sample Input 0

```langgue
KV2B
Hoang Ngoc Long
3.4
9
0
```



Sample Output 0

<pre>
KV2B Hoang Ngoc Long 2 13.4 TRUOT	
</pre>

link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/TuyenSinh/src/SinhVien.java

**------------------------------------------**


# Bài 21 : DANH SÁCH MẶT HÀNG


**Bài toán quản lý danh sách mặt hàng trong đó mỗi mặt hàng sẽ có các thông tin: - Mã mặt hàng: tự động tăng, tính từ MH0001.**

Tên mặt hàng: xâu ký tự độ dài không quá 100.

Đơn vị tính: xâu ký tự độ dài không quá 10.

Giá mua: số nguyên dương không quá 7 chữ số.

Giá bán: số nguyên dương không quá 7 chữ số.

Viết chương trình nhập danh sách mặt hàng, sắp xếp theo lợi nhuận (giá bán trừ đi giá mua) giảm dần. Nếu lợi nhuận bằng nhau thì in ra theo thứ tự mã tăng dần.

Input Format

Dòng đầu ghi số M là số mặt hàng (không quá 5000). Tiếp theo là thông tin của M mặt hàng, mỗi mặt hàng ghi trên 4 dòng theo đúng thứ tự đã mô tả (không có mã)

Constraints

N/A

Output Format

Ghi ra danh sách mặt hàng có đầy đủ thông tin ở trên và lợi nhuận tính được (mỗi thông tin cách nhau một khoảng trống)

Sample Input 0

```langue
6
Ca phe
Thung
388000
492000
Dep
Thung
376000
495000
Giay Nguoi Lon
Cai
389000
580000
Giay Nguoi Lon
Thung
383000
503000
Dep
Thung
484000
647000
Vay Nu
Cai
366000
516000
```
Sample Output 0

<pre>
	MH0003 Giay Nguoi Lon Cai 389000 580000 191000
MH0005 Dep Thung 484000 647000 163000
MH0006 Vay Nu Cai 366000 516000 150000
MH0004 Giay Nguoi Lon Thung 383000 503000 120000
MH0002 Dep Thung 376000 495000 119000
MH0001 Ca phe Thung 388000 492000 104000
</pre>

link: https://github.com/Tieucuc2210/OppJavaBasic/blob/master/DanhSachMatHang/src/Main.java
**--------------------------**

#Bài 22. SINH VIÊN 1

**Viết chương trình khai báo lớp Sinh Viên gồm các thông tin: Mã SV, Họ tên, Ngày sinh, Lớp và Điểm GPA (dạng số thực). Hàm khởi tạo không có tham số, gán các giá trị thuộc tính ở trạng thái mặc định (xâu ký tự rỗng, giá trị số bằng 0). Đọc thông tin N sinh viên từ bàn phím (không có mã sinh viên) và in ra lần lượt màn hình mỗi dòng 1 sinh viên theo đúng thứ tự ban đầu. Trong đó Mã SV được tự tạo ra theo quy tắc thêm mã SV sau đó là giá trị nguyên tự động tăng tính từ 001 (tối đa là 099). Ngày sinh được chuẩn hóa về dạng dd/mm/yyyy**

Input Format

Dòng đầu tiên ghi số sinh viên N (0 < N < 50). Mỗi sinh viên ghi trên 4 dòng lần lượt là Họ tên, Lớp, Ngày sinh và Điểm GPA. Trong đó: • Họ tên không quá 30 chữ cái. • Lớp là một chuỗi không có dấu cách. • Ngày sinh có đủ 3 phần ngày tháng năm nhưng có thể chưa đúng chuẩn dd/mm/yyyy. • Điểm GPA đảm bảo trong thang điểm 4 với 2 nhiều nhất 2 số sau dấu phẩy.

Constraints

N/A

Output Format

Ghi ra danh sách lần lượt các sinh viên có đầy đủ Mã sinh viên, Họ tên, Lớp, Ngày sinh (đã chuẩn hóa về dạng dd/mm/yyyy), Điểm GPA (với đúng 2 số sau dấu phẩy). Mỗi sinh viên ghi trên 1 dòng, mỗi thông tin cách nhau 1 khoảng trống.

Sample Input 0

```langgue
5
Nguyen Van A
CNTT2
19/11/2000
3.60
Nguyen Van B
CNTT1
19/3/1999
0.10
Nguyen Van C
DTVT2
21/11/2001
1.30
Nguyen Van D
DTVT2
20/1/2000
2.70
Nguyen Van E
DTVT2
17/5/2003
0.30
```
Sample Output 0

<pre>
SV001 Nguyen Van A CNTT2 19/11/2000 3.60
SV002 Nguyen Van B CNTT1 19/03/1999 0.10
SV003 Nguyen Van C DTVT2 21/11/2001 1.30
SV004 Nguyen Van D DTVT2 20/01/2000 2.70
SV005 Nguyen Van E DTVT2 17/05/2003 0.30	
</pre>


link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/SinhVien1/src/SinhVien.java
**------------------------------------**


# BÀI 23 : SINH VIÊN 2

**Viết chương trình khai báo lớp Sinh Viên gồm các thông tin: Mã SV, Họ tên, Ngày sinh, Lớp và Điểm GPA (dạng số thực). Hàm khởi tạo không có tham số, gán các giá trị thuộc tính ở trạng thái mặc định (xâu ký tự rỗng, giá trị số bằng 0). Đọc thông tin N thí sinh từ bàn phím (không có mã sinh viên) và in ra lần lượt màn hình mỗi dòng 1 sinh viên theo đúng thứ tự ban đầu. Trong đó Mã SV được tự tạo ra theo quy tắc thêm mã SV sau đó là giá trị nguyên tự động tăng tính từ 001 (tối đa là 099). Họ tên được xử lý đưa về dạng chuẩn(viết hoa chữ cái đầu của từng từ trong tên). Ngày sinh được chuẩn hóa về dạng dd/mm/yyyy**

Input Format

Dòng đầu tiên ghi số sinh viên N (0 < N < 50). Mỗi sinh viên ghi trên 4 dòng lần lượt là Họ tên, Lớp, Ngày sinh và Điểm GPA. Trong đó: • Họ tên không quá 30 chữ cái. • Lớp là một chuỗi không có dấu cách. • Ngày sinh có đủ 3 phần ngày tháng năm nhưng có thể chưa đúng chuẩn dd/mm/yyyy. • Điểm GPA đảm bảo trong thang điểm 4 với 2 nhiều nhất 2 số sau dấu phẩy.

Constraints

N/A

Output Format

Ghi ra danh sách lần lượt các sinh viên có đầy đủ Mã sinh viên, Họ tên, Lớp, Ngày sinh (đã chuẩn hóa), điểm GPA (với đúng 2 số sau dấu phẩy). Mỗi sinh viên ghi trên 1 dòng, mỗi thông tin cách nhau 1 khoảng trống.

Sample Input 0
```langue
5
Hoang Van Long
CNTT2
26/7/2000
0.20
Tran Xuan Loc
CNTT1
3/1/1999
2.40
Nguyen Van Manh
CNTT3
18/11/2000
3.30
Ho Sy Kien
CNTT3
4/6/2000
1.50
Le Van Manh
CNTT1
13/3/2002
3.10
```
Sample Output 0

<pre>
	SV001 Hoang Van Long CNTT2 26/07/2000 0.20
SV002 Tran Xuan Loc CNTT1 03/01/1999 2.40
SV003 Nguyen Van Manh CNTT3 18/11/2000 3.30
SV004 Ho Sy Kien CNTT3 04/06/2000 1.50
SV005 Le Van Manh CNTT1 13/03/2002 3.10

</pre>


link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/SinhVien2/src/SinhhVien.java
**----------------------------------**

# BÀI 24 SS SINH VIEN THEO MÃ VÀ GPA

**Viết chương trình khai báo lớp Sinh Viên gồm các thông tin:
Mã SV
Họ tên
Ngày sinh
Lớp
Điểm GPA (dạng số thực).
Đọc thông tin N thí sinh từ bàn phím (không nhập mã sinh viên) sau đó sắp xếp theo điểm GPA giảm dần và in ra lần lượt màn hình mỗi dòng 1 sinh viên. Nếu 2 bạn có cùng GPA thì bạn nào có mã sinh viên nhỏ hơn sẽ xếp trước.
Trong đó Mã SV được tự tạo ra theo quy tắc thêm mã SV sau đó là giá trị nguyên tự động tăng tính từ 001 (tối đa là 050). Họ tên được xử lý đưa về dạng chuẩn. Ngày sinh được chuẩn hóa về dạng dd/mm/yyyy**

Input Format

Dòng đầu tiên ghi số sinh viên N (0 < N < 50). Mỗi sinh viên ghi trên 4 dòng lần lượt là Họ tên, Lớp, Ngày sinh và Điểm GPA. Trong đó: - Họ tên không quá 30 chữ cái.

Lớp là một chuỗi kí tự không có dấu cách.

Ngày sinh có đủ 3 phần ngày tháng năm nhưng có thể chưa đúng chuẩn dd/mm/yyyy.

Điểm GPA đảm bảo trong thang điểm 4 với 2 nhiều nhất 2 số sau dấu phẩy.

Constraints

N/A

Output Format

Ghi ra danh sách lần lượt các sinh viên có đầy đủ Mã sinh viên, Họ tên, Lớp, Ngày sinh (đã chuẩn hóa), điểm GPA (với đúng 2 số sau dấu phẩy) đã được sắp xếp theo điểm GPA giảm dần. Mỗi sinh viên ghi trên 1 dòng, mỗi thông tin cách nhau 1 khoảng trống.

Sample Input 0

```langue
2
ngUYen Van NaM
CNTT1
2/12/1994
2.17
Nguyen QuanG hAi
CNTT2
1/9/1994
3.0
```
Sample Output 0

<pre>
	SV002 Nguyen Quang Hai CNTT2 01/09/1994 3.00
SV001 Nguyen Van Nam CNTT1 02/12/1994 2.17
</pre>

link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/SSTheoMaVaGPA/src/Main.java

**---------------------------------------------------**
# NHÂN VIÊN1

**Một nhân viên làm việc trong công ty được lưu lại các thông tin sau: • Mã nhân viên: được gán tự động tăng, bắt đầu từ 00001 • Họ tên: Xâu ký tự không quá 40 chữ cái. • Giới tính: Nam hoặc Nu • Ngày sinh: đúng theo chuẩn dd/mm/yyyy • Địa chỉ: Xâu ký tự không quá 100 chữ cái • Mã số thuế: Dãy số có đúng 10 chữ số • Ngày ký hợp đồng: đúng theo chuẩn dd/mm/yyyy Viết chương trình nhập danh sách nhân viên (không nhập mã) trong đó có sử dụng chồng toán tử nhập/xuất và in ra màn hình danh sách vừa nhập.**

Input Format

Dòng đầu ghi số N là số nhân viên (không quá 40). Mối nhân viên ghi trên 6 dòng lần lượt ghi các thông tin theo thứ tự đã ghi trong đề bài. Không có mã nhân viên.

Constraints

N/A

Output Format

Ghi ra danh sách đầy đủ nhân viên, mỗi nhân viên trên một dòng, các thông tin cách nhau đúng một khoảng trống. Thông tin nhân viên được chuẩn hóa ngày sinh và ngày kí hợp đồng.

Sample Input 0

```langue
3
Nguyen Van A
Nam
22/10/1982
Mo Lao-Ha Dong-Ha Noi
8333012345
31/12/2013
Ly Thi B
Nu
15/10/1988
Mo Lao-Ha Dong-Ha Noi
8333012346
22/08/2011
Hoang Thi C
Nu
04/02/1981
Mo Lao-Ha Dong-Ha Noi
8333012347
22/08/2011
```
Sample Output 0

<pre>
	00001 Nguyen Van A Nam 22/10/1982 Mo Lao-Ha Dong-Ha Noi 8333012345 31/12/2013
00002 Ly Thi B Nu 15/10/1988 Mo Lao-Ha Dong-Ha Noi 8333012346 22/08/2011
00003 Hoang Thi C Nu 04/02/1981 Mo Lao-Ha Dong-Ha Noi 8333012347 22/08/2011
</pre>


link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/SSTheoMaVaGPA/src/Main.java

**--------------------------------**
# BÀI 26 NHÂN VIÊN 2
**Một nhân viên làm việc trong công ty được lưu lại các thông tin sau: • Mã nhân viên: được gán tự động tăng, bắt đầu từ 00001. • Họ tên: Xâu ký tự không quá 40 chữ cái. • Giới tính: Nam hoặc Nu. • Ngày sinh: đúng theo chuẩn dd/mm/yyyy. • Địa chỉ: Xâu ký tự không quá 100 chữ cái. • Mã số thuế: Dãy số có đúng 10 chữ số. • Ngày ký hợp đồng: đúng theo chuẩn dd/mm/yyyy. Viết chương trình nhập danh sách nhân viên (không nhập mã) sau đó sắp xếp theo thứ tự ngày sinh từ già nhất đến trẻ nhất và in ra màn hình danh sách đối tượng nhân viên đã sắp xếp. Nếu có 2 nhân viên có cùng ngày sinh thì in ra nhân viên có mã nhân viên nhỏ hơn.**

Input Format

Dòng đầu ghi số N là số nhân viên (không quá 40). Mỗi nhân viên ghi trên 6 dòng lần lượt ghi các thông tin theo thứ tự đã ghi trong đề bài. Không có mã nhân viên. Thông tin về ngày sinh và ngày kí hợp đồng được chuẩn hóa.

Constraints

N/A

Output Format

Ghi ra danh sách đầy đủ nhân viên đã sắp xếp, mỗi nhân viên trên một dòng, các thông tin cách nhau đúng một khoảng trống.

Sample Input 0

```LE
3
Nguyen Van A
Nam
17/10/1995
Bac Ninh
9778128747
6/11/2022
Nguyen Thi B
Nu
18/09/1997
Hai Duong
7823490168
5/4/2022
Nguyen Thi C
Nu
02/04/1995
Ninh Binh
7400512775
27/1/2020
```
Sample Output 0

<pre>
	00003 Nguyen Thi C Nu 02/04/1995 Ninh Binh 7400512775 27/01/2020
00001 Nguyen Van A Nam 17/10/1995 Bac Ninh 9778128747 06/11/2022
00002 Nguyen Thi B Nu 18/09/1997 Hai Duong 7823490168 05/04/2022

</pre>

link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/NhanVien2/src/SinhVien.java

**-------------------------------------------**

# TÍNH GIỜ QUÁN NÉT

**Quán Game mùa này vắng khách nên chủ quán quyết định tính tiền chi tiết đến từng phút. Dựa trên dữ liệu giờ vào và giờ ra, hãy tính thời gian chơi game của các Game thủ nhé.**

Input Format

Dòng đầu của dữ liệu vào ghi số lượng game thủ trong ngày (không quá 20). Thông tin về một game thủ đến chơi game được ghi lại trên 4 dòng lần lượt là:

username (xâu ký tự độ dài không quá 20, không có khoảng trống).

password (xâu ký tự độ dài không quá 30, không có khoảng tróng).

Tên người chơi (xâu ký tự độ dài không quá 100, có thể có khoảng trống).

Giờ vào (định dạng hh:mm)

Giờ ra (định dạng hh:mm).

Constraints

0<=hh<=23

0<=mm<=59

Giờ vào nhỏ hơn giờ ra

Output Format

Ghi ra danh sách game thủ đã được sắp xếp theo thời gian chơi game giảm dần, nếu có 2 game thủ có cùng giờ chơi game thì bạn nào có username có thứ tự từ điển nhỏ hơn được in ra trước.

Sample Input 0

```LOW
5
anhtuanvip
123
Nguyen Van Tuan
05:18
07:06
chickenzero
124
Nguyen Van Phuc
05:38
14:19
anhhung123
matkhau
Nguyen Manh Hung
06:58
14:18
loveyou
acb
Luong Van Manh
02:01
06:47
taikhoan123
matkhaumanh
Nguyen Thi Uyen
00:09
06:19
```

Sample Output 0

<pre>
	chickenzero 124 Nguyen Van Phuc 8 gio 41 phut
anhhung123 matkhau Nguyen Manh Hung 7 gio 20 phut
taikhoan123 matkhaumanh Nguyen Thi Uyen 6 gio 10 phut
loveyou acb Luong Van Manh 4 gio 46 phut
anhtuanvip 123 Nguyen Van Tuan 1 gio 48 phut

</pre>


Sample Input 1

```LOW
5
bHaqxvui
iGYZMmhekYzBq
PaGc VdA UaVWtt IsPt DhgKH
09:50
18:30
pGZKupUVGMeI
aADAgxFMmMvUn
kPmi OQt hnMIp NzYHS
02:24
12:18
LnIHfIzsUEz
FLlpZRmPWpROGF
tpsFu gbBtEt wlvk GGF INg
04:31
07:10
FfqqlBTOB
vKFBIHmBhR
VgFVPZ sju YqOZeV qnjxcO
00:31
03:05
aUuZXfMAx
cWcgqrKmq
muTd HZDtO EOXaNE LtuTy SGNA
11:52
13:42
```



Sample Output 1


<pre>
pGZKupUVGMeI aADAgxFMmMvUn kPmi OQt hnMIp NzYHS 9 gio 54 phut
bHaqxvui iGYZMmhekYzBq PaGc VdA UaVWtt IsPt DhgKH 8 gio 40 phut
LnIHfIzsUEz FLlpZRmPWpROGF tpsFu gbBtEt wlvk GGF INg 2 gio 39 phut
FfqqlBTOB vKFBIHmBhR VgFVPZ sju YqOZeV qnjxcO 2 gio 34 phut
aUuZXfMAx cWcgqrKmq muTd HZDtO EOXaNE LtuTy SGNA 1 gio 50 phut	
</pre>



link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/QuanGame/src/SortPhut.java
**--------------------------------------**



# BÀNG ĐIỂM

**Trường THCS XYZ lập bảng điểm tổng kết cho học sinh. Có 10 môn học lần lượt gồm: Toán, Tiếng Việt, Ngoại ngữ, Vật lý, Hóa học, Sinh học, Lịch Sử, Địa, Giáo dục công dân và môn Công nghệ. Trong đó các môn đều có hệ số là 1. Học sinh được xếp hạng theo điểm trung bình:**

• Từ 9 trở lên: loại XUAT SAC.

• Từ 8 đến 8.9: loại GIOI.

• Từ 7 đến 7.9: loại KHA.

• Từ 5 đến 6.9: loại TB.

• Dưới 5: loai YEU Hãy lập bảng điểm tổng kết và sắp xếp theo điểm trung bình giảm dần.

Input Format

Dòng đầu ghi số học sinh (không quá 50). Thông tin về mỗi học sinh có hai dòng: dòng đầu là họ tên (độ dài không quá 50), dòng thứ 2 gồm 10 số thực trong đoạn [0..10] lần lượt là điểm 10 môn theo đúng thứ tự đã mô tả.

Constraints

Chú ý : Sau điểm cuối cùng có dấu cách :)

Output Format

Danh sách đã sắp xếp được ghi ra bao gồm các thông tin: • Mã học sinh (tự động gán tăng dần theo thứ tự nhập, bắt đầu là HS01

• Họ và tên

• Điểm trung bình (với 1 chữ số phần thập phân)

• Xếp loại

Trong trường hợp điểm trung bình bằng nhau thì học sinh nào có mã học sinh nhỏ hơn sẽ xếp trên.

Sample Input 0

```DA
5
Tran Duc Luong
7.8 5.9 9.0 7.2 6.5 4.6 8.3 9.6 4.0 6.0 
Do Xuan Loc
8.4 0.9 4.4 4.6 2.4 9.5 2.1 3.6 9.5 6.3 
Vu Duc Hieu
6.5 8.8 7.7 9.4 2.9 0.5 1.5 3.7 4.8 6.9 
Phan Van Nam
8.2 6.4 8.3 2.3 8.3 2.9 8.7 7.1 9.4 3.4 
Vu Duc Minh
7.8 5.3 8.3 1.6 2.6 9.8 0.6 0.1 5.2 2.6 
```




Sample Output 0

<pre>
HS01 Tran Duc Luong 6.9 TB
HS04 Phan Van Nam 6.5 TB
HS03 Vu Duc Hieu 5.3 TB
HS02 Do Xuan Loc 5.2 TB
HS05 Vu Duc Minh 4.4 YEU	
</pre>


link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/BangDiem/src/BangDiem.java
**-------------------------------------**

# SẮP XẾP SINH VIÊN THEO LỚP


**Thông tin về mỗi sinh viên gồm: • Mã sinh viên: dãy ký tự không có khoảng trống (không quá 15). Đảm bảo không trùng nhau. • Họ và tên: độ dài không quá 100. • Lớp: dãy ký tự không có khoảng trống (không quá 15). • Email: dãy ký tự không có khoảng trống (không quá 15). Hãy nhập danh sách sinh viên và sắp xếp theo lớp tăng dần (thứ tự từ điển).**

Input Format

Dòng đầu ghi số sinh viên. Mỗi sinh viên ghi trên 4 dòng lần lượt là: mã, họ tên, lớp, email. Có không quá 5000 sinh viên trong danh sách.

Constraints

N/A

Output Format

Ghi ra danh sách sinh viên đã sắp xếp theo lớp. Mỗi sinh viên trên một dòng, các thông tin cách nhau một khoảng trống. Nếu 2 sinh viên có cùng lớp thì sắp xếp theo mã tăng dần (thứ tự từ điển)

Sample Input 0


```RES
4
SV001
Nguyen Trong Duc Anh
CNTT1
sv1@gmail.com
SV002
To Ngoc Hieu
CNTT2
sv2@gmail.com
SV003
Nguyen Ngoc Son
HTTT2
sv3@gmail.com
SV004
Nguyen Trong Tung
CNTT1
sv4@gmail.com
```


Sample Output 0

<pre>
	SV001 Nguyen Trong Duc Anh CNTT1 sv1@gmail.com 
SV004 Nguyen Trong Tung CNTT1 sv4@gmail.com
SV002 To Ngoc Hieu CNTT2 sv2@gmail.com
SV003 Nguyen Ngoc Son HTTT2 sv3@gmail.com
</pre>



link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/XepTheoLop/src/LOp.java
**-------------------------------------------------**


# SẮP XẾP SINH VIÊN THEO MÃ

**Thông tin về mỗi sinh viên gồm: • Mã sinh viên: dãy ký tự không có khoảng trống (không quá 15). Đảm bảo không trùng nhau. • Họ và tên: độ dài không quá 100. • Lớp: dãy ký tự không có khoảng trống (không quá 15). • Email: dãy ký tự không có khoảng trống (không quá 15). Hãy nhập danh sách sinh viên và sắp xếp theo mã sinh viên tăng dần (thứ tự từ điển).**

Input Format

Mỗi sinh viên ghi trên 4 dòng lần lượt là: mã, họ tên, lớp, email. Không cho biết số sinh viên nhưng dữ liệu đảm bảo là chẵn lần 4 dòng. Có không quá 5000 sinh viên trong danh sách.

Constraints

N/A

Output Format

Ghi ra danh sách sinh viên đã sắp xếp theo mã. Mỗi sinh viên trên một dòng, các thông tin cách nhau một khoảng trống.

Sample Input 0

```RES
SV004
Nguyen Trong Tung
CNTT1
sv4@gmail.com
SV001
Nguyen Trong Duc Anh
CNTT1
sv1@gmail.com
SV002
To Ngoc Hieu
CNTT2
sv2@gmail.com
SV003
Nguyen Ngoc Son
HTTT2
sv3@gmail.com
```



Sample Output 0

<pre>
	SV001 Nguyen Trong Duc Anh CNTT1 sv1@gmail.com 
SV002 To Ngoc Hieu CNTT2 sv2@gmail.com
SV003 Nguyen Ngoc Son HTTT2 sv3@gmail.com
SV004 Nguyen Trong Tung CNTT1 sv4@gmail.com
</pre>

link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/XepTheoMa/src/Main.java

**-------------------------------------**

# LIỆT KÊ SINH VIÊN THEO MÃ


**Thông tin về mỗi sinh viên gồm: • Mã sinh viên: dãy ký tự không có khoảng trống (không quá 15). Đảm bảo không trùng nhau. • Họ và tên: độ dài không quá 100, chưa được chuẩn hóa. • Lớp: dãy ký tự không có khoảng trống (không quá 15). • Email: dãy ký tự không có khoảng trống (không quá 15). Hãy nhập danh sách sinh viên và liệt kê sinh viên theo lớp.**

Input Format

Dòng đầu ghi số sinh viên (không quá 1000). Mỗi sinh viên ghi trên 4 dòng lần lượt là: mã, họ tên, lớp, email. Sau đó sẽ có giá trị số Q là số truy vấn. Tiếp theo là Q dòng, mỗi dòng ghi một lớp.

Constraints

1<=Q<=20;

Output Format

Với mỗi truy vấn, liệt kê danh sách sinh viên của lớp đó theo mẫu như trong ví dụ. Mỗi sinh viên ghi trên một dòng, các thông tin cách nhau một khoảng trống. Thứ tự sinh viên vẫn giữ nguyên như thứ tự ban đầu.

Sample Input 0

```DA
4
20132238
hoang dinh NAm
CNTT1
namhd@gmail.com
20142231
PhAM nGoc     tHuan
HTTT2
thuanpn@gmail.com 
20148971
Nguyen duc XUAN
CNTT1
xuannd@gmail.com 
20132038
PhAM vAn Hung
hungpv@gmail.com
CNTT2
1
CNTT1
```


Sample Output 0

<pre>
	DANH SACH SINH VIEN LOP CNTT1 :
20132238 Hoang Dinh Nam CNTT1 namhd@gmail.com
20148971 Nguyen Duc Xuan CNTT1 xuannd@gmail.com
</pre>


link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/LietKeSinhVien/src/Main.java
**----------------------------**

# LIỆT KÊ SINH VIÊN THEO KHÓA

**Thông tin về mỗi sinh viên gồm: - Mã sinh viên: dãy ký tự không có khoảng trống (không quá 15). Đảm bảo không trùng nhau.**

Họ và tên: độ dài không quá 100, chưa được chuẩn hóa và cần được chuẩn hóa trước khi in.

Lớp: dãy ký tự không có khoảng trống (không quá 15).

Email: dãy ký tự không có khoảng trống (không quá 15).

Hãy nhập danh sách sinh viên và liệt kê sinh viên theo khóa học. Chú ý: dữ liệu khóa học thể hiện qua 4 chữ số đầu tiên trong mã sinh viên

Input Format

Dòng đầu ghi số sinh viên (không quá 1000).

Mỗi sinh viên ghi trên 4 dòng lần lượt là: mã, họ tên, lớp, email.

Sau đó sẽ có giá trị số Q là số truy vấn.

Tiếp theo là Q dòng, mỗi dòng ghi năm bắt đầu khóa học theo định dạng yyyy.

Constraints

1<=Q<=100

Output Format

Với mỗi truy vấn, liệt kê danh sách sinh viên của khóa đó theo mẫu như trong ví dụ. Mỗi sinh viên ghi trên một dòng, các thông tin cách nhau một khoảng trống. Thứ tự sinh viên vẫn giữ nguyên như thứ tự ban đầu.

Sample Input 0

```RE
4
20132238
hoang dinh NAm
CNTT1
namhd@gmail.com
20142231
PhAM nGoc     tHuan
HTTT2
thuanpn@gmail.com 
20148971
Nguyen duc XUAN
CNTT1
xuannd@gmail.com 
20132038
PhAM vAn Hung
CNTT2
hungpv@gmail.com
2
2013
2014
```



Sample Output 0

<pre>
	DANH SACH SINH VIEN KHOA 2013 :
20132238 Hoang Dinh Nam CNTT1 namhd@gmail.com
20132038 Pham Van Hung CNTT2 hungpv@gmail.com
DANH SACH SINH VIEN KHOA 2014 :
20142231 Pham Ngoc Thuan HTTT2 thuanpn@gmail.com
20148971 Nguyen Duc Xuan CNTT1 xuannd@gmail.com
</pre>


link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/LietKeTheoKhoa/src/SInhVien.java

**---------------KẾ THỪA - ĐA HÌNH-------------------**


# BÀI 1: KẾ THỪA LỚP PERSON

**Xây dựng lớp Person với các thuộc tính : Tên (xâu kí tự không quá 100 kí tự), ngày sinh, địa chỉ và các hàm khởi tạo không tham số (gán các trường là xâu rỗng) và hàm khởi tạo đầy đủ tham số, phương thức toString để trả về thông tin. Lớp Student kế thừa từ lớp Person và có thêm thuộc tính là mã sinh viên, GPA và lớp, ghi đè phương thức toString. Nhập danh sách sinh viên từ bàn phím và in ra màn hình danh sách sinh viên trong đó tên được chuẩn hóa và ngày sinh đưa về đúng chuẩn dd/mm/yyyy.**

Mã nguồn tham khảo :

Input Format

Dòng 1 là N : số lượng sinh viên. Các dòng tiếp theo là thông tin sinh viên, mỗi sinh viên được mô tả bằng 5 dòng :

Tên

Ngày sinh, địa chỉ

Lớp

Gpa.

Cần tách ngày sinh và địa chỉ của sinh viên.

Constraints

1<=N<=1000;

Output Format

In ra danh sách sinh viên sau khi được chuẩn hóa, mã sinh viên tăng tự động từ 0001. Các thông tin viết cách nhau một dấu cách, điểm GPA in ra với 2 số sau dấu phẩy.

Sample Input 0

```OK
7
Nguyen AnH MaNH
27/8/2004Nam Dinh
CNTT2
2.70
pham Phuong TuaN
21/9/2004Nam Dinh
CNTT1
2.70
Vu Ngoc NAM
7/9/2004Nam Dinh
CNTT2
3.05
Vu AnH LoNG
17/12/2004Ha Noi
CNTT1
2.80
Nguyen Phuong NAM
23/6/2004Ha Nam
HTTT3
2.80
Luong AnH NAM
16/1/2004Thai Binh
DTVT1
2.80
Nguyen Phuong HaI
14/1/2004Nam Dinh
DTVT1
3.05
```



Sample Output 0

<pre>
	0001 Nguyen Anh Manh 27/08/2004 Nam Dinh CNTT2 2.70
0002 Pham Phuong Tuan 21/09/2004 Nam Dinh CNTT1 2.70
0003 Vu Ngoc Nam 07/09/2004 Nam Dinh CNTT2 3.05
0004 Vu Anh Long 17/12/2004 Ha Noi CNTT1 2.80
0005 Nguyen Phuong Nam 23/06/2004 Ha Nam HTTT3 2.80
0006 Luong Anh Nam 16/01/2004 Thai Binh DTVT1 2.80
0007 Nguyen Phuong Hai 14/01/2004 Nam Dinh DTVT1 3.05
</pre>

link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/KT1/src/GiaoVien.java
**-------------------------------------------------------------**


# BÀI 2 , KẾ THỪA + SORT THEO TÊN

**Xây dựng lớp Person với các thuộc tính : Tên (xâu kí tự không quá 100 kí tự), ngày sinh, địa chỉ và các hàm khởi tạo không tham số (gán các trường là xâu rỗng) và hàm khởi tạo đầy đủ tham số, phương thức toString để trả về thông tin. Lớp Student kế thừa từ lớp Person và có thêm thuộc tính là mã sinh viên, GPA và lớp, ghi đè phương thức toString. Nhập danh sách sinh viên từ bàn phím và in ra màn hình danh sách sinh viên trong đó tên được chuẩn hóa và ngày sinh đưa về đúng chuẩn dd/mm/yyyy. Tên sinh viên được sắp xếp theo thứ tự từ điển tăng dần, thứ tự từ điển của tên được xét từ tên, họ, đệm. Nếu 2 bạn cùng tên thì bạn nào xuất hiện trong danh sách trước được in ra trước.**




Input Format

Dòng 1 là N : số lượng sinh viên. Các dòng tiếp theo là thông tin sinh viên, mỗi sinh viên được mô tả bằng 5 dòng : Tên, ngày sinh, địa chỉ, lớp, gpa.

Constraints

1<=N<=1000;

Output Format

In ra danh sách sinh viên sau khi được chuẩn hóa, mã sinh viên tăng tự động từ 0001. Các thông tin viết cách nhau một dấu cách, điểm GPA in ra với 2 số sau dấu phẩy.

Sample Input 0

```RE
6
trAN Phuong HaI
17/4/2004
Ha Noi
DTVT1
2.50
trAN Phuong TuaN
28/1/2004
Ha Nam
DTVT1
2.50
Nguyen AnH MaNH
11/3/2004
Ha Noi
CNTT1
2.70
pham duC TuaN
21/5/2004
Ha Noi
DTVT1
2.50
trAN VAn LoNG
24/6/2004
Ha Noi
CNTT1
2.80
Luong Ngoc LoNG
12/11/2004
Nam Dinh
CNTT2
3.05
```



Sample Output 0

<pre>
	0001 Tran Phuong Hai 17/04/2004 Ha Noi DTVT1 2.50
0006 Luong Ngoc Long 12/11/2004 Nam Dinh CNTT2 3.05
0005 Tran Van Long 24/06/2004 Ha Noi CNTT1 2.80
0003 Nguyen Anh Manh 11/03/2004 Ha Noi CNTT1 2.70
0004 Pham Duc Tuan 21/05/2004 Ha Noi DTVT1 2.50
0002 Tran Phuong Tuan 28/01/2004 Ha Nam DTVT1 2.50
</pre>


link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/KT2/src/Person.java

**--------------------------------------**


# BẢI 3 SINH VIÊN VÀ GIÁO VIÊN

**Trường đại học XYZ cần quản lý các đối tượng là sinh viên và giáo viên. Sinh viên gồm các thông tin : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa. Giáo viên gồm các thông tin : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương. Thực hiện đọc các thông tin danh sách sinh viên và giáo viên từ bàn phím sau đó chuẩn hóa tên, ngày sinh và in ra danh sách sinh viên sau đó là danh sách giáo viên, biết rằng sinh viên sẽ có mã bắt đầu bằng SV (ví dụ SV112), giáo viên có mã bắt đầu bằng GV (ví dụ GV222).**



Input Format

Dòng đầu tiên là N : số lượng giáo viên và sinh viên. Các dòng tiếp theo mô tả thông tin của giáo viên hoặc sinh viên, mỗi thông tin gồm 6 dòng, đối với sinh viên 6 dòng gồm : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa, đối với giáo viên 6 dòng gồm : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương.

Constraints

1<=N<=1000;

Output Format

Đầu tiên in ra danh sách giáo viên, mỗi giáo viên in ra thông tin trên 1 dòng, các thông tin cách nhau một dấu cách. Những dòng tiếp theo in ra danh sách sinh viên, mỗi sinh viên in thông tin trên 1 dòng, các thông tin cách nhau một dấu cách, gpa in 2 số sau dấu phẩy.

Sample Input 0

```DD
9
GV1
Nguyen duC TuaN
4/6/1977
Thai Binh
CNTT
12000000
SV2
Luong VAn HaI
1/6/2004
Thai Binh
CNTT2
2.50
SV3
Nguyen AnH MaNH
14/2/2004
Thai Binh
CNTT2
2.50
GV4
Nguyen AnH HaI
20/3/1974
Ha Nam
KT
20000000
SV5
pham AnH MaNH
8/5/2004
Ha Nam
CNTT1
2.70
SV6
pham Phuong MaNH
18/7/2004
Ha Noi
CNTT2
2.50
GV7
trAN Phuong LoNG
6/2/1979
Ha Noi
ATTT
20000000
SV8
Nguyen VAn HaI
25/8/2004
Nam Dinh
CNTT2
2.70
SV9
Luong Ngoc HaI
16/11/2004
Ha Noi
CNTT1
3.20
```


Sample Output 0

<pre>
DANH SACH GIAO VIEN :
GV1 Nguyen Duc Tuan 04/06/1977 Thai Binh CNTT 12000000
GV4 Nguyen Anh Hai 20/03/1974 Ha Nam KT 20000000
GV7 Tran Phuong Long 06/02/1979 Ha Noi ATTT 20000000
DANH SACH SINH VIEN :
SV2 Luong Van Hai 01/06/2004 Thai Binh CNTT2 2.50
SV3 Nguyen Anh Manh 14/02/2004 Thai Binh CNTT2 2.50
SV5 Pham Anh Manh 08/05/2004 Ha Nam CNTT1 2.70
SV6 Pham Phuong Manh 18/07/2004 Ha Noi CNTT2 2.50
SV8 Nguyen Van Hai 25/08/2004 Nam Dinh CNTT2 2.70
SV9 Luong Ngoc Hai 16/11/2004 Ha Noi CNTT1 3.20	
</pre>


link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/KT3/src/Main.java
**---------------------------------------------**

# BÀI 4 TRUY VẪN GIÁO VIÊN VÀ SINH VIÊN

**Trường đại học XYZ cần quản lý các đối tượng là sinh viên và giáo viên. Sinh viên gồm các thông tin : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa. Giáo viên gồm các thông tin : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương, lớp mà giáo viên này phụ trách chủ nhiệm. Thực hiện đọc các thông tin danh sách sinh viên và giáo viên từ bàn phím sau đó chuẩn hóa tên, ngày sinh và in ra danh sách sinh viên sau đó là danh sách giáo viên, biết rằng sinh viên sẽ có mã bắt đầu bằng SV (ví dụ SV112), giáo viên có mã bắt đầu bằng GV (ví dụ GV222) theo địa chỉ tìm kiếm.**


Input Format

Dòng đầu tiên là N : số lượng giáo viên và sinh viên. Các dòng tiếp theo mô tả thông tin của giáo viên hoặc sinh viên, mỗi thông tin gồm 6 dòng, đối với sinh viên 6 dòng gồm : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa, đối với giáo viên 6 dòng gồm : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương, lớp mà giáo viên này phụ trách chủ nhiệm. Dòng cuối cùng của input là địa chỉ cần tìm kiếm.

Constraints

1<=N<=1000;

Output Format

Đầu tiên in ra danh sách giáo viên, mỗi giáo viên in ra thông tin trên 1 dòng, các thông tin cách nhau một dấu cách, không cần in thông tin về lớp mà giáo viên này quản lý. Những dòng tiếp theo in ra danh sách sinh viên, mỗi sinh viên in thông tin trên 1 dòng, các thông tin cách nhau một dấu cách, gpa in 2 số sau dấu phẩy.

Sample Input 0

```DÁ
7
GV1
trAN duC TuaN
7/4/1974
Thai Binh
ATTT
20000000
CNTT1
SV2
trAN AnH MaNH
27/10/2004
Ha Nam
DTVT1
2.50
SV3
pham Phuong NAM
8/8/2004
Thai Binh
DTVT2
2.50
GV4
trAN AnH MaNH
24/5/1972
Ha Nam
ATTT
12000000
DTVT2
SV5
trAN Phuong LoNG
8/12/2004
Ha Nam
ATTT3
2.50
SV6
Luong duC LoNG
23/1/2004
Ha Noi
DTVT2
3.20
GV7
Luong AnH TuaN
18/10/1972
Ha Nam
Co khi
25000000
DTVT1
Ha Noi
```




Sample Output 0

<pre>
	DANH SACH GIAO VIEN CO DIA CHI TAI Ha Noi :
DANH SACH SINH VIEN CO DIA CHI TAI Ha Noi :
SV6 Luong Duc Long 23/01/2004 Ha Noi DTVT2 3.20
</pre>

link : https://github.com/Tieucuc2210/OppJavaBasic/blob/master/KT4/src/GiaoVien.java

**---------------------------------**


# SẮP XẾP THEO LƯƠNG VÀ GPA

**Trường đại học XYZ cần quản lý các đối tượng là sinh viên và giáo viên. Sinh viên gồm các thông tin : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa. Giáo viên gồm các thông tin : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương. Thực hiện đọc các thông tin danh sách sinh viên và giáo viên từ bàn phím sau đó chuẩn hóa tên, ngày sinh và in ra danh sách sinh viên sau đó là danh sách giáo viên, biết rằng sinh viên sẽ có mã bắt đầu bằng SV (ví dụ SV112), giáo viên có mã bắt đầu bằng GV (ví dụ GV222). Đầu tiên in ra danh sách giáo viên theo lương giảm dần, nếu 2 giáo viên có cùng lương thì in theo mã giáo viên tăng dần(từ điển), tiếp đó in ra danh sách sinh viên theo gpa giảm dần, nếu 2 sinh viên có cùng gpa thì in theo mã sinh viên tăng dần(từ điển).**


Input Format

Dòng đầu tiên là N : số lượng giáo viên và sinh viên. Các dòng tiếp theo mô tả thông tin của giáo viên hoặc sinh viên, mỗi thông tin gồm 6 dòng, đối với sinh viên 6 dòng gồm : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa, đối với giáo viên 6 dòng gồm : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương.

Constraints

1<=N<=1000;

Output Format

Đầu tiên in ra danh sách giáo viên, mỗi giáo viên in ra thông tin trên 1 dòng, các thông tin cách nhau một dấu cách. Những dòng tiếp theo in ra danh sách sinh viên, mỗi sinh viên in thông tin trên 1 dòng, các thông tin cách nhau một dấu cách, gpa in 2 số sau dấu phẩy.

Sample Input 0

```DÁ
5
GV1
pham duC LoNG
4/3/1976
Ha Nam
CNTT
18000000
SV2
Vu AnH LoNG
3/11/2004
Hai Duong
DTVT1
2.70
SV3
trAN AnH NAM
27/11/2004
Nam Dinh
ATTT3
3.05
GV4
Nguyen VAn MaNH
12/4/1978
Ha Noi
Co khi
25000000
SV5
Luong Phuong HaI
3/4/2004
Nam Dinh
DTVT2
2.50
```

Sample Output 0

<pre>
	DANH SACH GIAO VIEN :
GV4 Nguyen Van Manh 12/04/1978 Ha Noi Co khi 25000000
GV1 Pham Duc Long 04/03/1976 Ha Nam CNTT 18000000
DANH SACH SINH VIEN :
SV3 Tran Anh Nam 27/11/2004 Nam Dinh ATTT3 3.05
SV2 Vu Anh Long 03/11/2004 Hai Duong DTVT1 2.70
SV5 Luong Phuong Hai 03/04/2004 Nam Dinh DTVT2 2.50
</pre>

https://github.com/Tieucuc2210/OppJavaBasic/tree/master/KT5/src

**---------------------------------------------**


# GIÁO VIÊN CHỦ NHIỆM


**Trường đại học XYZ cần quản lý các đối tượng là sinh viên và giáo viên. Sinh viên gồm các thông tin : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa. Giáo viên gồm các thông tin : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương, lớp mà giáo viên này phụ trách. Thực hiện đọc các thông tin danh sách sinh viên và giáo viên từ bàn phím sau đó chuẩn hóa tên, ngày sinh, biết rằng sinh viên sẽ có mã bắt đầu bằng SV (ví dụ SV112), giáo viên có mã bắt đầu bằng GV (ví dụ GV222) sau đó hiển thị giáo viên phụ trách và các sinh viên thuộc về 1 lớp theo truy vấn.**


Input Format

Dòng đầu tiên là N : số lượng giáo viên và sinh viên. Các dòng tiếp theo mô tả thông tin của giáo viên hoặc sinh viên, mỗi thông tin gồm 6 dòng, đối với sinh viên 6 dòng gồm : mã sinh viên, tên, ngày sinh, địa chỉ, lớp, điểm gpa, đối với giáo viên 7 dòng gồm : mã giáo viên, tên, ngày sinh, địa chỉ, khoa, lương, lớp phụ trách. Dòng cuối cùng trong input là tên lớp cần truy vấn.

Constraints

1<=N<=1000;

Output Format

Đầu tiên in ra giáo viên phụ trách lớp, mỗi giáo viên in ra thông tin trên 1 dòng, các thông tin cách nhau một dấu cách, một lớp có thể có nhiều giáo viên cùng phụ trách. Khi đó hãy liệt kê giáo viên theo danh sách. Những dòng tiếp theo in ra danh sách sinh viên, mỗi sinh viên in thông tin trên 1 dòng, các thông tin cách nhau một dấu cách, gpa in 2 số sau dấu phẩy theo danh sách.

Sample Input 0

```LEN
8
GV1
Nguyen VAn TuaN
6/2/1975
Nam Dinh
DTVT
25000000
CNTT1
SV2
Vu AnH MaNH
13/10/2004
Ha Noi
DTVT1
2.70
SV3
trAN Phuong TuaN
5/9/2004
Hai Duong
ATTT3
2.80
GV4
trAN duC HaI
14/12/1973
Ha Nam
Co khi
25000000
CNTT2
SV5
Nguyen Ngoc TuaN
13/11/2004
Hai Duong
CNTT1
3.05
SV6
Luong duC LoNG
6/1/2004
Hai Duong
CNTT2
2.70
GV7
Nguyen Phuong TuaN
25/4/1974
Nam Dinh
Co khi
12000000
DTVT1
SV8
Luong duC NAM
3/2/2004
Ha Noi
CNTT1
2.50
CNTT1
```

Sample Output 0

<pre>
	DANH SACH GIAO VIEN PHU TRACH LOP CNTT1 :
GV1 Nguyen Van Tuan 06/02/1975 Nam Dinh DTVT 25000000 CNTT1
DANH SACH SINH VIEN LOP CNTT1 :
SV5 Nguyen Ngoc Tuan 13/11/2004 Hai Duong CNTT1 3.05
SV8 Luong Duc Nam 03/02/2004 Ha Noi CNTT1 2.
</pre>

https://github.com/Tieucuc2210/OppJavaBasic/tree/master/KT6

**---------------------------------------------**


# Bài 7. Vehicle


**Một cửa hàng bán oto, xe máy cần quản lý các loại xe máy và xe ô tô. Trong đó xe máy có những thông tin : mã xe, tên xe, hãng, màu sắc, tốc độ tối đa, giá bán. Xe ô tô có những thông tin : mã xe, tên xe, hãng, màu sắc, mã lực, giá bán. Nhập danh sách các phương tiện và tiến hành liệt kê các xe theo hãng cần tìm kiếm. Biết rằng xe máy có mã bắt đầu bằng XM (ví dụ XM001), và ô tô có mã bắt đầu bằng OTO (ví dụ OTO521)**


Input Format

Dòng đầu tiên chứa N : số lượng phương tiện. Các dòng tiếp theo mô tả phương tiện, nếu là xe máy thì gồm 6 dòng : mã xe, tên xe, hãng, màu sắc, tốc độ tối đa, giá bán, nếu là ô tô thì gồm 6 dòng : mã xe, tên xe, hãng, màu sắc, mã lực, giá bán. Dòng cuối cùng là hãng xe cần tìm kiếm

Constraints

1<=N<=1000;

Output Format

In ra xe máy hoặc oto có hãng trùng với hãng tìm kiếm theo thứ tự xuất hiện, các thông tin của phương tiện được in cách nhau một dấu cách. Danh sách ô tô được liệt kê trước danh sách xe máy.

Sample Input 0


```lend
6
OTO1
TU2
NISSAN
Do
186
1200
XM2
SYM125
SYM
Do
200
100
XM3
SYM125
SYM
Vang
200
30
OTO4
F89
FORD
Do
204
850
XM5
HON112
HONDA
Trang
320
25
XM6
Z1000
KAWASAKI
Xanh
320
40
NISSAN
```

output

<pre>
DANH SACH XE HANG NISSAN :
OTO1 TU2 NISSAN Do 186 1200	
</pre>

https://github.com/Tieucuc2210/OppJavaBasic/tree/master/KT7
**--------------------------------------------------------------------**


#Bài 8. Giá bán giảm dần

**Một cửa hàng bán oto, xe máy cần quản lý các loại xe máy và xe ô tô. Trong đó xe máy có những thông tin : mã xe, tên xe, hãng, màu sắc, tốc độ tối đa, giá bán. Xe ô tô có những thông tin : mã xe, tên xe, hãng, màu sắc, mã lực, giá bán. Nhập danh sách các phương tiện và tiến hành liệt kê các xe theo thứ tự giá bán giảm dần, nếu 2 xe có cùng giá bán thì liệt kê theo thứ tự mã xe tăng dần(từ điển). Biết rằng xe máy có mã bắt đầu bằng XM (ví dụ XM001), và ô tô có mã bắt đầu bằng OTO (ví dụ OTO521)**



Input Format

Dòng đầu tiên chứa N : số lượng phương tiện. Các dòng tiếp theo mô tả phương tiện, nếu là xe máy thì gồm 6 dòng : mã xe, tên xe, hãng, màu sắc, tốc độ tối đa, giá bán, nếu là ô tô thì gồm 6 dòng : mã xe, tên xe, hãng, màu sắc, mã lực, giá bán.

Constraints

1<=N<=1000;

Output Format

In ra danh sách ô tô sau đó in ra danh sách xe máy, các thông tin của phương tiện được in cách nhau một dấu cách

Sample Input 0

```lengue
6
OTO1
TU2
NISSAN
Den
196
1200
XM2
SYM125
SYM
Den
200
30
XM3
SYM125
SYM
Den
200
40
OTO4
TOY555
TOYOTA
Vang
186
600
XM5
Z1000
KAWASAKI
Xanh
180
25
XM6
SUZ221
SUZUKI
Trang
220
30
```


Sample Output 0

<pre>
	DANH SACH OTO :
OTO1 TU2 NISSAN Den 196 1200
OTO4 TOY555 TOYOTA Vang 186 600
DANH SACH XE MAY :
XM3 SYM125 SYM Den 200 40
XM2 SYM125 SYM Den 200 30
XM6 SUZ221 SUZUKI Trang 220 30
XM5 Z1000 KAWASAKI Xanh 180 25
</pre>


https://github.com/Tieucuc2210/OppJavaBasic/tree/master/KT8
**-------------------------------------------------------**

# Bài 9. Mua xe


**Một cửa hàng bán oto, xe máy cần quản lý các loại xe máy và xe ô tô. Trong đó xe máy có những thông tin : mã xe, tên xe, hãng, màu sắc, tốc độ tối đa, giá bán. Xe ô tô có những thông tin : mã xe, tên xe, hãng, màu sắc, mã lực, giá bán. Nhập danh sách các phương tiện và tiến hành liệt kê các xe có giá bán trong khoảng tìm kiếm. Biết rằng xe máy có mã bắt đầu bằng XM (ví dụ XM001), và ô tô có mã bắt đầu bằng OTO (ví dụ OTO521)**



Input Format

Dòng đầu tiên chứa N : số lượng phương tiện. Các dòng tiếp theo mô tả phương tiện, nếu là xe máy thì gồm 6 dòng : mã xe, tên xe, hãng, màu sắc, tốc độ tối đa, giá bán, nếu là ô tô thì gồm 6 dòng : mã xe, tên xe, hãng, màu sắc, mã lực, giá bán. Dòng cuối cùng là khoảng giá cần tìm kiếm.

Constraints

1<=N<=1000;

Output Format

In ra các phương tiện có giá bán trong khoảng tìm kiếm. Đầu tiên liệt kê các xe oto sau đó liệt kê các xe máy. Các thông tin của phương tiện được in cách nhau một dấu cách

Sample Input 0


```addsa
5
OTO1
TOY555
TOYOTA
Vang
220
600
XM2
Ex
YAMAHA
Trang
200
30
XM3
HON112
HONDA
Xanh
180
30
OTO4
TOY555
TOYOTA
Do
186
600
XM5
Ex
YAMAHA
Xanh
220
40
564 1064
```



Output



<pre>
DANH SACH OTO :
OTO1 TOY555 TOYOTA Vang 220 600
OTO4 TOY555 TOYOTA Do 186 600
DANH SACH XE MAY :	
</pre>

https://github.com/Tieucuc2210/OppJavaBasic/tree/master/KT9

**000000000000000000000000000000000000000000000000000000**



#Bài 10. Tìm kiếm xe

**Một cửa hàng bán oto, xe máy cần quản lý các loại xe máy và xe ô tô. Trong đó xe máy có những thông tin : mã xe, tên xe, hãng, màu sắc, tốc độ tối đa, giá bán. Xe ô tô có những thông tin : mã xe, tên xe, hãng, màu sắc, mã lực, giá bán. Nhập danh sách các phương tiện và tiến hành liệt kê các xe có tên tìm kiếm theo thứ tự xuất hiện trong danh sách. Biết rằng xe máy có mã bắt đầu bằng XM (ví dụ XM001), và ô tô có mã bắt đầu bằng OTO (ví dụ OTO521)**


Input Format

Dòng đầu tiên chứa N : số lượng phương tiện. Các dòng tiếp theo mô tả phương tiện, nếu là xe máy thì gồm 6 dòng : mã xe, tên xe, hãng, màu sắc, tốc độ tối đa, giá bán, nếu là ô tô thì gồm 6 dòng : mã xe, tên xe, hãng, màu sắc, mã lực, giá bán. Dòng cuối cùng là tên xe cần tìm kiếm.

Constraints

1<=N<=1000;

Output Format

In ra các phương tiện có tên tìm kiếm. Đầu tiên liệt kê các xe oto sau đó liệt kê các xe máy. Các thông tin của phương tiện được in cách nhau một dấu cách


input


```dddd
5
OTO1
HONDAT5
HONDA
Vang
186
850
XM2
HON112
HONDA
Xanh
200
40
XM3
HON112
HONDA
Vang
180
100
OTO4
TOY555
TOYOTA
Vang
150
2400
XM5
Ex
YAMAHA
Trang
220
28
TOY555
```


output

<pre>
DANH SACH OTO :
OTO4 TOY555 TOYOTA Vang 150 2400
DANH SACH XE MAY :	
</pre>




https://github.com/Tieucuc2210/OppJavaBasic/tree/master/KT10
