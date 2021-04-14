package chapter1;

public class Question1_3_URLify {

    public static void main(String[] argv) {
        String url = "Mr John Smith";
        System.out.println("URLify: { " + url + " } to -> " + urlify(url));

        url = "https://www.microsoft.com/news/interview process";
        System.out.println("URLify: { " + url + " } to -> " + urlify(url));
    }

    private static String urlify(String url) {
        int numOfSpaces = numOfSpacesInString(url);
        char[] urlChars = new char[url.length() + numOfSpaces * 2];
        int urlCharsIndex = 0;
        for(int i = 0; i < url.length(); i++) {
            if(url.charAt(i) != ' ') {
                urlChars[urlCharsIndex] = url.charAt(i);
                urlCharsIndex++;
            } else {
                urlChars[urlCharsIndex] = '%';
                urlCharsIndex++;
                urlChars[urlCharsIndex] = '2';
                urlCharsIndex++;
                urlChars[urlCharsIndex] = '0';
                urlCharsIndex++;
            }
        }
        return new String(urlChars);
    }

    private static int numOfSpacesInString(String url) {
        int result = 0;
        for(Character character : url.toCharArray()) {
            if (character.equals(' ')) {
                result++;
            }
        }
        return result;
    }
}
