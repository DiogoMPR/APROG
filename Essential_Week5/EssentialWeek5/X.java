import java.util.Scanner;
public class X {
    public static void main(String[]args){
        Scanner ler=new Scanner(System.in);
        int codigo;
        System.out.println("Insira o código pretendido!");
        codigo= ler.nextInt();
        switch (codigo){
            case 1:
                System.out.println("Tag Heuer");
                break;
            case 2:
                System.out.println("Rolex");
                break;
            case 3:
                System.out.println("Omega");
                break;
            case 4:
                System.out.println("Cartier");
                break;
            case 5:
                System.out.println("Bvlgari");
                break;
            case 6:
                System.out.println("Raymond Weil");
                break;
            default:
                System.out.println("Invalid brand");
                break;
        }
    }
}