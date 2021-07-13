import java.util.Scanner;

public class Execute {
    public void Bai1() {
        //chạy chương trình theo đề bài
        System.out.println("   J    a   v     v  a                                                  \n" +
                "   J   a a   v   v  a a                                                 \n" +
                "J  J  aaaaa   V V  aaaaa                                                \n" +
                " JJ  a     a   V  a     a\n");
    }

    public void Bai2() {
        //tạo hàm nhập dữ liệu kiểu int và kiểm tra điều kiện nếu sai báo lỗi và nhập lại
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        System.out.print("Input value: ");
        while (!check) {
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Input number only!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        //chạy chương trình chuyển từ thập phân sang nhị phân
        System.out.print("Bionary version of " + n + " is: ");
        System.out.println(Integer.toBinaryString(n));
    }

    public void Bai3() {
        //tạo hàm nhập dữ liệu kiểu int và kiểm tra điều kiện nếu sai báo lỗi và nhập lại
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        System.out.print("Input value: ");
        while (!check) {
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Input number only!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        //chạy chương trình chuyển từ thập phân sang lục phân
        System.out.print("Hex version of " + n + " is: ");
        System.out.println(Integer.toHexString(n));
    }

    public void Bai4() {
        //tạo hàm nhập dữ liệu kiểu int và kiểm tra điều kiện nếu sai báo lỗi và nhập lại
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        System.out.print("Input value: ");
        while (!check) {
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Input number only!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        //chạy chương trình chuyển từ thập phân sang bát phân
        System.out.print("Hex version of " + n + " is: ");
        System.out.println(Integer.toOctalString(n));
    }

    public void Bai5() {
        //tạo hàm nhập dữ liệu kiểu int (số nhị phân) và kiểm tra điều kiện nếu sai báo lỗi và nhập lại
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        System.out.print("Input Binary value: ");
        while (!check) {
            try {
                n = input.nextInt();
                Integer.parseInt(String.valueOf(n), 2);
                if (n > 0) {
                    check = true;
                }
            } catch (Exception e) {
                System.out.println("Input Bi only (just 0 and 1)!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        //chạy chương trình chuyển từ nhị phân sang thập phân
        System.out.print("Demical version of " + n + " is: ");
        System.out.println(Integer.toBinaryString(n));
    }

    public void Bai6() {
        //tạo hàm nhập dữ liệu kiểu int (số nhị phân) và kiểm tra điều kiện nếu sai báo lỗi và nhập lại
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        System.out.print("Input Binary value: ");
        while (!check) {
            try {
                n = input.nextInt();
                Integer.parseInt(String.valueOf(n), 2);
                if (n > 0) {
                    check = true;
                }
            } catch (Exception e) {
                System.out.println("Input Bi only (just 0 and 1)!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        //chạy chương trình chuyển từ nhị phân sang lục phân
        System.out.print("Hex version of " + n + " is: ");
        System.out.println(Integer.toHexString(n));
    }

    public void Bai7() {
        //tạo hàm nhập dữ liệu kiểu int (số nhị phân) và kiểm tra điều kiện nếu sai báo lỗi và nhập lại
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        System.out.print("Input Binary value: ");
        while (!check) {
            try {
                n = input.nextInt();
                Integer.parseInt(String.valueOf(n), 2);
                if (n > 0) {
                    check = true;
                }
            } catch (Exception e) {
                System.out.println("Input Bi only (just 0 and 1)!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        //chạy chương trình chuyển từ nhị phân sang bát phân
        System.out.print("Oct version of " + n + " is: ");
        System.out.println(Integer.toOctalString(n));
    }

    public void Bai9() {
        //tạo hàm nhập dữ liệu kiểu int và kiểm tra điều kiện nếu sai báo lỗi và nhập lại
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        System.out.print("Input value: ");
        while (!check) {
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Input number only!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        //chạy chương trình in ra tổng của các phần tử trong 1 số vd 123 = 6
        //chia lấy phần dư %10 để lấy các phần từ bên phải
        //cộng các phần tử đã chia vào 1 biến
        //chia lấy phần tử để loại bỏ các phần từ đã cộng
        int m;
        int sum = 0;
        while (n != 0) {
            m = n % 10;
            sum += m;
            n /= 10;
        }
        System.out.println("Output: " + sum);
    }

    public void Bai10() {
        //tạo hàm nhập dữ liệu kiểu String và kiểm tra điều kiện nếu sai báo lỗi và nhập lại
        Scanner input = new Scanner(System.in);
        boolean check = false;
        String n = "";
        System.out.print("Input value: ");
        while (!check) {
            try {
                n = input.nextLine();
                check = true;
            } catch (Exception e) {
                System.out.println("Input String only!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        //chia từng kí tự và đưa từng cái vào 1 mảng
        String[] words = n.split(" ");
        String u = "";
        //chạy từ đầu đến cuối độ dài string để lấy giá trị từng char
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            System.out.println(word);
            String reverseWord = "";
            //chạy từ cuồi độ dài string đến đầu để gán vào biến string cần tìm
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            u = u + reverseWord + " ";
        }
        System.out.print("Output: " + u);
    }

    public void Bai11() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        System.out.print("Input value: ");
        while (!check) {
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Input number only!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        System.out.println(n);
    }

    public void Bai12() {
        //tạo hàm nhập dữ liệu kiểu char và kiểm tra điều kiện nếu sai báo lỗi và nhập lại
        Scanner input = new Scanner(System.in);
        boolean check = false;
        char n = 0;
        System.out.print("Input value: ");
        while (!check) {
            try {
                n = input.next().charAt(0);
                check = true;
            } catch (Exception e) {
                System.out.println("Input char only!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        int ascii = n;
        System.out.println("Output: " + ascii);
    }

    public void Bai13() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        System.out.print("Input value: ");
        while (!check) {
            try {
                n = input.nextInt();
                if (n > 0 && n < 100)
                    check = true;
            } catch (Exception e) {
                System.out.println("Input number 0-100 only!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        for (int i = 0; i <= n; i++)
            if (i % 3 == 0 && i % 5 == 0)
                System.out.printf(i + " ");
        System.out.println("\n");
    }

    public void Bai14() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int a = 0, b = 0;
        System.out.print("Input value: ");
        while (!check) {
            try {
                System.out.print("a = ");
                a = input.nextInt();
                System.out.print("b = ");
                b = input.nextInt();
                if (a > 0 && b > 0)
                    check = true;
            } catch (Exception e) {
                System.out.println("Input number only!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        int bcnn = a * b;
        if (a > b) a = a - b;
        else a = b - a;
        int ucln = a;
        System.out.println("UCLN: " + ucln);
        System.out.println("BCNN: " + bcnn / ucln);
    }

    public boolean checkSNT(int n) {
        if (n <= 2) {
            return true;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void Bai15() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        System.out.print("Input value: ");
        while (!check) {
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Input number only!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        System.out.print(n + " = ");
        for (int i = 2; i <= n; i++) {
            while (checkSNT(i) && (n % i == 0)) {
                System.out.print(i);
                n /= i;
                if (i <= n) System.out.printf(" x ");
            }
        }
    }

    public void Bai16() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        System.out.print("Input value: ");
        while (!check) {
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Input number only!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        int num;
        String nt = "";
        for (int i = 1; i <= n; i++) {
            int dem = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                nt += i + " ";
            }
        }
        System.out.println("Prime number ===> " + nt);
    }

    public void Bai17() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        System.out.print("Input value: ");
        while (!check) {
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Input number only!!!...");
                System.out.printf("Retype: ");
                input.nextLine();
            }
        }
        int[] fi = new int[n + 1];
        fi[0] = 0;
        fi[1] = 1;
        for (int i = 2; i <= n; i++) {
            fi[i] = fi[i - 1] + fi[i - 2];
        }
        System.out.println("Output Fibonancii of " + n + " is: f[" + n + "]= " + fi[n]);
    }

    public void Bai18() {

    }
}









