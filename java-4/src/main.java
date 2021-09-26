import java.util.Random;
import java.util.Scanner;

public class main
{
    // размер игрового поля
    static final int SIZE = 3;

    // само игроое поле
    static char[][] field;

    // отображение пустого поля
    static final char DOT_EMPTY = '.';

    // Фишка игрока
    static final char DOT_PLAYER = 'X';

    // фишка компьютера
    static final char DOT_AI = '0';

    // запуск программы
    public static void main(String[] args)
    {
        initField(); // создаем игровое поле
        printField(); // выводим игровое поле

        // делаем ходы по очереди с компьютером пока есть свободные ячейки
        do
        {
            // ход игрока
            if (!hasTurn())
            {
                break;
            }

            playerTurn(); // ход игрока
            printField(); // выводим игровое поле

            // проверка победы игрока
            if(isWin(DOT_PLAYER))
            {
                System.out.println("Игрок победил");
                break;
            }


            // ход компьютера
            if (!hasTurn())
            {
                break;
            }

            aiTurn();
            printField(); // выводим игровое поле

            // проверка победы компьютера
            if(isWin(DOT_AI))
            {
                System.out.println("Компьютер победил");
                break;
            }

        } while (true);

        // ячейки закнчились но никто не победил
        System.out.println("Конец игры");
    }

    // инициализация игрового поля
    public static void initField()
    {
        // инициализируем игровое поле
        field = new char[SIZE][SIZE];

        // перебираем строки игрового поля
        for (int i = 0; i < SIZE; i++)
        {
            // перебираем столбцы игрового поля
            for (int j = 0; j < SIZE; j++)
            {
                // создаем пустую ячейку
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    // отображение игрового поля
    public static void printField()
    {
        // отображаем горизонтальную шапку
        for (int i = 0; i <= SIZE; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        // перебираем строки игрового поля
        for (int i = 0; i < SIZE; i++)
        {
            // отображаем вертикальную шапку
            System.out.print((i + 1) + " ");

            // перебираем столбцы игрового поля
            for (int j = 0; j < SIZE; j++)
            {
                // выводим содержимое игровой ячейки
                System.out.print(field[i][j] + " ");
            }

            // перенос строки
            System.out.println();
        }
    }

    // проверка доступности ячейки
    public static boolean canTurn(int x, int y)
    {
        // проверяем что ход попал в диапазон от 0 до 2
        if (x < 0 || y < 0 || x > SIZE || y > SIZE)
        {
            return false;
        }

        // проверяем что ячейка свободна
        if( field[y][x] != DOT_EMPTY)
        {
            return false;
        }

        return true;
    }

    // ход человека
    public static void playerTurn()
    {
        // создаем сканер для ввода из консоли
        Scanner sc = new Scanner(System.in);
        int x;
        int y;

        // делаем ход пока не попадем в пустую ячейку
        do
        {
            // ввод из консоли
            System.out.println("Сделайте ход X, Y:");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while(!canTurn(x,y));

        // ставим фишку игрока в выбранную ячейку
        field[y][x] = DOT_PLAYER;
    }

    // ход компьютера
    public static void aiTurn()
    {
        // создаем рандом
        Random rn = new Random();
        int x;
        int y;

        // ищем случайную пустую ячейку
        do
        {
            x = rn.nextInt(SIZE);
            y = rn.nextInt(SIZE);
        }
        while(!canTurn(x, y));

        //отображаем ход компьютера
        System.out.println("Ход компьютера Х, Y:");
        System.out.println(x);
        System.out.println(y);

        // ставим фишку компьютера в соответствующую ячейку
        field[y][x] = DOT_AI;
    }

    // проверяем что на игровом поле остались пустые ячейки
    // true - есть пустые ячейки, false - ячеек нет
    public static boolean hasTurn()
    {
        // перебираем все ячейки игрового поля
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                // если ячейка пустая то возвращаем true
                if (field[i][j] == DOT_EMPTY)
                {
                    return true;
                }
            }
        }

        // если не нашлось ни одной свободной ячейки то возвращаем false
        return false;
    }

    // проверка победы
    public static boolean isWin(char dot)
    {
        // количество фишек в одной линии
        int dotCount;

        // проверяем есть ли выйгрышные строки
        for (int i = 0; i < SIZE; i++)
        {
            dotCount = 0; // обнуляем счетчик фишек

            for (int j = 0; j < SIZE; j++)  // считаем количество фишек в одной линии
            {
                // если в текущей ячейке нужная фишка, то увеличиваем счетчик
                if (field[i][j] == dot)
                {
                    dotCount++;
                }
            }
            // проверка счетчика
            if(dotCount == SIZE)
            {
                return true;
            }


        }

        // проверяем есть ли выйгрышные столбцы
        for (int j = 0; j < SIZE; j++ )
        {
            dotCount = 0; // обнуляем счетчик фишек
            for (int i = 0; i < SIZE; i++)
            {
                // если в текущей ячейке нужная фишка, то увеличиваем счетчик
                if (field[i][j] == dot)
                {
                    dotCount++;
                }
            }
            // проверка счетчика
            if(dotCount == SIZE)
            {
                return true;
            }
        }

        // проверяем первую диагональ
        dotCount = 0; // обнуляем счетчик фишек
        for (int i = 0; i < SIZE; i++)
        {
            if (field[i][i] == dot)
            {
                dotCount++;
            }
            // проверка счетчика
            if(dotCount == SIZE)
            {
                return true;
            }
        }

        // проверяем вторую диагональ
        dotCount = 0; // обнуляем счетчик фишек
        for (int i = 0; i < SIZE; i++)
        {
            if (field[i][SIZE - i - 1] == dot)
            {
                dotCount++;
            }
            // проверка счетчика
            if(dotCount == SIZE)
            {
                return true;
            }
        }

        return false;
    }


}
