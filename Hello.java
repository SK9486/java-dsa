import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hello {
    public static void main(String[] args) {
        int N = 7;
        int ed = (N * 2) - 1;
        char alp = 'A';
        alp += (N - 1);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < ed; j++) {
                if (j < i) {
                    System.out.print("* ");
                } else if (j >= (ed - i)) {
                    System.out.print("- ");
                } else {
                    System.out.print(alp + " ");
                }
            }
            alp--;
            System.out.println();
        }
    }
}