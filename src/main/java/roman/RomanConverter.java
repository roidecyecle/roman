package roman;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RomanConverter {

    static enum RomanLiteral {
        I(1),
        IV(4),
        V(5),
        IX(9),
        X(10),
        XL(40);

        int value;

        RomanLiteral(int value) {
            this.value = value;
        }

        public static List<RomanLiteral> literalsDecrementOrder(){
            List<RomanLiteral> literals = Arrays.asList(RomanLiteral.values());
            Collections.reverse(literals);
            return literals;
        }
    }

    static class ResultBuilder{
        int rest;
        StringBuilder result = new StringBuilder();

        public ResultBuilder(int rest) {
            this.rest = rest;
        }

        public String format() {
            return result.toString();
        }

        public void append(String name){
            result.append(name);
        }

        private void compute(RomanLiteral literal) {
            while(rest >= literal.value){
                append(literal.name());
                rest -= literal.value;
            }
        }
    }

    public String convert(int number) {
        ResultBuilder restBuilder = new ResultBuilder(number);

        for(RomanLiteral literal : RomanLiteral.literalsDecrementOrder()){
            restBuilder.compute(literal);
        }
       return restBuilder.format();
    }

}
