package topic3;

public class T_44_ReverseSentence {
    public String ReberseSentence(String str) {
        if (str.trim().length() == 0) {
            return str;
        }
        String[] temp = str.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = temp.length - 1; i >= 0; i--) {
            res.append(temp[i]);
            if (i != 0) {
                res.append(" ");
            }
        }
        return res.toString();
    }
}
