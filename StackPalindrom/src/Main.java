import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

    public class Main {
        public static boolean isPalindrome(String str) {
            //Boşlukları ve noktalama işaretlerini kaldırma
            String s = str.toLowerCase().replaceAll("[^a-z0-9]", "");

            MyStack stack = new MyStack(50);

            int len = s.length();
            int mid = len / 2;

            // İlk yarıyı stack'e ekleme
            for (int i = 0; i < mid; i++) {
                stack.push(s.charAt(i));
            }

            // String'in ortasından başlayarak kalan karakterleri kontrol etme
            int start = mid + (len % 2 == 0 ? 0 : 1); // Orta karakteri atlama
            for (int i = start; i < len; i++) {
                //Stackten eleman alıyoruz ve karşılaştırıyoruz
                if (stack.pop() != s.charAt(i)) {
                    return false; //Eğer eşleşmiyorsa palindrom değildir.
                }
            }

            // Stack boşsa ve karakterler eşleşiyorsa, palindromdur.
            System.out.println("Palindrome: " + str);
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            String filePath = "Assignment.txt";
            try {
                List<String> lines = Files.readAllLines(Paths.get(filePath));
                for (String line : lines) {
                    isPalindrome(line);
                }
            } catch (IOException e) {
                System.out.println("Dosya okuma hatası: " + e.getMessage());
            }
        }
}

