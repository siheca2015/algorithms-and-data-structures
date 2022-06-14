package com.siheca.algorithms.anagram;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class AnagramController {
    private static Logger logger = LoggerFactory.getLogger(AnagramController.class);

    public static void main(String[] args){
        String data = "Clint Eastwood ";
        String dataToCompare = "old west action";

        String dataFixed = fixedString(data);
        String dataToCompareFixed = fixedString(dataToCompare);

        char [] dataArray = convertStringToCharArray(dataFixed);
        char [] dataToCompareArray = convertStringToCharArray(dataToCompareFixed);
        boolean response = validateIfAreAnagram(dataArray,dataToCompareArray);
        logger.info("Are anagrams? " + (response?"Yes":"No"));
    }

    private static String fixedString(String data) {
        return data.replaceAll("\\s","");
    }

    private static char [] convertStringToCharArray(String data){
        return data.toLowerCase().toCharArray();
    }

    private static boolean validateIfAreAnagram(char[] dataArray, char[] dataToCompareArray) {
        if(dataArray.length!= dataToCompareArray.length){
            return false;
        }
        Arrays.sort(dataArray);
        Arrays.sort(dataToCompareArray);
        return Arrays.equals(dataArray,dataToCompareArray);
    }
}
