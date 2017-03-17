public class Swap implements Processor {

    public String process(Object s) {
        char[] c = ((String)s).toCharArray();
        if(c.length % 2 != 0) {
            throw new IllegalArgumentException("Error - Can't swap characters if uneven number of them!");
        }

        for(int i = 0; i < c.length; i++) {
            if(i % 2 == 0) {
                char temp = c[i];
                c[i] = c[i+1];
                c[i+1] = temp;
            }
        }

        return new String(c);
    }
}
