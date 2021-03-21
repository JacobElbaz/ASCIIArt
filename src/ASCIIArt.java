import java.util.*;

public class ASCIIArt {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = 4;
        int H = 5;
        System.out.println("Enter text: ");
        String T = in.nextLine();
        String[] alphabeta = new String[H];
        String[] alphabetax = new String[H];
        int index = 26;
        alphabetax[0] = " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ";
        alphabetax[1] = "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ";
        alphabetax[2] = "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ";
        alphabetax[3] = "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ";
        alphabetax[4] = "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  ";

        for (int j = 0; j < T.length(); j++) {
            if (T.charAt(j) <= 'Z' && T.charAt(j) >= 'A') {
                index = T.charAt(j) - 65;
            }
            else if (T.charAt(j) <= 'z' && T.charAt(j) >= 'a'){
                index = T.charAt(j) - 97;
            }
            else {
                index = 26;
            }
            for (int i = 0; i < H; i++) {
                if (alphabeta[i] != null) {
                    alphabeta[i] = alphabeta[i] + alphabetax[i].substring(index*L, index*L+L);
                }
                else {
                    alphabeta[i] = alphabetax[i].substring(index*L, index*L+L);
                }
            }
        }
        for (int k = 0; k < H; k++) {
            System.out.println(alphabeta[k]);
        }
    }
}
