package Alphabets;

public class AlphabetPattern {
    public static void main(String[] args) {
        letter_A(5);
        System.out.println();
        letter_B(5);
        System.out.println();
        letter_C(5);
        System.out.println();
        letter_D(5);
        System.out.println();
        letter_E(5);
        System.out.println();
        letter_F(5);
        System.out.println();
        letter_G(5);
        System.out.println();
        letter_H(5);
        System.out.println();
        letter_I(5);
        System.out.println();
        letter_J(5);
        System.out.println();
        letter_K(5);
        System.out.println();
        letter_L(5);
        System.out.println();
        letter_M(5);
        System.out.println();
        letter_N(5);
        System.out.println();
        letter_O(5);
        System.out.println();
        letter_P(5);
        System.out.println();
        letter_Q(5);
        System.out.println();
        letter_R(5);
        System.out.println();
        letter_S(5);
        System.out.println();
        letter_T(5);
        System.out.println();
        letter_U(5);
        System.out.println();
        letter_V(9);
        System.out.println();
        letter_W(5);
        System.out.println();
        letter_X(9);
        System.out.println();
        letter_Y(5);
        System.out.println();
        letter_Z(5);
        System.out.println();
    }

    private static void letter_Q(int no) {
        System.out.println("Letter Q :");
        for (int row =0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if(row==0){
                    if(col==1||col==2){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                } else if (row == no - 1) {
                    if (col==1||col==2||col==4){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }else if (col ==0) {
                    if (row==1||row==2||row==3){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else if (col ==3) {
                    if (row==1||row==2||row==3){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }

                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_R(int no) {
        System.out.println("Letter R :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if (col==0){
                    System.out.print("* ");
                } else if (col==1) {
                    if (row==0||row==2){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else if (col==2) {
                    if (row==1||row==3||row==no-1){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_K(int no) {
        System.out.println("Letter K :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if (col==0){
                    System.out.print("* ");
                } else if (col==1) {
                    if (row==2){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else if (col==2) {
                    if (row==1||row==3||row==no-1){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else if (row==0) {
                    if (col==3){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_N(int no) {
        System.out.println("Letter N :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if (col==0||col==no-1){
                    System.out.print("* ");
                } else if (row==col) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_S(int no) {
        System.out.println("Letter S :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if (row==0||row==2||row==4){
                    System.out.print("* ");
                } else if (row==1) {
                    if(col==0) {
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                }
                else if (row==3) {
                    if (col == no - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_Z(int no) {
        System.out.println("Letter Z :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if (row==0||row==no-1){
                    System.out.print("* ");
                } else if (col==4-row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_Y(int no) {
        System.out.println("Letter Y :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if (col==2){
                    if(row==2||row==3||row==4){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                else if (row==1) {
                    if (col == 1 || col == 3) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                else if (row==0) {
                    if(col==0||col==4){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_W(int no) {
        System.out.println("Letter W :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if (col==0||col==no-1) {
                    System.out.print("* ");
                }
                else if(row==3){
                    if (col==1||col==3) {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                else if(row==2){
                    if (col==2) {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_X(int no) {
        System.out.println("Letter X :");
        for (int row = 1; row <=no; row++) {
            for (int column = 1; column <=no; column++) {
                if(column==row||column==10-row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    private static void letter_V(int no) {
        System.out.println("Letter v :");
        for (int row = 1; row <=5; row++) {
            for (int column = 1; column <=no; column++) {
                if(column==row||column==10-row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }

    private static void letter_T(int no) {
        System.out.println("Letter T :");
        for (int row = 1; row <= no; row++) {
            for (int column = 1; column <= no; column++) {
                if(row==1||column==no/2){
                    System.out.print("* ");
                }else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_U(int no) {
        System.out.println("Letter U :");
        for (int row = 1; row <= no; row++) {
            for (int column = 1; column <= no; column++) {
                if (row == no) {
                    if (column == 1 || column == no) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                } else if (column == 1 || column == no) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_P(int no) {
        System.out.println("Letter P :");
        for (int row = 1; row <= no; row++) {
            for (int col = 1; col <= no; col++) {
                if (row == 1 || row == no) {
                    if (col != no) {
                        System.out.print("* ");
                    }
                } else if (col == 1 || col == no) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int row = 0; row <5; row++) {
            System.out.println("* ");
        }
    }

    private static void letter_M(int no) {
        System.out.println("Letter M :");
        for (int row = 0; row <no; row++) {
            for (int col = 0; col < no; col++) {
                if (col==0||col==no-1){
                    System.out.print("* ");
                } else if (row==1) {
                    if (col==1||col==3){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }else if (row==2) {
                    if (col==2){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    private static void letter_L(int no) {
        System.out.println("Letter L :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if(col==0||row==no-1){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_J(int no) {
        System.out.println("Letter J :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if (row==0){
                    System.out.print("* ");
                } else if (col==2) {
                    if (row!=no-1){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else if (col==0) {
                    if (row==2||row==3){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else if (row==4) {
                    if (col==1){
                        System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_I(int no) {
        System.out.println("Letter I :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if(row==0||row==no-1){
                    System.out.print("* ");
                } else if (col==no/2) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_H(int no) {
        System.out.println("Letter H :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if(col==0||col==no-1){
                    System.out.print("* ");
                } else if (row==no/2) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_G(int no) {
        System.out.println("Letter G :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if (col == 0) {
                    System.out.print("* ");
                }
                if (row == 0||row==no-1) {
                    if(col==0||col==1){
                        System.out.print("* ");
                    }
                }
                if (col ==no/2) {
                    if(row==0||row==1||row==no-1){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("  * ");
                    }
                }
                if(row==no/2){
                    if(col==3||col==4){
                        System.out.print("* ");
                    }
                }
                if(col==no-1){
                    if(row==0||row==1){
                        System.out.print(" ");
                    } else if (row==3) {
                        System.out.print("  *");
                    } else if (row==4) {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }







    private static void letter_B(int no) {
        System.out.println("Letter B :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if (row == 0||row==no/2||row==no-1) {
                    if(col==no-1) {
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                } else if (row==no-1||col==0||col==no-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_F(int no) {
        System.out.println("Letter F :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if (row == 0||row==no/2) {
                    System.out.print("* ");
                } else if (col==0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_E(int no) {
        System.out.println("Letter E :");
        for (int row = 0; row < no; row++) {
            for (int col = 0; col < no; col++) {
                if (row == 0 || row == no / 2 || row == no - 1) {
                    System.out.print("* ");
                } else if (col == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void letter_O(int no) {
        System.out.println("Letter O :");
        for (int row = 1; row <= no; row++) {
            for (int column = 1; column <= no; column++) {
                if (row == 1 || row == no) {
                    if (column == 1 || column == no) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                } else if (column == 1 || column == no) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void letter_D(int no) {
        System.out.println("Letter D :");
        for (int row = 1; row <= no; row++) {
            for (int col = 1; col <= no; col++) {
                if (row == 1 || row == no) {
                    if (col != no) {
                        System.out.print("* ");
                    }
                } else if (col == 1 || col == no) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void letter_C(int no) {
        System.out.println("Letter C :");
        for (int row = 0; row <no; row++) {
            for (int col = 0; col <no; col++) {
                if(row==0||row==no-1){
                    if(col==0||col==no-1) {
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }
                } else if (col==0) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void letter_A(int no) {
        System.out.println("Letter A :");
        for (int row = 0; row < no; row++) {
            for (int column = 0; column < no; column++) {
                if (row == 0 ) {
                    if(column==0||column==no-1) {
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                } else if (row == no / 2||column==0||column==no-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }
}

