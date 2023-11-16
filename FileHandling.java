package Task19;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class FileHandling  {


static void CreateFile(String fileName) throws Exception{  
     
        File file=new File(fileName);
        file.createNewFile();
}

static void WriteToFile(String fileName , String Data)throws Exception{
    
    FileWriter file=new FileWriter(fileName,true);
    file.write(Data);
    file.close();

}

static void ReadFromFile(String fileName)throws Exception{
    FileReader fr=new FileReader(fileName);

    String text="";

    int ascii;
    while((ascii=fr.read())!=-1){

        text +=String.valueOf((char)ascii);
    }
    System.out.println(text);
    fr.close();
    
}

static void AppendData(String fileNmae,String Data)throws Exception{

    FileWriter fw=new FileWriter(fileNmae,true);
    fw.write(Data);
    fw.close();
}


static void RenameFile(String oldFileName,String newFileName)throws Exception{
    File oldFile=new File(oldFileName);
    File newFile=new File(newFileName);

    oldFile.renameTo(newFile);


}


static void DeleteFile(String fileName)throws Exception{
    File file=new File(fileName);
    file.delete();
}


    public static void main(String[] args) throws Exception{

     CreateFile("sumadeep");

     //WriteToFile("sumadeep", "hi,today is diwali");

     //ReadFromFile("sumadeep");

     //AppendData("sumadeep", "\ntomorrow is holiday");
     
     //System.out.println();
     
     ReadFromFile("sumadeep");

     RenameFile("sumadeep", "deepu");

    DeleteFile("sumadeep");  
    }
    
}
