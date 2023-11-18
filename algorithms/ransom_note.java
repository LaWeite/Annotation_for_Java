/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //Составим магазин, каких и сколько букв у нас есть
        int[] countOfLetters = new int[26];
        for (char element : magazine.toCharArray()) {
            ++countOfLetters[element - 'a'];
        }

        //проходимся и уменьшаем на один количество буквы
        for (char element : ransomNote.toCharArray()) {
            --countOfLetters[element - 'a'];
            if (countOfLetters[element - 'a'] < 0) return false;
        }

        return true;
    }
}
