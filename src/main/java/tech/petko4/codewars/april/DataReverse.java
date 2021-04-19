package tech.petko4.codewars.april;

import java.util.Arrays;


public class DataReverse {

    /*
     * A stream of data is received and needs to be reversed.

        Each segment is 8 bits long, meaning the order of these segments needs to be reversed, for example:
        
        11111111  00000000  00001111  10101010
         (byte1)   (byte2)   (byte3)   (byte4)
        should become:
        
        10101010  00001111  00000000  11111111
         (byte4)   (byte3)   (byte2)   (byte1)
        The total number of bits will always be a multiple of 8.
        
        The data is given in an array as such:
        
        [1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0]
        Note: In the C and NASM languages you are given the third parameter which is the number of segment blocks.
     */
    
    
    public static int[] dataReverse(int[] data) {
        int reversed[] = new int[data.length];
        
        for(int i = 0; i < data.length; i+=8) {
            System.arraycopy(data, i, reversed, data.length - 8 - i, 8);
        }
        
        return reversed;
        
        
//        int[][] dividedArrays = new int[data.length / 8][8];
//        int dataIndex = 0;
//        int arrayCounter = (data.length / 8) - 1 ;
//        int bitCounter = 0;
//        
//        while(dataIndex < data.length && arrayCounter >= 0) {
//            
//            dividedArrays[arrayCounter][bitCounter] = data[dataIndex];
//            
//            bitCounter++;
//            dataIndex++;
//            
//            if(bitCounter == 8 ) {
//                bitCounter = 0;
//                arrayCounter--;
//            }
//        }
//        
//        
//        return Arrays.stream(dividedArrays)
//                .flatMapToInt(Arrays::stream)
//                .toArray();
        
        
    }
}
