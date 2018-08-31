package main.file;

import java.io.File;

public class Rename {
    public static void main(String args[]){
        File root = new File("F:/配花生嘎嘣嘎嘣");
        try {
            RenameFile(root);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    final static void  RenameFile(File dir) throws Exception{
        File[] files = dir.listFiles();
        for(int i = 0;i < files.length;i++){
            //原名
            String name = files[i].getName();
            //拼接新名
            String rootpath = files[i].getParent();
            String newname = (int)(Math.random()*1000) + name;
            File dest = new File(rootpath + File.separator + newname);
            if(files[i].renameTo(dest)){
                System.out.println("successful rename the file");
            }else {
                System.out.println("fault to rename the file");
            }
        }
    }
}
