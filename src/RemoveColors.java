public class RemoveColors {
    public boolean winnerOfGame(String colors) {
        //corner case
        if (colors == null || colors.length() <= 2) {
            return false;
        }

        char[] array = colors.toCharArray();
        int alice_cnt = 0;
        int bob_cnt = 0;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == 'A' && array[i - 1] == 'A' && array[i + 1] == 'A') {
                alice_cnt++;
            } else if (array[i] == 'B' && array[i - 1] == 'B' && array[i + 1] == 'B') {
                bob_cnt++;
            }
        }

        if (alice_cnt == 0) {
            return false;
        }

        if (alice_cnt <= bob_cnt) {
            return false;
        }
        return true;
    }
}


/*
clarification:
    input: colors --> string,
    output: boolean --> Alice win --> true and the other player wins --> false


assumption:
    starting from index 0 to the end

high level solution
    step 1: iterate over the given colors and cont # of A such that its neighors are As; also count the # of B such that its neighbors are Bs

    step 2: #A = 0 --> false
            #A < #B --> false
            others true
*/