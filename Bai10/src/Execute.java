public class Execute {
    public void Sovle(String right){
        String[] words = right.split(" ");
        String left = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            left = left + reverseWord + " ";
        }
        System.out.print("Output: " +left);
    }
}
