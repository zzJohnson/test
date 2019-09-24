package com.demo.servlet;

import com.demo.utils.DownLoadUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downloadServlet")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1、获取文件的名称
        String filename = request.getParameter("filename");
        //2、使用字节输入流加载文件进内存
        //2-1、获取文件真是路径
        String realPath = request.getServletContext().getRealPath("/img/"+filename);
        //2-2、使用字节流关联
        FileInputStream fis = new FileInputStream(new File(realPath));
        //3、设置响应头
        //3-1、设置响应头类型：context-type
        String mimeType = request.getServletContext().getMimeType(filename);
        response.setHeader("context-type",mimeType);

        //解决中文命名问题
        //a、获取user-agent请求头
        String agent = request.getHeader("user-agent");
        //b、使用工具类方法编码文件名
        String fileName2 = DownLoadUtils.getFileName(agent,filename);

        //3-2设置响应头打开方式：context-disposition
        response.setHeader("content-disposition","attachment;filename="+fileName2);

        //4、将输入流的数据写出到输出流
        ServletOutputStream outputStream = response.getOutputStream();
        byte[] buff = new byte[1024*8];

        int len=0;
        while ((len=fis.read(buff))!=-1){
            outputStream.write(buff,0,len);
        }

        fis.close();


    }
}
