package Week_4_Calculator;


import java.util.*;

public class Calculator
{
    private String invoerString;
    int resultaat;

    public Calculator (String invoer)
    {
        this.invoerString = invoer;
        evaluate();
    }

    public int getResultaat()
    {
        return (resultaat);
    }

    private void evaluate()
    {
        Stack mystack = new ListStack();
        StringTokenizer st = new StringTokenizer(invoerString);
        while (st.hasMoreTokens())
        {
            String token = st.nextToken();
            char eerste = token.charAt(0); // het eerste karakter van elk token
            if (( eerste >= '0') && (eerste <= '9')) {
                mystack.push(token);
            }
            else
            {
                int v1 = Integer.parseInt(mystack.pop().toString()); // poppen en omzetten van een String naar int
                int v2 = Integer.parseInt(mystack.pop().toString());// idem
                int result = 0;
                switch (eerste)
                {
                    case '+' : result = v1 + v2;
                        break;
                    case '*' : result = v1 * v2;
                        break;
                    case '-' : result = v1 - v2;
                        break;
                }
                mystack.push(result); // wat doe je met het resultaat? zie algoritme
                System.out.println(result);
            }
        }
        resultaat = Integer.parseInt(mystack.pop().toString()); // als alles goed is gegaan resultaat
    }                       // poppen en omzetten naar een int

}
