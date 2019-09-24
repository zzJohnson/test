package com.demo.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@WebServlet("/uploadServlet")
public class UploadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            upload(request,response);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    //上传至本地磁盘
    public void upload (HttpServletRequest request, HttpServletResponse response) throws FileUploadException, IOException {

        //1、穿件一个磁盘工厂对象
        DiskFileItemFactory factory = new DiskFileItemFactory();

        //2、通过磁盘工厂对象获取上传对象
        ServletFileUpload upload = new ServletFileUpload(factory);
        System.out.println(upload);

        //3、通过上传对象解析请求
        List<FileItem> list = upload.parseRequest(request);

        //4、遍历集合
        for (FileItem fileItem:list){
            System.out.println("文件信息-----------------");
            System.out.println(fileItem);

            //5、怕不断是否为文件或表单文本信息
            if (!fileItem.isFormField()){
                //6、通过请求获取IO流
                InputStream is = fileItem.getInputStream();
                //7、创建一个输出流
                //获取到上传路径
                String uploadPath = "E:\\Java1907\\upload\\"+fileItem.getName();
                System.out.println("上传路径"+uploadPath);
                FileOutputStream fos = new FileOutputStream(uploadPath);

                //8、文件读写操作
                byte[] buff = new byte[1024];
                int len=0;
                while((len=is.read(buff))!=-1){
                    //将输入流的数据读取到缓冲区，然后用输出流写到文件里面
                    fos.write(buff,0,len);
                }

                //9、关闭资源
                fos.close();
                is.close();

            }

        }



    }
}
