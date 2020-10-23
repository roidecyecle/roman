package roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanConverterShould {

    @Test
    public void convert_1_into_I(){
        //GIVEN
        int input = 1;
        String expected = "I";
        RomanConverter convert = new RomanConverter();
        //WHEN
        String result = convert.convert(input);
        //THEN
        assertEquals(expected, result);

    }

    @Test
    public void convert_2_into_II(){
        //GIVEN
        int input = 2;
        String expected = "II";
        RomanConverter convert = new RomanConverter();
        //WHEN
        String result = convert.convert(input);
        //THEN
        assertEquals(expected, result);

    }

    @Test
    public void convert_3_into_III(){
        //GIVEN
        int input = 3;
        String expected = "III";
        RomanConverter convert = new RomanConverter();
        //WHEN
        String result = convert.convert(input);
        //THEN
        assertEquals(expected, result);

    }

    @Test
    public void convert_10_into_X(){
        //GIVEN
        int input = 10;
        String expected = "X";
        RomanConverter convert = new RomanConverter();
        //WHEN
        String result = convert.convert(input);
        //THEN
        assertEquals(expected, result);

    }

    @Test
    public void convert_20_into_XX(){
        //GIVEN
        int input = 20;
        String expected = "XX";
        RomanConverter convert = new RomanConverter();
        //WHEN
        String result = convert.convert(input);
        //THEN
        assertEquals(expected, result);

    }

    @Test
    public void convert_30_into_XXX(){
        //GIVEN
        int input = 30;
        String expected = "XXX";
        RomanConverter convert = new RomanConverter();
        //WHEN
        String result = convert.convert(input);
        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void convert_11_into_XI(){
        //GIVEN
        int input = 11;
        String expected = "XI";
        RomanConverter convert = new RomanConverter();
        //WHEN
        String result = convert.convert(input);
        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void convert_5_into_V(){
        //GIVEN
        int input = 5;
        String expected = "V";
        RomanConverter convert = new RomanConverter();
        //WHEN
        String result = convert.convert(input);
        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void convert_4_into_IV(){
        //GIVEN
        int input = 4;
        String expected = "IV";
        RomanConverter convert = new RomanConverter();
        //WHEN
        String result = convert.convert(input);
        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void convert_9_into_IX(){
        //GIVEN
        int input = 9;
        String expected = "IX";
        RomanConverter convert = new RomanConverter();
        //WHEN
        String result = convert.convert(input);
        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void convert_40_into_XL(){
        //GIVEN
        int input = 40;
        String expected = "XL";
        RomanConverter convert = new RomanConverter();
        //WHEN
        String result = convert.convert(input);
        //THEN
        assertEquals(expected, result);
    }

}
