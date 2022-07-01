import org.example.RomanLiteral;

import java.util.List;

public class RomanNumerals {

    public String convert(int number) {
        StringBuilder result = new StringBuilder();
        List<RomanLiteral> romanLiterals = RomanLiteral.orderByDescending();

        for (RomanLiteral romanLiteral : romanLiterals) {

            while (number >= romanLiteral.value()) {

                result.append(romanLiteral.toString());
                number = number - romanLiteral.value();
            }
        }
        return result.toString();
    }
}
