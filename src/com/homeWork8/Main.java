//homeWork9CodingBatArray2
package com.homeWork8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 6, 1, 7, 1, 7, 1, 6, 1, 7, 1};
//        int newArray1 =
        sum67(myArray);
//        System.out.println(newArray1);
    }

    static void sum67(int[] nums) {
        boolean start = true;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {//{1, 6, 1,  7, 1}
            if (nums[i] == 6) {
                start = false;
            }
            if (!start && nums[i] == 7) {
                start = true;
                continue;
            }
            if (start) {
                res += nums[i];
            }
            System.out.println(" i " + i + " start " + start + " res " + res);
        }
//        return res;
        System.out.println(Arrays.toString(nums));
        System.out.println(res);
    }


}


// почти решил
//package com.helloWorld;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class HashMap {
//
//
//    public static void main(String[] args) {
//        int[] myArray = new int[]{1, 6, 1, 1, 7, 1};//2 , 1, 6, 99, 99, 7
////        int neededSum =
//        sum67(myArray);
////        System.out.println(neededSum);
//    }
//
//    //    Return the sum of the numbers in the array,
////    except ignore sections of numbers starting with a 6
////    and extending to the next 7
////    (every 6 will be followed by at least one 7).
////    Return 0 for no numbers.
////
////               {1, 2, 3, 4, 5, 6, 8, 7};
////        sum67([1, 2, 2]) → 5
////        sum67([1, 2, 2, 6, 99, 99, 7]) → 5
////        sum67([1, 1, 6, 7, 2]) → 4
//    static void sum67(int[] nums) {
//        int start = 1;
//        int cnt = 0;
//        int end = 0;
//        int res = 0;
//        int seven = 0;
////        while (cnt < nums.length) {
//
//        for (int i = 0; i < nums.length; i++) {
//            end = i;
//            if (nums[i] == 6) {
//                start = i;
//                end = end + 1;
//                System.out.println("nums i = " + nums[i]);
//            }
//            if (nums[i] == 7) {
//                start = end + 1;
//                System.out.println(end + " " + start);
//                System.out.println("nums i = " + nums[i]);
//
//            }//{1, 6, 2, 7, 1}
//            if (nums[i] != 6 && start > end || nums[i] == 7 && start < seven) {
//                res += nums[i];
//                System.out.println("res = " + res);
//            }
//            System.out.println("i = " + i);
//            System.out.println("start = " + start);
//            System.out.println("end = " + end);
//            start++;
//            end ++;
//        }
//        System.out.println("\ntotal = " + res);
////        }
//        System.out.println(Arrays.toString(nums));
////        return res;
//    }
//}


////This is slightly more difficult version of the famous FizzBuzz problem
//// which is sometimes given as a first problem for job interviews.
//// (See also: FizzBuzz Code.)
//// Consider the series of numbers beginning at start
//// and running up to but not including end,
//// so for example start=1 and end=5 gives the series 1, 2, 3, 4.
//// Return a new String[] array containing the string form of these numbers,
//// except for multiples of 3, use "Fizz" instead of the number,
//// for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
//// In Java, String.valueOf(xxx) will make the String form of an int or other type.
//// This version is a little more complicated than the usual version
//// since you have to allocate and index into an array instead of just printing,
//// and we vary the start/end instead of just always doing 1..100.
////
////
////        fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]
////        fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
////        fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]
//
//package com.helloWorld;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class HashMap {
//
//
//    public static void main(String[] args) {
//
////        String[] toBePrinted = fizzBuzz(1, 10);
//        System.out.println(Arrays.toString(fizzBuzz(50, 56)));
////        System.out.println(Arrays.toString(fizzBuzz));
//    }
//
//    static String[] fizzBuzz(int start, int end) {
//        String[] newArray = new String[end - start];
//        String toFizzBuzz = "FizzBuzz";
//        String toFizz = "Fizz";
//        String toBuzz = "Buzz";
//        int cnt = 0;
//        for (int i = start; i < end; i++) {
//            if (i != 1) {
//                if (i % 3 == 0 && i % 5 == 0) {
//                    newArray[cnt] = toFizzBuzz;
//                } else if (i % 3 == 0) {
//                    newArray[cnt] = toFizz;
//                } else if (i % 5 == 0) {
//                    newArray[cnt] = toBuzz;
//                } else {
//                    newArray[cnt] = "" + i;
//                }
//            }else newArray[cnt] = "" + i;
//            cnt++;
//        }
//        return newArray;
//    }
//}
//Конец физбазаж

//
//Return a version of the given array where all the 10's have been removed.
// The remaining elements should shift left towards the start of the array as needed,
// and the empty spaces at the end of the array should be 0.
// So {1, 10, 10, 2} yields {1, 2, 0, 0}.
// You may modify and return the given array or make a new array.
//
//
//        withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
//        withoutTen([10, 2, 10]) → [2, 0, 0]
//        withoutTen([1, 99, 10]) → [1, 99, 0]

// первый варик, работает не до конца
//package com.helloWorld;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class HashMap {
//
//
//    public static void main(String[] args) {
//        Random rnd = new Random();
////        int newRnd1 = rnd.nextInt((16 - 8) + 1) + 2;
////        int newRnd2 = rnd.nextInt((16 - 8) + 1) + 2;
//////        int newRnd3 = rnd.nextInt((16 - 8) + 1) + 2;
////        int newRnd4 = rnd.nextInt((16 - 8) + 1) + 2;
//
//        int[] newArray = new int[]{10, 13, 10, 14};//4, 1, 2, 3
//        System.out.println(Arrays.toString(newArray));
//        int[] toBePrinted = withoutTen(newArray);
//
//        System.out.println(Arrays.toString(toBePrinted));
//    }
//
//    static int[] withoutTen(int[] nums) {
//        int moveToFront = 0;
//        int cnt = 1;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums.length == 1 && nums[i] == 10) {
//                nums[i] = 0;
//            }
//            if (cnt < nums.length) {
//                if (nums[nums.length - cnt] != 10) {
//                    if (nums[i] == 10) {
//                        moveToFront = nums[nums.length - cnt];
//                        nums[i] = moveToFront;
//                        nums[nums.length - cnt] = 0;
//                        cnt++;
//                    }
//                } else {
//                    if (nums[i] == 10) {
//                        moveToFront = nums[nums.length - cnt - 1];
//                        nums[i] = moveToFront;
//                        nums[nums.length - cnt] = 0;
//                        cnt++;
//                    }
//                }
//            }
//        }
//        return nums;
//    }
//
//
//}


////второй варик работает полностью
//package com.helloWorld;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class HashMap {
//
//
//    public static void main(String[] args) {
//        Random rnd = new Random();
////        int newRnd1 = rnd.nextInt((16 - 8) + 1) + 2;
////        int newRnd2 = rnd.nextInt((16 - 8) + 1) + 2;
//////        int newRnd3 = rnd.nextInt((16 - 8) + 1) + 2;
////        int newRnd4 = rnd.nextInt((16 - 8) + 1) + 2;
//
//        int[] newArray = new int[]{1, 10, 10, 2};//4, 1, 2, 3
//        System.out.println(Arrays.toString(newArray));
//        int[] toBePrinted = withoutTen(newArray);
//
//        System.out.println(Arrays.toString(toBePrinted));
//    }
//
//    static int[] withoutTen(int[] nums) {
//
//        int moveToFront = 0;
//        int moveFromEnd = 0;
//        int cnt = 1;
//        int z = 0;
//        while (z < nums.length) {
//            for (int i = 0; i < nums.length; i++) {
//                if (nums.length == 1 && nums[i] == 10) {
//                    nums[i] = 0;
//                }
//                if (i < nums.length - cnt) {
//                    if (nums[i] == 10) {
//                        if (nums[i + 1] != 10) {
//                            moveToFront = nums[i + 1];
//                            nums[i] = moveToFront;
//                            moveFromEnd = nums[nums.length - cnt];
//                            nums[i + 1] = moveFromEnd;
//                        } else {
//                            moveToFront = nums[i + 2];
//                            nums[i] = moveToFront;
//                            moveFromEnd = nums[nums.length - cnt];
//                            nums[i + 2] = moveFromEnd;
//                        }
//                        nums[nums.length - cnt] = 0;
//                        cnt++;
//                    }
//                }
//            }
//            if (nums[z]==10){
//                nums[z]=0;
//            }
//            z++;
//        }
//        return nums;
//    }
//}


//package com.helloWorld;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class HashMap {
//
//    public static void main(String[] args) {
//        Random rnd = new Random();
//        int newRnd1 = rnd.nextInt((9 - 2) + 1) + 2;
//        int newRnd2 = rnd.nextInt((9 - 2) + 1) + 2;
//        int newRnd3 = rnd.nextInt((9 - 2) + 1) + 2;
//        int newRnd4 = rnd.nextInt((9 - 2) + 1) + 2;
//
//        int[] newArray = new int[]{newRnd1, newRnd2, newRnd3, newRnd4};//4, 1, 2, 3
//        int[] usableArray = post4(newArray);
//        System.out.println(Arrays.toString(usableArray));
//    }
//
//    public static int[] post4(int[] nums) {
//        int start = 0;
//        int cnt = 0;
//        while (cnt < nums.length) {
//            if (nums[cnt] == 4) {
//                start = cnt;
//            }
//            if (cnt == nums.length - 1) {
//                int[] secondArray = new int[nums.length - start - 1];
//                for (int i = 0; i < nums.length - start - 1; i++) {
//                    secondArray[i] = nums[start + i + 1];
//                }
//                return secondArray;
//            }
//            cnt++;
//        }
//        return nums;
//    }
//
//}
//
//
//// тут работает а в codingbat нет
////package com.helloWorld;
////import java.util.Arrays;
////public class HashMap {
////    public static void main(String[] args) {
////        int[] newArray = new int[]{4, 4 };//4, 1, 2, 3
////        int length = newArray.length;
////        int start = 0;
////        int cnt = 0;
////        while (cnt < length) {
////            if (newArray[cnt] == 4) {
////                start = cnt;
////            }
////            if (cnt == newArray.length-1) {
////                int[] secondArray = new int[newArray.length-start-1];
////                for (int i = 0; i <newArray.length-start-1 ; i++) {
////                    secondArray[i] = newArray[start+i+1];
////                    System.out.println(secondArray[i]);
////                }
////            }
////            cnt++;
////        }
////        System.out.println("Start= "+ (start+1));
////    }
////}
////        }
////    }
//
////
////    {
////        if (nums[cnt] == 4) {
////            start += 1;
////        }
////        public static void main (String[]args){
////
////    }
////    }
//
//
////
////
////public int[] post4(int[] nums) {
////        if(nums.length<2) return new int[]{};
////        else{
////        int start = 0;
////        int cnt =0;
////        while(cnt<nums.length){
////        if (nums[cnt]==4){
////        start+=1;
////        }
////        if(cnt==nums.length-1){
////        int[] newArray = new int[2];
////        for(int i =0; i<nums.length-1-start; i++){
////        newArray[i]=nums[start+1];
////        start++;
////        }
////        return newArray;
////        }
////        cnt++;
////        }
////        }
////        return nums;
////        }
//
//
//////Given a non-empty array of ints, return a new array
////// containing the elements from the original array that
////// come after the last 4 in the original array.
////// The original array will contain at least one 4.
////// Note that it is valid in java to create an array of length 0.
//////
//////
//////        post4([2, 4, 1, 2]) → [1, 2]
//////        post4([4, 1, 4, 2]) → [2]
//////        post4([4, 4, 1, 2, 3]) → [1, 2, 3]
////
////
////package com.helloWorld;
////import java.util.Arrays;
////public class HashMap {
////
////    public static int com.temp =0;
////    public static int[] j = new int[]{2,4,1,2};
////
////    public static void main(String[] args) {
////        shiftLeft(j);
////        System.out.println(j);
////    }
////
////
////    public static int[] shiftLeft(int[] nums) {
////        if(nums.length>0){
////            com.temp=nums[0];
////        }
////        for (int i=0; i< nums.length; i++){
////            if(nums.length>0){
////                if (i<nums.length-1){
////                    nums[i]=nums[1+i];
////                }else nums[i]=com.temp;
////            }
////        }
////        return nums;
////    }
//////    public static int[] post4(int[] nums) {
//////        int length=0;
//////        int[] newArray=new int[0];//создаем новый массив, длиной = 0
//////        for(int i=0; i<nums.length;i++){//иницилизируем проверку массива
//////            if (nums.length>0) newArray[i]=nums[i];
//////            else break;
//////
////////            newArray = Arrays.copyOf(newArray, newArray.length + 1);
//////        }
//////        return newArray;
//////    }
////
////}
