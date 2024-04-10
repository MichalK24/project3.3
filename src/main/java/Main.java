// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main

{

    public static void main(String[] args) {

        int szer = 10;

        int wys = 10;


        for (int i = 0; i < wys; i++)

        {

            for (int j = 0; j < szer; j++)

                if((i == 0)||(i == wys-1))

                  System.out.print('*');

                else

                if((j == 0)||(j == szer-1))System.out.print('*');

                else System.out.print(' '); 

            System.out.println();

        }

    }

}