public class Pattern_Program_Practise {
    public static void main(String[] args) {
        Pattern_Program_Practise p = new Pattern_Program_Practise();
        p.pattern1(5);
        p.pattern2(5);
        p.pattern3(5);
        p.pattern4(5);
        p.pattern5(5);
        p.pattern6(5);
        p.pattern7(5);
        p.pattern8(5);
        p.pattern9(5);
        p.pattern10(5);
        p.pattern11(5);
        p.pattern12(5);
        p.pattern13(5);
        p.pattern14(5);
        p.pattern15(5);
        p.pattern16(5);
        p.pattern17(5);
        p.pattern18(5);
        p.pattern19(5);
        p.pattern20(5);
        p.pattern21(5);
        p.pattern22(5);
        p.pattern23(5);
        p.pattern24(5);
        p.pattern25(5);
        p.pattern26(5);
        p.pattern27(5);
        p.pattern28(5);
        p.pattern29(5);
        p.pattern30(5);
        p.pattern31(5);
        p.pattern32(5);
        p.pattern33(5);
        p.pattern34(5);


    }
    private void pattern34(int no) {
        System.out.println("\nNumber Pyramid ");
        for (int row = 1; row <= no; row++) {
            for (int colSpace = row; colSpace <=no ; colSpace++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    private void pattern33(int no) {
        System.out.println("\nNumber Inverted Left Triangle 2");
        for (int row = no; row>=1 ; row--) {
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
        for (int row = 1; row <=no ; row++) {
            for (int col = row; col >=1 ; col--) {
                System.out.print(col);
            }
            System.out.println();
        }

    }

    private void pattern32(int no) {
        System.out.println("\nNumber Inverted left Triangle 1");
        for (int row = no; row >1; row--) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        for (int row = 1; row <= no; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private void pattern31(int no) {
        System.out.println("\nNumber Half Diamond 1");
        for (int row = 1; row <=no ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        for (int row = no; row >1; row--) {
            for (int col = 1; col <row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private void pattern30(int no) {
        System.out.println("\nNumber Left Triangle 2");
        for (int row = 1; row <= no; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.println();
        }



    }

    private void pattern29(int no) {
        System.out.println("\nNumber Left Triangle 1");
        for (int row = 1; row <= no; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    private void pattern28(int no) {
        System.out.println("\n Exercise 28");
        for (int row = 1; row <no ; row++) {
            int num = row;
            for (int col = 1; col <=row ; col++) {
                System.out.print(num+" ");
                num = num + row;
            }
            System.out.println();
        }
        int num2 = 3;
        for (int row = no; row <8 ; row++) {
            int num1 = row;
            for (int col = row; col >=num2 ; col--) {
                System.out.print(num1+" ");
                num1 = num1 +row;
            }
            System.out.println();
            num2 = num2+2;
        }
    }

    private void pattern27(int no) {
        System.out.println("\nExercise 27");
        int num = 1;
        for (int row = 1; row <=no ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    private void pattern26(int no) {
        System.out.println("\nExercise 26");
        for (int row = no; row >= 1 ; row--) {
            for (int col = row; col <=no ; col++) {
                System.out.print(col+" ");
            }
            for (int col1 = row-1; col1 >=1 ; col1--) {
                System.out.print(5+" ");
            }
            System.out.println();
        }
    }

    private void pattern25(int no) {
        System.out.println("\nExercise 25");
        for (int row = 1; row <=no ; row++) {
            for (int colSpace = no; colSpace >=row ; colSpace--) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }

    private void pattern24(int no) {
        System.out.println("\nExercise 24");
        for (int row = 1; row <= no; row++) {
            for (int col = row; col <=no; col++) {
                System.out.print(col);
            }
            for (int col1 = no-1; col1 >=row ; col1--) {
                System.out.print(col1);
            }
            System.out.println();
        }
    }

    private void pattern23(int no) {
        System.out.println("\nExercise 23");
        for (int row = 1; row <= no; row++) {
            for (int colSpace = no; colSpace >row ; colSpace--) {
                System.out.print("1");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    private void pattern22(int no) {
        System.out.println("\nExercise 22");
        for (int row = 1; row <=no ; row++) {
            for (int col = 1; col <=no ; col++) {
                if (row == col) {
                    System.out.print(col);
                }
                else System.out.print("0");
            }
            System.out.println();
        }
    }

    private void pattern21(int no) {
        System.out.println("\nExercise 21");
        for (int row = 1; row <=no ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col%2+" ");
            }
            System.out.println();
        }
    }

    private void pattern20(int no) {
        System.out.println("\nExercise 20");
        for (int row = 1; row <=no ; row++) {
            for (int colSpace = no; colSpace >=row; colSpace--) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            for (int col1 = row-1; col1 >=1 ; col1--) {
                System.out.print(col1+" ");
            }
            System.out.println();
        }
    }


    private void pattern19(int no) {
        System.out.println("\nExercise 19");
        for (int row = no; row >=1 ; row--) {
            for (int colSpace = 1; colSpace <=row ; colSpace++) {
                System.out.print(" ");
            }
            for (int col = row; col <=no ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    private void pattern18(int no) {
        System.out.println("\nExercise 18");
        for (int row = 1; row <=no ; row++) {
            for (int colSpace = 1; colSpace <row ; colSpace++) {
                System.out.print(" ");
            }
            for (int col = row; col <=no ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        for (int row = no; row >=1 ; row--) {
            for (int colSpace = row-1; colSpace >=1 ; colSpace--) {
                System.out.print(" ");
            }
            for (int col = row; col <=no ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    private void pattern17(int no) {
        System.out.println("\nExercise 17");
        for (int row = 1; row <=no ; row++) {
            for (int colSpace = 1; colSpace <row ; colSpace++) {
                System.out.print(" ");
            }
            for (int col = row; col <=no ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for (int row = no; row >=1 ; row--) {
            for (int colSpace = row-1; colSpace >=1 ; colSpace--) {
                System.out.print(" ");
            }
            for (int col = row; col <=no ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    private void pattern16(int no) {
        System.out.println("\nExercise 16");
        for (int row = 1; row <no ; row++) {
            for (int colSpace = no; colSpace >=row ; colSpace--) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for (int row = 1; row <= no; row++) {
            for (int colSpace = row; colSpace >=1 ; colSpace--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= no-row+1; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }

    private void pattern15(int no) {
        System.out.println("\nExercise 15");
        for (int row = 1; row <= no; row++) {
            for (int colSpace = row; colSpace >=1 ; colSpace--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= no-row+1; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    private void pattern14(int no) {
        System.out.println("\nExercise 14");
        for (int row = 1; row <= no; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            for (int col1 = row-1; col1 >=1 ; col1--) {
                System.out.print(col1+" ");
            }
            System.out.println();
        }
    }

    private void pattern13(int no) {
        System.out.println("\nExercise 13");

        for (int row = 1; row <= no; row++) {
            for (int colSpace = no; colSpace >=row ; colSpace--) {
                System.out.print(" ");
            }
            int num = 1;
            for (int col = 1; col <=row ; col++) {
                System.out.print(num+" ");
                num = num * (row - col) / col;
            }
            System.out.println();
        }
    }

    private void pattern12(int no) {
        System.out.println("\nExercise 12");
        for (int row = 1; row <=no ; row++) {
            int val = row;
            for (int col = row; col >=1 ; col--) {
                System.out.print(val+" ");
                val = val + no;
            }
            System.out.println();
        }
    }

    private void pattern11(int no) {
        System.out.println("\nExercise 11");
        for (int row = 1; row <=no ; row++) {
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    private void pattern10(int no) {
        System.out.println("\nExercise 10");
        int val = 1;
        for (int row = 1; row <=no; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(val+" ");
                val++;
            }
            System.out.println();

        }

    }

    private void pattern9(int no) {
        System.out.println("\nExercise 9");
        for (int row = no; row >=1 ; row--) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    private void pattern8(int no) {
        System.out.println("\nExercise 8");
        for (int row = no; row >=1 ; row--) {
            for (int col = no; col >=row ; col--) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    private void pattern7(int no) {
        System.out.println("\nExercise 7");
        for (int row = 1; row <=no ; row++) {
            for (int col = no; col >=row ; col--) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    private void pattern6(int no) {
        System.out.println("\nExercise 6");
        for (int row = 1; row <= no; row++) {
            for (int colSpace = no; colSpace >=row ; colSpace--) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    private void pattern5(int no) {
        System.out.println("\nExercise 5");
        for (int row = no; row >=1 ; row--) {
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for (int row = 1; row <= no; row++) {
            for (int col = row; col >=1; col--) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    private void pattern4(int no) {
        System.out.println("\nExercise 4");
        for (int row = no; row >1 ; row--) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for (int row = 1; row <=no ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        
    }

    private void pattern3(int no) {
        System.out.println("\nExercise 3");
        for (int row = 1; row <= no ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for (int row =no; row >=1 ; row--) {
            for (int col = 1; col <=row  ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    private void pattern2(int no) {
        System.out.println("\nExercise 2");
        for (int row = 1; row <=no ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }

    private void pattern1(int no) {
        System.out.println("\nExercise 1");
        for (int row = 1; row <=no ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
