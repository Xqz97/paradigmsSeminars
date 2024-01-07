package seminar3.hw;

import java.util.Scanner;

// Здесь формируется класс с атрибутами, доской и символом игрока.
// и тремя методами.

class TicTacToe {
    private Board board;
    private char currentPlayer;

    // Жесткий конструктор.
    public TicTacToe() {
        board = new Board();
        currentPlayer = 'X';
    }

    // Основной метод игры
    public void play() {
        // Создаем переменную, которая покажет, что игра закончилась.
        // Она помогает контролировать цикл для продолжения игры.
        boolean gameFinished = false;
        // Заходим в цикл, который будет продолжаться до тех пор, пока переменная gameFinished
        // True.
        while (!gameFinished) {
            board.printBoard(); // Выводим игровую доску на экран
            int[] move = getPlayerMove(); // Получаем ход от игрока
            // Забираем значения введенные игроком из массива move[].
            int row = move[0];
            int col = move[1];
            // Установка значения игрока в ячейку
            if (board.isCellEmpty(row, col)) { // Проверяем, что ячейка пустая
                board.setCell(row, col, currentPlayer); // Устанавливаем символ в ячейку
                // Проверка на победителя
                if (board.hasWinner(currentPlayer)) { // Проверяем наличие победителя
                    board.printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameFinished = true;
                } else if (board.isBoardFull()) { // Проверяем, что доска полная
                    board.printBoard();
                    System.out.println("It's a draw!");
                    gameFinished = true;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Переключаем текущего игрока
                }
            } else {
                System.out.println("Invalid move! Try again."); // Сообщаем об ошибочном ходе
            }
        }
    }

    // Получаем ход от игрока
    private int[] getPlayerMove() {
        // Создаем объект типа сканер для получения индексов ячейки с ходом игрока
        Scanner scanner = new Scanner(System.in);
        // Массив хранящий два значения с ходом по i и j
        int[] move = new int[2];
        // Печатаем, что ввести и как.
        System.out.print("Player " + currentPlayer + ", enter your move (row [1-3] column [1-3]): ");
        // То, что ввел пользователь -1, так как индексация в массиве меньше на 1, присваивам первому
        // и второму значению в массиве move.
        move[0] = scanner.nextInt() - 1;
        move[1] = scanner.nextInt() - 1;
        // Возвращаем move
        return move;
    }
}