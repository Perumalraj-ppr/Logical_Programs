package PatternPrograms;

public class Patterns {
    public static void main(String[] args) {
        pyramidProgram(10);
        System.out.println();
        rightTriangle(5);
        System.out.println();
        leftTriangle(5);
        System.out.println();
        diamond(5);
        System.out.println();
        downwardTriangle(5);
        System.out.println();
        printNums(5);
        System.out.println();
        // string();
        pyramidPatternnum(5);
        System.out.println();
        pyramid();
        System.out.println();
        pattern1(5);
        System.out.println();
        pattern2(5);
    }

    static void string() {
        String s = "perumal";
        s = "Raj";
        System.out.println(s);
        s = s.concat("raj");
        System.out.println(s);
    }





    public static void printNums(int n)
    {
        System.out.println("printNums : ");
        int i, j,num;

        for(i=0; i<n; i++) // outer loop for rows
        {
            num=1;
            for(j=0; j<=i; j++) // inner loop for rows
            {
                // printing num with a space
                System.out.print(num+ " ");

                //incrementing value of num
                num++;
            }

            // ending line after each row
            System.out.println();
        }
    }
    static void downwardTriangle(int no) {
        /**
         *  *****
         *  ****
         *  ***
         *  **
         *  *
         */
        System.out.println("downwardTriangle :");
        int num = no;
        for (int row = 1; row <= no; row++) {
            for (int colcontent = 1; colcontent <=no-row+1 ; colcontent++) {
                System.out.print("*");
            }
            System.out.println();
            //num -= 1;
        }



    }

    static void diamond(int no) {
        /**
         *       *
         *      ***
         *     *****
         *    *******
         *   *********
         *    *******
         *     *****
         *      ***
         *       *
         */
        System.out.println("Diamond :");
        int num = 1;
        for (int row = 1; row <=no ; row++) {
            for (int space = 1; space <=no-row ; space++) {
                System.out.print(" ");
            }
            for (int colcontent = 1; colcontent <=num ; colcontent++) {
                System.out.print("*");
            }
            System.out.println();
            num += 2;
        }
        /**
         *  *******
         *   *****
         *    ***
         *     *
         */
        int row1=4;
        int num1=7;
        for (int row = 1; row <=row1 ; row++) {
            for (int space = 0; space <row ; space++) {
                System.out.print(" ");
            }
            for (int colcontent = 1; colcontent <=num1 ; colcontent++) {
                System.out.print("*");
            }
            System.out.println();
            num1 -= 2;
        }
    }

    static void leftTriangle(int no) {
        System.out.println("leftTriangle :");
        for (int row = 1; row <=no ; row++) {
            for (int space =1; space <=no-row ; space++) {
                System.out.print(" ");
            }
            for (int colcontent = 1; colcontent <=row ; colcontent++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rightTriangle(int no) {
        System.out.println("rightTriangle :");
        for (int row = 1; row <=no ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pyramidProgram(int no) {
        System.out.println("pyramidProgram :");
        for (int row = 1; row <=no ; row++) {
            for (int space = 1; space <=no-row ; space++) {
                System.out.print(" ");
            }
            for (int colcontent = 1; colcontent <=row ; colcontent++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int no) {
        /**
         *  * * * * *
         *   * * * *
         *    * * *
         *     * *
         *      *
         */
        int num = 1;
        for (int row = 1; row <=5; row++) {
            for (int space = 1; space <row ; space++) {
                System.out.print(" ");
            }
            for (int colcontent = 1; colcontent <=no-row+1 ; colcontent++) {
                System.out.print(num+" ");
            }
            System.out.println();
            num += 2;
        }



    }
    static void pattern1(int no) {
        int num = 1;
        for (int row = 0; row <= no; row++) {
            for (int col = 0; col <=row; col++) {
                System.out.print(num+" ");
                num +=1;
            }
            System.out.println();
        }
    }
    static void pyramidPatternnum(int no) {
        /**
         *       1
         *      333
         *     55555
         *    7777777
         *   999999999
         */
        int num = 1;
        for (int row = 1; row <= no; row++) {
            for (int space = 0; space <5-row ; space++) {
                System.out.print(" ");
            }
            for (int colcontent = 0; colcontent <num ; colcontent++) {
                System.out.print(num);
            }
            System.out.println();
            num += 2;
        }
    }
    static void loop() {
        int row = 5;
        for (int i = 0; i < row; i++) {      //0<5   1<5
            for (int j = 0; j <= i; j++) {   //0<=0  0<=1 1<=1 2<=1
                System.out.print("* ");     //output
            }                                //*
            System.out.println();            //**
        }                                    //
    }
    static void pyramid() {
        int no = 5;
        int num1 = 1;
        for (int row = 1; row <= no; row++) {
            for (int col =1; col <=row; col++) {
                System.out.print("s ");
            }
            System.out.println();
        }
    }
}
