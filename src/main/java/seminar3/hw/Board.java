package seminar3.hw;

public class Board {
    private char[][] board;

    public Board() {
        // Создаем доску. Это двумерный массив или же матрица типа 3х3, содержащая
        // символы.
        board = new char[3][3];
        // Заполняем доску по умолчанию символами минус '-'.
        initializeBoard();
    }

    // Инициализируем игровую доску символами '-'
    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Функция печатает доску в нужном виде на экран консоли.
    public void printBoard() {
        // Сначала печатаем линию вверху доски.
        System.out.println("---------");
        // Далее входим в цикл, в котором сначала в строке печатаем черточку
        //  с пробело'| ', потом идем во внутренний цикл, сначала он отрабатывает полностью,
        // затем мы только попадаем на следующий виток внешнего цыкла.
        // Внутрений цикл печатает строку из символов в ячейке матрицы с определенным индексом и
        // и разделительной вертикальной чертой.
        // После отработки внутреннего цикла печатается строка из черточек, разделяющая
        //  каждую строку на доске.
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n---------");
        }
    }

    // Проверяем, является ли выбранная ячейка пустой
    // здесь возвращается True или False в зависимости от того, выполняется ли условие,
    // что в определенной ячейке с определенными индексами содержится символ '-"
    // ,  что означает пустую ячейку.
    public boolean isCellEmpty(int row, int col) {
        return board[row][col] == '-';
    }


    // Устанавливаем символ выбранного игрока в ячейку
    // это процедура устанавливающая в определенную ячейку
    // символ определенной игрока (X или 0)
    public void setCell(int row, int col, char currentPlayer) {
        board[row][col] = currentPlayer;
    }

    // Проверяем, является ли игровая доска полной
    // Здесь с помощью двойного цикла проходим по каждой ячейке
    // и смотрим, если хоть раз провалимся в условие, что в ячейке хранится символ
    // '-', то вернется False. Если мы пройдем по циклу и так и не появится False,
    // то вернется True, что значит, что вся доска заполнена символами игроков, а не
    // дефолтным '-'.
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    // Проверяем, есть ли победитель
    // Здесь проверяем все возможные комбинации на одниковые символы одного игрока.
    // Если хоть где-то есть, значит есть победитель, если нету, то вернется False.
    public boolean hasWinner(char currentPlayer) {
        // Проверяем строки на наличие одинаковых символов
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
        }

        // Проверяем столбцы на наличие одинаковых символов
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer && board[1][j] == currentPlayer && board[2][j] == currentPlayer) {
                return true;
            }
        }

        // Проверяем диагонали на наличие одинаковых символов
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }

        return false;
    }
}