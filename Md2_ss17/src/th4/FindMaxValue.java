package th4;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (Integer number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_MUNBER = "D:\\java_md2\\Md2_ss17\\src\\th4\\number.txt";
        String PATH_RESULT = "D:\\java_md2\\Md2_ss17\\src\\th4\\result.txt";
        List<Integer> numbers = readAndWriteFile.readFile(PATH_MUNBER);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(PATH_RESULT, maxValue);
    }
}
