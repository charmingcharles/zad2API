package com.stringapi.api;

public class StringCounter {
    public static StringCount count(String str)
    {
        int upper = 0, lower = 0, number = 0, special = 0;
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                upper++;
            else if (ch >= 'a' && ch <= 'z')
                lower++;
            else if (ch >= '0' && ch <= '9')
                number++;
            else
                special++;
        }
        return new StringCount(upper, lower, special, number);
    }
}
