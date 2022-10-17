public class PrettyNumbers {

    String[] zero = new String[6];
    String[] one = new String[6];
    String[] two = new String[6];
    String[] three = new String[6];
    String[] four = new String[6];
    String[] five = new String[6];
    String[] six = new String[6];
    String[] seven = new String[6];
    String[] eight = new String[6];
    String[] nine = new String[6];
    String[] min = new String[6];

    PrettyNumbers() {
        createZero();
        createOne();
        createTwo();
        createThree();
        createFour();
        createFive();
        createSix();
        createSeven();
        createEight();
        createNine();
        createMin();
    }

    void createZero() {
        zero[0] = " _______ ";
        zero[1] = "|  ___  |";
        zero[2] = "| |   | |";
        zero[3] = "| |   | |";
        zero[4] = "| |___| |";
        zero[5] = "|_______|";
    }
    void createOne() {
        one[0] = "     ___ ";
        one[1] = "   / _  |";
        one[2] = "  / / | |";
        one[3] = " |_/  | |";
        one[4] = "      | |";
        one[5] = "      |_|";
    }
    void createTwo() {
        two[0] = " _______ ";
        two[1] = "|_____  |";
        two[2] = " _____| |";
        two[3] = "|  _____|";
        two[4] = "| |_____ ";
        two[5] = "|_______|";
    }
    void createThree() {
        three[0] = " _______ ";
        three[1] = "|_____  |";
        three[2] = " _____| |";
        three[3] = "|______ |";
        three[4] = " _____| |";
        three[5] = "|_______|";
    }
    void createFour() {
        four[0] = "___   ___";
        four[1] = "| |   | |";
        four[2] = "| |___| |";
        four[3] = "|_____  |";
        four[4] = "      | |";
        four[5] = "      |_|";
    }
    void createFive() {
        five[0] = " _______ ";
        five[1] = "| ______|";
        five[2] = "| |______";
        five[3] = "|_____  |";
        five[4] = " _____| |";
        five[5] = "|_______|";
    }
    void createSix() {
        six[0] = " _______ ";
        six[1] = "| ______|";
        six[2] = "| |______";
        six[3] = "|  ___  |";
        six[4] = "| |___| |";
        six[5] = "|_______|";
    }
    void createSeven() {
        seven[0] = " _______ ";
        seven[1] = "|_____  |";
        seven[2] = "    __| |";
        seven[3] = "    \\__ |";
        seven[4] = "      | |";
        seven[5] = "      |_|";
    }
    void createEight() {
        eight[0] = " _______ ";
        eight[1] = "|  ___  |";
        eight[2] = "| |___| |";
        eight[3] = "|  ___  |";
        eight[4] = "| |___| |";
        eight[5] = "|_______|";
    }
    void createNine() {
        nine[0] = " _______ ";
        nine[1] = "|  ___  |";
        nine[2] = "| |___| |";
        nine[3] = "|_____  |";
        nine[4] = "______| |";
        nine[5] = "\\_______|";
    }

    void createMin() {
        min[0] = "       _              ()   _";
        min[1] = "      | |_________    _   | |_______";
        min[2] = " ()   |  __   __  |  | |  |  _____  |";
        min[3] = " ()   | |  | |  | |  | |  | |     | |";
        min[4] = "      | |  | |  | |  | |  | |     | |";
        min[5] = "      | |  |_|  |_|  |_|  |_|     |_|";
    }

    int[] splitInt(int num) {
        int[] out = new int[2];
        String number = "";
        if (num > 9) {
            number += num + "";
        } else {
            number += "0" + num;
        }
        out[0] = Integer.parseInt(number.charAt(0) + "");
        out[1] = Integer.parseInt(number.charAt(1) + "");
        return out;
    }
    String[] getStringFromInt(int num) {
        switch (num) {
            case 1:
                return one;
            case 2:
                return two;
            case 3:
                return three;
            case 4:
                return four;
            case 5:
                return five;
            case 6:
                return six;
            case 7:
                return seven;
            case 8:
                return eight;
            case 9:
                return nine;
            default:
                return zero;
        }
    }
    String createOutput(int num) {
        int[] arr = splitInt(num);
        String[][] arrString = new String[2][7];
        arrString[0] = getStringFromInt(arr[0]);
        arrString[1] = getStringFromInt(arr[1]);
        String out = "\n\n\n\n\n\n\n\n\n";
        for(int i = 0; i < arrString[0].length; i++) {
            out += "\t\t\t";
            out += arrString[0][i] + "  " + arrString[1][i] + "  " + min[i] + "\n";
        }
        out += "\n\n\n\n\n\n\n\n\n";
        return out;
    }


    String toString(String[] strings) {
        String out = "";
        for (String string: strings) {
            out += string + "\n";
        }
        return out;
    }

    public static void main(String[] args) {
        PrettyNumbers numbers = new PrettyNumbers();
        System.out.println(numbers.createOutput(2));
        System.out.println(numbers.toString(numbers.min));
    }
}
