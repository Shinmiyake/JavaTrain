package Test1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class test1 {
    public static void main(String[] args) throws Exception {
        //参照するパスの指定
        String path =  "C:\\Users\\Owner\\OneDrive\\JavaTrain\\ideaPrograms\\Training1\\Training2\\src\\main\\java\\Test1\\test1.java";

        //テキストファイルを指定し、各行の値を算出するためのファイルを作成する
        File fi = new File("C:\\Users\\Owner\\OneDrive\\JavaTrain\\ideaPrograms\\Training1\\Training2\\src\\main\\java\\Test1\\test1.java");

        //指定したファイルを各行単位で読み込むことは効率が非常に悪いため、全体のファイルの読み込みを行う
        FileReader fileReader = new FileReader(fi);

        //読み込んだファイルのオブジェクトを作成する
        BufferedReader br = new BufferedReader(fileReader);


//        //関数のショートカット
//        File fi2 = new File(path);
//        BufferedReader br2 = new BufferedReader(new FileReader(fi2));
//        System.out.println(br2);
        //テキストファイル内の各行の値を読み込む





    }

}

