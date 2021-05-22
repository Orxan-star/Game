import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner daxil = new Scanner(System.in);


        int k=15;
        int kamp;
        int men;

        while(k>=0)
        {

            System.out.println("1-3 arasi eded daxil edin! ");
            men = daxil.nextInt();
            if(men>3 || men<0)
            {
                System.out.println("SEchdiyiniz eded duzgun deyil yeniden cehd edin! ");
                System.out.println("1-3 arasi eded daxil edin! ");
                men= daxil.nextInt();
                if(men>3)
                {
                    System.out.println("Siz sehv eded daxil etdiyniz uchun uduzdunuz !!!");
                }
                break;
            }

            k=k-men;

            if(k==0 || k<0)
            {
                System.out.println("Siz oyunu uduzdunuz !!!");
                break;
            }

            System.out.printf("Qaliqda [ %d ] ededi qaldi! \n", k);

            if(k==1)
            {
                kamp=1;
                System.out.println("Siz oyunda QALIB oldunuz !!!");
                break;
            }

            if(k==2)

            {
                kamp=rand.nextInt(2)+1;
                if (kamp==1)
                {
                    System.out.println("Siz oyunu uduzdunuz !!!");
                    break;
                }

                System.out.printf("Kamputer [ %d ] ededi daxil etdi! \n",kamp);

                k=k-kamp;
                if(k==0 || k<0)
                {
                    System.out.println("Siz oyunda QALIB oldunuz !!!");
                    break;
                }
            }

            kamp=rand.nextInt(3)+1;

            System.out.printf("Kamputer [ %d ] ededi daxil etdi! \n",kamp);
            k=k-kamp;

            if(k==0 || k<0)
            {
                System.out.println("Siz oyunda QALIB oldunuz !!!");
                break;
            }

            System.out.printf("Qaliqda [ %d ] ededi qaldi! \n",k);


        }
        System.out.println("\nOYUN BITTI !!!");

    }
}
