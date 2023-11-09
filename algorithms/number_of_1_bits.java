/*
Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

Note:
Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type.
It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.
*/

//1
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}

//2
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int i) {
        i = i - ((i >>> 1) & 0x55555555);
        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
        i = (i + (i >>> 4)) & 0x0f0f0f0f;
        i = i + (i >>> 8);
        i = i + (i >>> 16);
        return i & 0x3f;
    }
}

//3
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String bits = Integer.toBinaryString(n);

        int result = 0;
        for (int index = 0; index < bits.length(); ++index) {
            if (bits.charAt(index) == '1') {
                ++result;
            }
        }

        return result;
    }
}

//4
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        
        for (int index = 0; index < 32; ++index) {
            if ((n & 1) == 1) {
                ++result;
            }

            n = n >>> 1;
        }

        return result;
    }
}
