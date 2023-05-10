import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, tram, chuc, dv;

        Scanner input = new Scanner(System.in);
        System.out.println("input number to read : ");
        number = input.nextInt();
        if(number<=12){
            checkNumberDv(number);
        }else if (number > 12 && number < 20) {
            readDv(number);
        } else if (number < 100) {
            dv = number % 10;
            chuc = ((number - dv) / 10) % 10;
            checkNumberDv(chuc);
            System.out.print("ty ");
            checkNumberDv(dv);
        } else if (number < 1000) {
            tram = number / 100;
            chuc = (number - tram*100) ;
            dv = number % 10;
            checkNumberDv(tram);
            System.out.print(" hundred ");
            if((chuc-dv)/10!=0) {
                System.out.print(" and ");
                if (chuc <= 12) {
                    checkNumberDv(chuc);
                } else if (chuc > 12 && chuc < 20) {
                    readDv(chuc);
                } else {
                    chuc = (chuc-dv)/10;
                    checkNumberDv(chuc);
                    System.out.print("ty ");
                    checkNumberDv(dv);
                }
            }
        }
    }

    public static void readDv(int number) {
        int dv = number % 10;
        checkNumberDv(dv);
        System.out.print("teem");
    }

    public static void checkNumberDv(int number) {
        switch (number) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
            case 10:
                System.out.print("Ten");
                break;
            case 11:
                System.out.print("Eleven");
                break;
            case 12:
                System.out.print("Twelve");
                break;
            default:
                System.out.print("out of ability");
        }
    }


}