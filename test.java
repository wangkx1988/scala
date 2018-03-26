public class test {
    public static void main(String[] args) {
        String str="zhangsan,18,192.168.36.22,8.8.8.8";
        String[] str1 = str.split(",");

        for (int i = 0; i < str1.length; i++) {
            System.out.println(str1[i]);
        }
    }
}
