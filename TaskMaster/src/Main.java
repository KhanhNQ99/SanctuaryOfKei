import java.util.Scanner;

public class Main {
    //Tạo hàm nhập input số
    //Nếu input không phải số thì bắt nhập lại (tạo điều kiện)
    public static int Nhap() {
        {
            Scanner input = new Scanner(System.in);
            boolean check = false;
            int n = 0;
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
            return (n);
        }
    }

    //Tạo hàm main nhập chương trình
    public static void main(String[] args) {
        System.out.println("Having trouble with math?");
        System.out.println("====================================|====================================|====================================|");
        System.out.println("1: to have an awesome mega java     |  7: change from bi to oct          | 13: divine to 3 & 5                |");
        System.out.println("2: change from dec to bi            |  8: output your java's pc          | 14: find LCM & GCD (ucln & bcnn)   |");
        System.out.println("3: change from dec to hex           |  9: sum of num in 1 (123 = 6)      | 15: 28 = 2 x 2 x 7                 |");
        System.out.println("4: change from dec to oct           | 10: reverse string                 | 16: Output Prime number 0 ->Input  |");
        System.out.println("5: change from bi to dec            | 11: count char, spaces and sc      | 17: Fibonacci?                     |");
        System.out.println("6: change from bi to hex            | 12: input char output ascii        | 18:                                |");
        System.out.printf("Input : ");
        int n = Nhap();
        //Dùng switch-case để chọn lựa bài toàn, nhập sai sẽ phải nhập lại
        switch (n) {
            case 1:
                Execute bai1 = new Execute();
                bai1.Bai1();
                break;

            case 2:
                Execute bai2 = new Execute();
                bai2.Bai2();
                break;

            case 3:
                Execute bai3 = new Execute();
                bai3.Bai3();
                break;

            case 4:
                Execute bai4 = new Execute();
                bai4.Bai4();
                break;

            case 5:
                Execute bai5 = new Execute();
                bai5.Bai5();
                break;

            case 6:
                Execute bai6 = new Execute();
                bai6.Bai6();
                break;

            case 7:
                Execute bai7 = new Execute();
                bai7.Bai7();
                break;

            case 8:
//                Execute bai8 = new Execute();
//                bai8.Bai8();
//                break;
                System.out.println("problem too hard to handle hmu hmu");
                break;

            case 9:
                Execute bai9 = new Execute();
                bai9.Bai9();
                break;

            case 10:
                Execute bai10 = new Execute();
                bai10.Bai10();
                break;

            case 11:
//                Execute bai11 = new Execute();
//                bai11.Bai11();
//                break;
                System.out.println("problem too hard to handle hmu hmu");
                break;

            case 12:
                Execute bai12 = new Execute();
                bai12.Bai12();
                break;

            case 13:
                Execute bai13 = new Execute();
                bai13.Bai13();
                break;

            case 14:
                Execute bai14 = new Execute();
                bai14.Bai14();
                break;

            case 15:
                Execute bai15 = new Execute();
                bai15.Bai15();
                break;

            case 16:
                Execute bai16 = new Execute();
                bai16.Bai16();
                break;

            case 17:
                Execute bai17 = new Execute();
                bai17.Bai17();
                break;

            case 18:
                Execute bai18 = new Execute();
                bai18.Bai18();
                break;
        }
    }
}
